package me.cheznic.learning.sfgpetclinic.controllers;

import me.cheznic.learning.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Charles Nicoletti on 8/23/18
 */
@RequestMapping("/vets")
@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String index(Model model)
    {
        model.addAttribute("vets", vetService.findAll());

        return "vets/index";
    }

}
