package com.sciman.controller;

import com.sciman.service.CountService;
import com.sciman.utils.result.Result;
import com.sciman.vo.count.CountData;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class CountController {
    private final CountService countService;

    @GetMapping("/count")
    public Result count() {
        CountData countData = countService.getObjectCount();
        return Result.success(countData);
    }
}
