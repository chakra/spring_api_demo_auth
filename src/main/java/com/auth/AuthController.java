package com.auth;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chakrabhandari on 4/08/2017.
 */
@RestController
public class AuthController {


    /**
     * http://localhost/auth?token=ad34dfas83dfaifd
     * @param token
     * @return
     */
    @GetMapping("/auth")
    public ResponseEntity<String> auth(@RequestParam("token") String token) {
        System.out.println(token);
        return new ResponseEntity<String>("authenticated", HttpStatus.OK);
    }
}
