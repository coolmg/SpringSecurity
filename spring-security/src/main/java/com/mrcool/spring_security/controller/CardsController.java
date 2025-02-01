package com.mrcool.spring_security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {
    @GetMapping(value = "/myCards")
    public String getCardsDetails() {
        return "Cards details from DB";
    }
}
