package com.sciman.controller;

import com.sciman.dto.staff.StaffQueryParam;
import com.sciman.pojo.Staff;
import com.sciman.service.StuffService;
import com.sciman.utils.result.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/person/staff")
public class StaffController {
    private final StuffService stuffService;
    @GetMapping("/listAll")
    public Result listAll() {
        return Result.success(stuffService.listAll());
    }

    @PostMapping("/list")
    public Result list(@RequestBody StaffQueryParam param) {
        return Result.success(stuffService.getStaffViewFor(param));
    }

    @PostMapping("/modify")
    public Result modify(@RequestBody Staff staff) {
        boolean result = stuffService.modifyStaff(staff);
        if (result) {
            return Result.success();
        }
        return Result.fail("修改主任信息失败");
    }
}
