package com.mrcool.spring_security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
    @GetMapping(value = "/contact")
    public String saveContactDetails() {
        return "Contact details are saved into db";
    }
}
