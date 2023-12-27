package com.sciman.controller;

import com.sciman.dto.venue.VenueQueryParam;
import com.sciman.pojo.Venue;
import com.sciman.service.VenueService;
import com.sciman.utils.result.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/venue")
@CrossOrigin
@RequiredArgsConstructor
public class VenueController {
    private final VenueService venueService;

    @GetMapping("/listAll")
    public Result listAll() {
        return Result.success(venueService.getAllVenue());
    }

    @PostMapping("/list")
    public Result list(@RequestBody VenueQueryParam queryParam) {
        return Result.success(venueService.getVenueViewFor(queryParam));
    }

    @GetMapping("/detail/{id}")
    public Result detail(@PathVariable Long id) {
        Venue result = venueService.getVenueById(id);
        if (result != null) {
            return Result.success(result);
        }
        return Result.fail("场所不存在");
    }

    @PostMapping("/modify")
    public Result modify(@RequestBody Venue venue) {
        boolean result = venueService.modifyVenue(venue);
        if (result) {
            return Result.success();
        }
        return Result.fail("修改失败");
    }

    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Long id) {
        boolean result = venueService.deleteVenue(id);
        if (result) {
            return Result.success();
        }
        return Result.fail("删除失败");
    }

    @PostMapping("/insert")
    public Result insert(@RequestBody Venue venue) {
        boolean result = venueService.insertVenue(venue);
        if (result) {
            return Result.success();
        }
        return Result.fail("添加失败");
    }

}
