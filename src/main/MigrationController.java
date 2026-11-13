package com.shadowbase;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/migration")
public class MigrationController {

    @GetMapping("/status")
    public String status() {
        return "ShadowBase Migration Service is running!";
    }
}
