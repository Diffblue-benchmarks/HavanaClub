package com.HavanaClub.controller;

import com.HavanaClub.service.DrinkService;
import com.HavanaClub.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;

@Controller
public class IndexController {
    @Autowired
    private DrinkService drinkService;
    @Autowired
    private UserService userService;


    @GetMapping("/")
    public String index(Model model, Principal principal) {
        model.addAttribute("drinks", drinkService.drinkWithIngredients());
        if(principal == null || principal.getName().equals("admin")){
            return "views-base-index";
        }else{
            model.addAttribute("user",
                    userService.findUserWithDrinks(Integer.parseInt(principal.getName())));
            return "views-base-index";
        }
    }

    @PostMapping("/")
    public String indexAfterLogin(Model model,
                                  @RequestParam String username) {
        model.addAttribute("drinks", drinkService.drinkWithIngredients());

        if(username.equals("admin")){
            return "views-base-index";
        }else{
            model.addAttribute("user", userService
                    .findUserByNameWithDrinks(username));
            return "views-base-index";
        }

    }

    @GetMapping("/recipe/{id}")
    public String recipe(Model model, @PathVariable int id){

        model.addAttribute("drink", drinkService.drinkWithIngredients(id));

        return "views-base-drinkWithRecipe";

    }
}