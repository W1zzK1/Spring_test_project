package com.example.demo.controller;

import com.example.demo.dto.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public ResponseEntity testGet(){
        return ResponseEntity.ok("Успех");
    }

    @PostMapping
    public ResponseEntity testPost(){
        return ResponseEntity.ok(new User("Ivan", "Ivanov", "Ivanovich", LocalDate.parse("1990-01-01")));
    }

    @GetMapping("/long")
    public ResponseEntity testLongMapping(){
        return ResponseEntity.ok("Длииииииный ответ.....");
    }
}
