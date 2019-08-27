package com.mediaseek.training.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.mediaseek.training.Entity.Hello;

@Controller
public class TestController {

  @GetMapping("/")
  public String get(Model model) {
    Hello h = new Hello();
    h.setHello("hello!");
    model.addAttribute("hello",h);
    return "test";
  }

}
