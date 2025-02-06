package fr.eni.loco.loco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;
import fr.eni.loco.loco.bll.LocoService;
import fr.eni.loco.loco.bo.Ingredient;


@Controller
public class LocoController {

    @Autowired
    private LocoService locoService;

    @GetMapping("/listesdecourse")
    public String getListesDeCourse() {
        return "listes-de-course";
    }

    @GetMapping("/recettes")
    public String getRecettes() {
        return "recettes";
    }

    @GetMapping("/stock")
    public String getStock(Model model) {
        List<Ingredient> ingredients = locoService.showAllIngredients();
        System.out.println(ingredients);
        model.addAttribute("ingredients", ingredients);
        return "stock";
    }
    
}
