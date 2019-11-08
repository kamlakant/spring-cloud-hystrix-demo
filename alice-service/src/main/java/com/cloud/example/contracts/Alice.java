package com.cloud.example.contracts;

import org.springframework.web.bind.annotation.GetMapping;

public interface Alice {

    @GetMapping("/get-stuff")
    String getStuff();

    @GetMapping("/get-bob-stuff")
    String getBobStuff();
}
