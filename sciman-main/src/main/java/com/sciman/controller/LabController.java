package com.sciman.controller;

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

    @DeleteMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        return Result.success(labService.delete(id));
    }
}
