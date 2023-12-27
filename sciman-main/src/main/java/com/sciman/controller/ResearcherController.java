package com.sciman.controller;

import com.sciman.dto.researcher.ResearcherQueryParam;
import com.sciman.pojo.Researcher;
import com.sciman.service.ResearcherService;
import com.sciman.utils.result.Result;
import com.sciman.vo.person.ResearcherView;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/person/researcher")
public class ResearcherController {
    private final ResearcherService researcherService;

    @GetMapping("/listAll")
    public Result listAll(@RequestParam(required = false) Long laboratoryId) {
        List<ResearcherView> result = researcherService.listAllResearcherView(laboratoryId);
        if (result != null && !result.isEmpty()) {
            return Result.success(result);
        } else {
            return Result.fail("no researcher found");
        }
    }

    @PostMapping("/list")
    public Result list(@RequestBody ResearcherQueryParam param) {
        return Result.success(researcherService.listResearcherViewFor(param));
    }

    @GetMapping("/detail/{id}")
    public Result detail(@PathVariable Long id) {
        Researcher researcher = researcherService.getResearcherView(id);
        if (researcher == null) {
            return Result.fail("researcher not found");
        }
        return Result.success(researcher);
    }

    @PostMapping("/modify")
    public Result modify(@RequestBody Researcher researcher) {
        if (researcherService.modifyResearcher(researcher)) {
            return Result.success();
        }
        return Result.fail("modify failed");
    }

    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Long id) {
        if (researcherService.deleteResearcher(id)) {
            return Result.success();
        }
        return Result.fail("delete failed");
    }

    @PostMapping("/insert")
    public Result insert(@RequestBody Researcher researcher) {
        if (researcherService.insertResearcher(researcher)) {
            return Result.success();
        }
        return Result.fail("insert failed");
    }
}
