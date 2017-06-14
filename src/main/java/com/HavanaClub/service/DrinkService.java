package com.HavanaClub.service;

import com.HavanaClub.entity.Drink;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

public interface DrinkService {

    void save(Drink drink, ArrayList<Integer> ids, MultipartFile image);

    List<Drink> findAll();

    Drink findOne(int id);

    void delete(int id);

    List<Drink> drinkWithIngredients();

    Drink drinkWithIngredients(int id);

    Drink drinkWithAllInfo(int id);

    void updateDrink(Drink drink, MultipartFile image, ArrayList<Integer> ingredients);
}
