package com.mrcool.spring_security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping(value = "/myAccount")
    public String getAccountDetails() {
        return "Account details from DB";
    }
}
