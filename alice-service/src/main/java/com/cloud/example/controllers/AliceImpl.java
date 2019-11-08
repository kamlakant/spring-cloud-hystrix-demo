package com.cloud.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.example.contracts.Alice;
import com.cloud.example.services.AliceService;

@RestController
public class AliceImpl implements Alice {

    @Autowired
    private AliceService aliceService;

    @Override
    public String getStuff() {
        return aliceService.getStuff();
    }

    @Override
    public String getBobStuff() {
        return aliceService.getBobStuff();
    }

}