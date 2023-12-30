package com.sciman.controller;

import com.sciman.service.OrganizationService;
import com.sciman.utils.result.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/organization")
@RestController
@CrossOrigin
@RequiredArgsConstructor
public class OrganizationController {
    private final OrganizationService organizationService;
    @GetMapping("/principleContact/{id}")
    public Result getPrincipleContactByOrganizationId(@PathVariable Long id) {
        try {
            return Result.success(organizationService.getPrincipalContactByOrganizationId(id));
        } catch (RuntimeException e) {
            return Result.fail(e.getMessage());
        }
    }

    @GetMapping("/secondaryContacts/{id}")
    public Result getSecondaryContactsByOrganizationId(@PathVariable Long id) {
        try {
            return Result.success(organizationService.getSecondaryContactsByOrganizationId(id));
        } catch (RuntimeException e) {
            return Result.fail(e.getMessage());
        }
    }

    @GetMapping("/view/{id}")
    public Result getOrganizationViewByOrganizationId(@PathVariable Long id) {
        try {
            return Result.success(organizationService.getOrganizationViewByOrganizationId(id));
        } catch (RuntimeException e) {
            return Result.fail(e.getMessage());
        }
    }
}