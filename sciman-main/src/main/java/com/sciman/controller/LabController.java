package com.sciman.controller;

import com.sciman.pojo.Laboratory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/lab")
public class LabController {
    @GetMapping("/listAll")
    public List<Laboratory> listAll() {
        return null;
    }
}
