package com.sciman.controller;

import com.sciman.dto.organization.OrganizationQueryParam;
import com.sciman.pojo.Contact;
import com.sciman.service.OrganizationService;
import com.sciman.utils.result.Result;
import com.sciman.vo.project.OrganizationView;
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

    @PostMapping("/list")
    public Result list(@RequestBody OrganizationQueryParam queryParam) {
        try {
            return Result.success(organizationService.getOrganizationViewsOf(queryParam));
        } catch (RuntimeException e) {
            return Result.fail(e.getMessage());
        }
    }

    @GetMapping("/listAll")
    public Result listAll() {
        try {
            return Result.success(organizationService.listAllOrganization());
        } catch (RuntimeException e) {
            return Result.fail(e.getMessage());
        }
    }

    @PutMapping("/update/principleContact/{id}")
    public Result updatePrimaryContact(@PathVariable Long id, @RequestBody Contact contact) {
        try {
            return Result.success(organizationService.updatePrimaryContact(id, contact));
        } catch (RuntimeException e) {
            return Result.fail(e.getMessage());
        }
    }

    @PutMapping("/update/organization")
    public Result updateOrganization(@RequestBody OrganizationView organization) {
        try {
            return Result.success(organizationService.updateOrganization(organization));
        } catch (RuntimeException e) {
            return Result.fail(e.getMessage());
        }
    }

    @DeleteMapping("/delete/{id}")
    public Result deleteOrganization(@PathVariable Long id) {
        try {
            return Result.success(organizationService.deleteOrganization(id));
        } catch (RuntimeException e) {
            return Result.fail(e.getMessage());
        }
    }

    @PutMapping("/add")
    public Result addOrganization(@RequestBody OrganizationView organization) {
        try {
            return Result.success(organizationService.addOrganization(organization));
        } catch (RuntimeException e) {
            return Result.fail(e.getMessage());
        }
    }
}
