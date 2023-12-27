package com.sciman.controller;

import com.sciman.dto.laboratory.LaboratoryQueryParam;
import com.sciman.dto.laboratory.LaboratorySecretaryModifyParam;
import com.sciman.pojo.Laboratory;
import com.sciman.service.LabService;
import com.sciman.utils.result.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/lab")
@RequiredArgsConstructor
public class LabController {
    private final LabService labService;
    @GetMapping("/listAll")
    public Result listAll() {
        return Result.success(labService.listAllLaboratories());
    }

    @GetMapping("/listIntro")
    public Result listIntro() {
        return Result.success(labService.listLaboratoryIntroductionFor(0, 0));
    }

    @PostMapping("/list")
    public Result list(@RequestBody LaboratoryQueryParam queryParam) {
        return Result.success(labService.listLaboratoryViewFor(queryParam));
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        return Result.success(labService.delete(id));
    }

    @PostMapping("/modifySecretary")
    public Result modifySecretary(@RequestBody LaboratorySecretaryModifyParam modifyParam) {
        boolean result = labService.modifyLabSecretary(modifyParam);
        if (result) {
            return Result.success();
        }
        return Result.fail("修改实验室秘书失败");
    }

    @GetMapping("/queryOrientation/{id}")
    public Result queryOrientation(@PathVariable Long id) {
        String orientation = labService.queryOrientationOfLabId(id);
        if (orientation != null) {
            return Result.success(orientation);
        }
        return Result.fail("查询实验室方向失败");
    }
}
