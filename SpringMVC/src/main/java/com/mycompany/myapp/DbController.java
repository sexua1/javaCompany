package com.mycompany.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DbController {
  @Autowired
  private DbService service;
  
  @RequestMapping(value = "/Db", method = RequestMethod.GET)
  public String fetchDb(Model model, @ModelAttribute("id")int id) throws Exception {
    DbVo db = service.fetchDb(id);
    model.addAttribute(db);
    return "home";
  }
}