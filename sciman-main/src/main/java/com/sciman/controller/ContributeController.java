package com.sciman.controller;

import com.sciman.dto.contribution.ContributionQueryParam;
import com.sciman.service.ContributionService;
import com.sciman.utils.result.Result;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/contribution")
@Slf4j
@RequiredArgsConstructor
public class ContributeController {
    private final ContributionService contributionService;

    @PostMapping("/list")
    public Result listContribution(@RequestBody ContributionQueryParam queryParam) {
        return Result.success(contributionService.listContribution(queryParam));
    }
}
