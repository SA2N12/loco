package fr.eni.loco.loco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
        model.addAttribute("ingredients", ingredients);
        model.addAttribute("ingredient", new Ingredient());
        System.out.println(ingredients);
        return "stock";
    }

    @PostMapping("/stock")
    public String postStock(@ModelAttribute("ingredient") Ingredient ingredient){
        locoService.createIngredient(ingredient);

        return("redirect:/stock");
    }

    @PostMapping("/stock/supprimer")
    public String deleteIngredient(@RequestParam("id") long id){
        locoService.deleteIngredientById(id);
        return("redirect:/stock");
    }
    
}
