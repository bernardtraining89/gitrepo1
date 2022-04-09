package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Bernard
 * @Created 3/4/2022/04/2022-1:40 PM
 */
@RestController
public class TestController {

    @RequestMapping(value="/test", method = RequestMethod.GET)
    public String hello(){
        return "hello world";
    }
}
