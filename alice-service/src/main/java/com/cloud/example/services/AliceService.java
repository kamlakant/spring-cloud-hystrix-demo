package com.cloud.example.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class AliceService {

    public String getStuff() {
        return "Here is some random stuff from Alice";
    }

    @HystrixCommand(fallbackMethod = "defaultStuff")
    public String getBobStuff() {
        return fetchStuffFromBobService();
    }

    @SuppressWarnings("unused")
    private String defaultStuff() {
        return "Bob's dead. Here is some default content";
    }

    private String fetchStuffFromBobService() {
        return new RestTemplate().getForEntity("http://localhost:10001/get-stuff", String.class).getBody();
    }
}