package com.greenfoxacademy.demo.controller;

import com.greenfoxacademy.demo.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldBeanWebController {
  @Autowired
  UtilityService utilityService;

  @RequestMapping(value = "/useful")
  public String usefulMainPage() {
    return "useful";
  }

  @RequestMapping(value = "/useful/colored")
  public String usefulColoredBackgroundPage(Model model) {
    model.addAttribute("color",utilityService.randomColor());
    return "colored";
  }
}
