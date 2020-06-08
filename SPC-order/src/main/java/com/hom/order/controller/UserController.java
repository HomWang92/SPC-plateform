package com.hom.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by Hom_Wang on 2020-06-08.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/findAll")
    public String findAll(){

    }
}
