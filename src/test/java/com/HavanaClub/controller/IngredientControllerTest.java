package com.HavanaClub.controller;

import com.HavanaClub.entity.Ingredient;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.data.domain.PageRequest;
import org.springframework.ui.ExtendedModelMap;

public class IngredientControllerTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  
  @Test
  public void deleteIngredientTest() throws Exception {
    // Arrange
    IngredientController ingredientController = new IngredientController();
    int id = 1;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ingredientController.deleteIngredient(id);
  }

  @Test
  public void ingredientTest() throws Exception {
    // Arrange
    IngredientController ingredientController = new IngredientController();
    ExtendedModelMap extendedModelMap = new ExtendedModelMap();
    extendedModelMap.put("ingredient", "ingredient");
    PageRequest pageable = new PageRequest(1, 1);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ingredientController.ingredient(extendedModelMap, pageable);
  }

  @Test
  public void ingredientTest2() throws Exception {
    // Arrange
    IngredientController ingredientController = new IngredientController();
    Ingredient ingredient = new Ingredient();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ingredientController.ingredient(ingredient);
  }

  @Test
  public void updateIngredientTest() throws Exception {
    // Arrange
    IngredientController ingredientController = new IngredientController();
    int id = 1;
    ExtendedModelMap extendedModelMap = new ExtendedModelMap();
    extendedModelMap.put("ingredient", "ingredient");

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ingredientController.updateIngredient(id, extendedModelMap);
  }
}
