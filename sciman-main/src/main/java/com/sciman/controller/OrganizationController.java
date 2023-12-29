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
        return Result.success(organizationService.getPrincipalContactByOrganizationId(id));
    }

    @GetMapping("/secondaryContacts/{id}")
    public Result getSecondaryContactsByOrganizationId(@PathVariable Long id) {
        return Result.success(organizationService.getSecondaryContactsByOrganizationId(id));
    }
}
