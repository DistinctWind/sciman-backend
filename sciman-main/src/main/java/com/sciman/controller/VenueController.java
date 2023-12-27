package com.sciman.controller;

import com.sciman.service.VenueService;
import com.sciman.utils.result.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/venue")
@CrossOrigin
@RequiredArgsConstructor
public class VenueController {
    private final VenueService venueService;
    @GetMapping("/listAll")
    public Result listAll() {
        return Result.success(venueService.getAllVenue());
    }
}
