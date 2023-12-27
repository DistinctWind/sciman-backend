package com.sciman.controller;

import com.sciman.dto.venue.VenueQueryParam;
import com.sciman.service.VenueService;
import com.sciman.utils.result.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/list")
    public Result list(@RequestBody VenueQueryParam queryParam) {
        return Result.success(venueService.getVenueViewFor(queryParam));
    }
}
