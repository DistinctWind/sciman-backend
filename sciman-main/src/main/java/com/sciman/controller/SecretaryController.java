package com.sciman.controller;

import com.sciman.service.SecretaryService;
import com.sciman.utils.result.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/person/secretary")
@RequiredArgsConstructor
public class SecretaryController {
    private final SecretaryService secretaryService;
    @GetMapping("/listAll")
    public Result listAll() {
        return Result.success(secretaryService.getAllResearcherView());
    }


}
