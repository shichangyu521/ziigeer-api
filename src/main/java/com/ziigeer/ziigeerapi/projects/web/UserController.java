package com.ziigeer.ziigeerapi.projects.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/user", produces = {"application/json;charset=UTF-8"})
public class UserController {

    @Value("${user.id}")
    private String userId;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public String test(HttpServletRequest request) {
        return userId;
    }
}
