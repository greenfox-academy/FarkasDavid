package com.greenfox.sql_fun.services;

import com.greenfox.sql_fun.repositories.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssigneeServiceImpl implements AssigneeService{

  @Autowired
  AssigneeRepository assigneeRepository;
}
