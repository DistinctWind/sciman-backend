package com.sciman.controller;

import com.sciman.dto.contact.ContactQueryParam;
import com.sciman.pojo.Contact;
import com.sciman.service.ContactService;
import com.sciman.utils.result.Result;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Delete;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@Slf4j
@RequestMapping("/contact")
public class ContactController {
    private final ContactService contactService;
    @GetMapping("/{id}")
    public Result getContactById(@PathVariable Long id) {
        return Result.success(contactService.getContactById(id));
    }

    @PostMapping("/list")
    public Result getContactList(@RequestBody ContactQueryParam queryParam) {
        return Result.success(contactService.getContactList(queryParam));
    }

    @PutMapping("/modify")
    public Result updateContact(@RequestBody Contact contact) {
        if (contactService.updateContact(contact)) {
            return Result.success();
        } else {
            return Result.fail("更新失败");
        }
    }

    @DeleteMapping("/delete/{id}")
    public Result deleteContact(@PathVariable Long id) {
        if (contactService.deleteContact(id)) {
            return Result.success();
        } else {
            return Result.fail("删除失败");
        }
    }

    @PostMapping("/add")
    public Result addContact(@RequestBody Contact contact) {
        log.warn("Warning: /add doesn't meant to add a organization SecondaryContact.");
        if (contactService.addContact(contact)) {
            return Result.success();
        } else {
            return Result.fail("添加失败");
        }
    }

    @PostMapping("/add/{organizationId}")
    public Result addContact(@RequestBody Contact contact, @PathVariable Long organizationId) {
        if (contactService.addContact(contact, organizationId)) {
            return Result.success();
        } else {
            return Result.fail("添加失败");
        }
    }
}
