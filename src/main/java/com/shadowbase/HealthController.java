package com.shadowbase;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping
    public String health() {
        return "ShadowBase is running!";
    }
}
