package com.daugherty.archdudemo.controllers;

import java.time.LocalDateTime;

import com.daugherty.archdudemo.entity.DemoMessageResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class Printing {

    @GetMapping("/messages")
    public ResponseEntity<DemoMessageResponse> standardMethod() {
        log.info("Hello controller was hit");

        DemoMessageResponse messageResponse = new DemoMessageResponse(); //RetrieveMessage.execute()
        messageResponse.setMessage("Hello, World");
        messageResponse.setTimestamp(LocalDateTime.now().toString());
        
        log.info("Time: " + messageResponse.getTimestamp());
        
        return ResponseEntity.ok().body(messageResponse);
    }
}
