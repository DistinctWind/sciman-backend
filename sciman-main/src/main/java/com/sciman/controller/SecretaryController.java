package com.sciman.controller;

import com.sciman.dto.secretary.QueryParam;
import com.sciman.service.SecretaryService;
import com.sciman.utils.result.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/list")
    public Result list(@RequestBody QueryParam param) {
        return Result.success(secretaryService.getResearcherViewFor(param));
    }
}
