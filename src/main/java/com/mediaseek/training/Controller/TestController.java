package com.mediaseek.training.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import com.mediaseek.training.Entity.Hello;

@Controller
public class TestController {

  
  /**
   * https://docs.spring.io/spring/docs/current/spring-framework-reference/web.html#mvc-ann-requestmapping-uri-templates<br/>
   * を参考にURLからパラメータを受け取る。<br/>
   * また、正規表現で受け取るパラメータに制限をかける。
   */
  @GetMapping("/{message:^[a-z0-9]+$}")
  public String get(@ModelAttribute("hello") Hello h,@PathVariable String message) {
    h.setPageName("test1");
    h.setHello(message);
    return "test";
  }

}
