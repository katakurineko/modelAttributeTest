package com.mediaseek.training.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.mediaseek.training.Entity.Hello;

@Controller
public class TestController {
//  @ModelAttribute
//  public Hello getMenu() {
//    Hello h = new Hello();
//    h.setHello("hello!");
//    return h;
//  }

  @GetMapping("/")
  public String get(@ModelAttribute("hello") Hello h) {
    h.setHello("hello!");
    return "test";
  }
  
  @GetMapping("/2")
  public String get2(@ModelAttribute("hello") Hello h) {
    h.setHello("hellohello!");
    return "test2";
  }

}
