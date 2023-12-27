package com.sciman.controller;

import com.sciman.dto.secretary.SecretaryQueryParam;
import com.sciman.pojo.Secretary;
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
        return Result.success(secretaryService.getAllSecretaryView());
    }

    @PostMapping("/list")
    public Result list(@RequestBody SecretaryQueryParam param) {
        return Result.success(secretaryService.getSecretaryViewFor(param));
    }

    @GetMapping("/detail/{id}")
    public Result detail(@PathVariable Long id) {
        Secretary secretary = secretaryService.getSecretaryById(id);
        if (secretary != null) {
            return Result.success(secretary);
        }
        return Result.fail("未找到该秘书");
    }

    @PostMapping("/modify")
    public Result modify(@RequestBody Secretary secretary) {
        boolean result = secretaryService.modifySecretary(secretary);
        if (result) {
            return Result.success();
        }
        return Result.fail("修改秘书信息失败");
    }

    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Long id) {
        boolean result = secretaryService.deleteSecretaryById(id);
        if (result) {
            return Result.success();
        }
        return Result.fail("删除秘书信息失败");
    }

    @PostMapping("/insert")
    public Result insert(@RequestBody Secretary secretary) {
        boolean result = secretaryService.insertSecretary(secretary);
        if (result) {
            return Result.success();
        }
        return Result.fail("添加秘书失败");
    }
}
