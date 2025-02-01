package com.mrcool.spring_security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController  {
    @GetMapping(value = "/notices")
    public String getLoansDetails() {
        return "Notices details from DB";
    }
}
