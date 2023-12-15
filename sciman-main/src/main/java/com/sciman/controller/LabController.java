package com.sciman.controller;

import com.sciman.pojo.Laboratory;
import com.sciman.service.LabService;
import com.sciman.utils.result.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
