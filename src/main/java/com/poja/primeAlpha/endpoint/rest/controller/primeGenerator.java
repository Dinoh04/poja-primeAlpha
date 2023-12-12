package com.poja.primeAlpha.endpoint.rest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prime")
public class primeGenerator {
    @GetMapping
    public int generatePrime() {
        int num = 2;
        while (!isPrime(num)) {
            num++;
        }
        return num;
    }
    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
