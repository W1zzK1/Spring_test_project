package com.example.demo.controller;

import com.example.demo.dto.ShortLinkDto;
import com.example.demo.dto.User;
import com.example.demo.service.ShortLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/s")
public class ShortLinkController {

    @Autowired
    private ShortLinkService shortLinkService;

    @PostMapping
    public ResponseEntity create(@RequestBody ShortLinkDto dto) {
        return ResponseEntity.ok(shortLinkService.create(dto));
    }

    @GetMapping("/{code}")
    public ResponseEntity getRedirect(@PathVariable String code) {
        String redirectLink = shortLinkService.findRedirectLink(code);
        return ResponseEntity.status(302).header("Location", redirectLink).build();
    }
}
