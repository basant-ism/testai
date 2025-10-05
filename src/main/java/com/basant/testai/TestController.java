package com.basant.testai;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class TestController {

    @GetMapping("/test")
    String test() {
        Random random = new Random();
        int y = random.nextInt(100);
        Integer x = null;
        if(y > 50) {
            x = y;
        }
        int ans = 1000/x;
        return "Test" + ans;
    }
}
