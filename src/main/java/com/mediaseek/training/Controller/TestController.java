package com.mediaseek.training.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import com.mediaseek.training.Entity.Hello;

@Controller
public class TestController {

  @GetMapping("/{message}")
  public String get(@ModelAttribute("hello") Hello h,@PathVariable String message) {
    h.setPageName("test1");
    h.setHello(message);
    return "test";
  }

}
