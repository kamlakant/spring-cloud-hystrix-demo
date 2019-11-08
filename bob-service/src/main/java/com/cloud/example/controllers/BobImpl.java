package com.cloud.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.example.contracts.Bob;
import com.cloud.example.services.BobService;

@RestController
public class BobImpl implements Bob {

    @Autowired
    private BobService bobService;

    @Override
    public String getStuff() {
        return bobService.getStuff();
    }

    @Override
    public String getAliceStuff() {
        return bobService.getAliceStuff();
    }

}