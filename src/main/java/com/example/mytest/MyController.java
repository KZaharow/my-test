package com.example.mytest;

import javafx.application.Application;
import jdk.jfr.ContentType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class MyController {

    @PostMapping
    public ResponseEntity<String> doGet(@RequestBody String s ) {
        System.out.println(s);
        ResponseEntity<String> stringResponseEntity = new ResponseEntity<>("hello", HttpStatus.OK);
        return stringResponseEntity;
    }
    @GetMapping("/ex")
    public ResponseEntity<String> doGetEx() {
        ResponseEntity<String> stringResponseEntity = new ResponseEntity<>("hello", HttpStatus.OK);
        throw new RuntimeException("err");
    }


}
