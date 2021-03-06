package com.greenfox.h2.controllers;

import com.greenfox.h2.repositories.TodoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/todo")
public class TodoController {

  @Autowired
  TodoInterface todoInterface;

  @RequestMapping(value = {"/","/list"})
  public String todoList(Model model) {
    model.addAttribute("todo_objects", todoInterface.findAll());
    return "todosList";
  }

}
