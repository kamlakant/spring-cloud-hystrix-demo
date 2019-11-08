package com.cloud.example.contracts;

import org.springframework.web.bind.annotation.GetMapping;

public interface Bob {

    @GetMapping("/get-stuff")
    String getStuff();

    @GetMapping("/get-alice-stuff")
    String getAliceStuff();
}
