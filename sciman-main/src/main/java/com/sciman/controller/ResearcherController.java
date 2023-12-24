package com.sciman.controller;

import com.sciman.dto.researcher.QueryParam;
import com.sciman.service.ResearcherService;
import com.sciman.utils.result.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/list")
    public Result list(@RequestBody QueryParam param) {
        return Result.success(researcherService.listResearcherViewFor(param));
    }
}
