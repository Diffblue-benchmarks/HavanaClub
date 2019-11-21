package com.HavanaClub.dto;

import com.HavanaClub.entity.Drink;
import com.HavanaClub.entity.Ingredient;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DtoUtilMapperTest {
  
  @Test
  public void drinkToDrinkDtoTest() throws Exception {
    // Arrange
    Drink drink = new Drink();

    // Act
    DrinkDto actual = DtoUtilMapper.drinkToDrinkDto(drink);

    // Assert
    int id = actual.getId();
    String pathImage = actual.getPathImage();
    String recipe = actual.getRecipe();
    assertEquals(0, id);
    assertEquals(null, actual.getDrinkName());
    assertEquals(null, recipe);
    assertEquals(null, pathImage);
  }

  @Test
  public void drinksToDrinksDtosTest() throws Exception {
    // Arrange
    ArrayList<Drink> arrayList = new ArrayList<Drink>();
    arrayList.add(new Drink());

    // Act
    List<DrinkDto> actual = DtoUtilMapper.drinksToDrinksDtos(arrayList);

    // Assert
    assertEquals(1, actual.size());
    DrinkDto getResult = actual.get(0);
    int id = getResult.getId();
    String pathImage = getResult.getPathImage();
    String recipe = getResult.getRecipe();
    assertEquals(0, id);
    assertEquals(null, getResult.getDrinkName());
    assertEquals(null, recipe);
    assertEquals(null, pathImage);
  }

  @Test
  public void ingredientToIngredientDtoTest() throws Exception {
    // Arrange
    Ingredient ingredient = new Ingredient();

    // Act
    IngredientDto actual = DtoUtilMapper.ingredientToIngredientDto(ingredient);

    // Assert
    assertEquals(null, actual.getIngredientName());
  }

  @Test
  public void ingredientsToIngredientsDtosTest() throws Exception {
    // Arrange
    ArrayList<Ingredient> arrayList = new ArrayList<Ingredient>();
    arrayList.add(new Ingredient());

    // Act
    List<IngredientDto> actual = DtoUtilMapper.ingredientsToIngredientsDtos(arrayList);

    // Assert
    assertEquals(1, actual.size());
    assertEquals(null, (actual.get(0)).getIngredientName());
  }
}
