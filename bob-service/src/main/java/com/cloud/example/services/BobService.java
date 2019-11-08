package com.cloud.example.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class BobService {

    public String getStuff() {
        return "Here is some random stuff from Bob";
    }

    @HystrixCommand(fallbackMethod = "defaultStuff")
    public String getAliceStuff() {
        return fetchStuffFromAliceService();
    }

    @SuppressWarnings("unused")
    private String defaultStuff() {
        return "Alice's dead. Here is some default content";
    }

    private String fetchStuffFromAliceService() {
        return new RestTemplate().getForEntity("http://localhost:9001/get-stuff", String.class).getBody();
    }
}