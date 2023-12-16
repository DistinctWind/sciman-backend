package com.sciman.controller;

import com.sciman.service.ResearcherService;
import com.sciman.utils.result.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/person/researcher")
public class ResearcherController {
    private final ResearcherService researcherService;

    @GetMapping("/listAll")
    public Result listAll() {
        return Result.success(researcherService.listAllResearcherView());
    }
}
