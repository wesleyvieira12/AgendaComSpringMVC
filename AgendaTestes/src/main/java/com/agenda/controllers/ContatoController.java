
package com.agenda.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContatoController {
    
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
