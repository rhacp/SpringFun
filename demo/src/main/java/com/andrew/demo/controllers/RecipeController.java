package com.andrew.demo.controllers;

import com.andrew.demo.models.Recipe;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RecipeController {

    private List<Recipe> recipeList = new ArrayList<>(List.of(
            new Recipe("Sarmale", "Carne, Varza")
    ));

    @GetMapping("/recipe/add")
    public String createRecipe(Model model) {
        model.addAttribute("recipe", new Recipe());

        return "create_recipe_form";
    }

    @PostMapping("/recipe/add")
    public String createRecipe(@ModelAttribute Recipe recipe, Model model) {
        recipeList.add(recipe);
        model.addAttribute("recipe", recipe);

        return "redirect:/recipe";
    }

    @GetMapping("/recipe")
    public String showRecipes(Model model) {
        model.addAttribute("recipeList", recipeList);

        return "recipe_book";
    }
}
