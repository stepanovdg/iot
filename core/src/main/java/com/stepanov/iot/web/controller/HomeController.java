package com.stepanov.iot.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dmitriy Stepanov on 21.12.17.
 */

@RestController
public class HomeController {

  @GetMapping("/index")
  public String index() {
    return "Welcome to the home page!";
  }

}
