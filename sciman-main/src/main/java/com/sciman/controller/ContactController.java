package com.sciman.controller;

import com.sciman.dto.contact.ContactQueryParam;
import com.sciman.pojo.Contact;
import com.sciman.service.ContactService;
import com.sciman.utils.result.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@CrossOrigin
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

}
