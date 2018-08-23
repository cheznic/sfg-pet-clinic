package me.cheznic.learning.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Charles Nicoletti on 8/23/18
 */
@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/", "/vets/index", "/vets/index.html"})
    public String index(){
        return "vets/index";
    }

}
