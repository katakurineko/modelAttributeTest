package com.mediaseek.training.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

  @GetMapping("/tes")
  public String get() {
    return "test";
  }
  
}
