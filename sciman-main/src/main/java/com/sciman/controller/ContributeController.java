package com.sciman.controller;

import com.sciman.dto.contribution.ContributionQueryParam;
import com.sciman.pojo.Contribution;
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

    @DeleteMapping("/delete/{id}")
    public Result deleteContribution(@PathVariable Long id) {
        if (contributionService.deleteContribution(id)) {
            return Result.success();
        } else {
            return Result.fail("删除失败");
        }
    }

    @PutMapping("/add")
    public Result addContribution(@RequestBody Contribution contribution) {
        if (contributionService.addContribution(contribution)) {
            return Result.success();
        } else {
            return Result.fail("添加失败：不能向All Achievement添加Contribution");
        }
    }
}
