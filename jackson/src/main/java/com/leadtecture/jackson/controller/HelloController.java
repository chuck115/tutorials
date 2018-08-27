package com.leadtecture.jackson.controller;

import com.leadtecture.jackson.model.UserInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
public class HelloController {

    @GetMapping()
    public UserInfo get() {

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(1);
        userInfo.setUserName("michael");
        userInfo.setBirthDay(LocalDate.of(2000, 1, 15));
        userInfo.setCreateDateTime(LocalDateTime.now());

        return userInfo;
    }

    @PostMapping()
    // Use Http Message Converter
    public String post(@RequestBody UserInfo userInfo) {
        return "bye";
    }


}
