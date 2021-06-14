package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {

    @PostMapping("/login")
    public ResponseEntity<ResponseAPI> login(@RequestBody Map<String, String> body) {
        String un = body.get("username");
        String pw = body.get("password");
        if (un.equals("sa") && pw.equals("sa"))
            return ResponseEntity.ok(new ResponseAPI(200, "Login Successful"));
        else
            return ResponseEntity.badRequest().body(new ResponseAPI(400, "Incorrect Username or Password"));
    }
}
