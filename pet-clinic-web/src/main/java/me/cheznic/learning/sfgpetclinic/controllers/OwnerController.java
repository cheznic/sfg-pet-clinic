package me.cheznic.learning.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Charles Nicoletti on 8/23/18
 */
@Controller
public class OwnerController {

    @RequestMapping({"/owners", "/owners/", "/owners/index", "/owners/index.html"})
    public String index(){
        return "owners/index";
    }

}
