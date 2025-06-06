package org.example.sb_restapi.Contoller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

    @GetMapping(value="/welcome", produces = "text/plain")
    public String getWelcomMsg() {
        String msg = "Welcome to RestApi";
        return msg;
    }

    @GetMapping(value="/greet", produces = "text/plain")
    public ResponseEntity<String> getGreetMsg() {
        String s = "Good Morning";
        return new ResponseEntity<>(s, HttpStatus.OK);
    }

}

