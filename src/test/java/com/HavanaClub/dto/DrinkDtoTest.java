package com.HavanaClub.dto;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class DrinkDtoTest {

  @Test
  public void DrinkDtoTest() throws Exception {
    // Arrange
    int id = 1;
    String drinkName = "aaaaa";
    String pathImage = "aaaaa";
    String recipe = "aaaaa";

    // Act
    DrinkDto drinkDto = new DrinkDto(id, drinkName, pathImage, recipe);

    // Assert
    int id1 = drinkDto.getId();
    String pathImage1 = drinkDto.getPathImage();
    String recipe1 = drinkDto.getRecipe();
    assertEquals(1, id1);
    assertEquals("aaaaa", drinkDto.getDrinkName());
    assertEquals("aaaaa", recipe1);
    assertEquals("aaaaa", pathImage1);
  }

  @Test
  public void DrinkDtoTest2() throws Exception {
    // Arrange and Act
    DrinkDto drinkDto = new DrinkDto();

    // Assert
    assertEquals(0, (drinkDto.getIngredients()).size());
  }

  @Test
  public void getDrinkNameTest() throws Exception {
    // Arrange
    DrinkDto drinkDto = new DrinkDto();

    // Act
    String actual = drinkDto.getDrinkName();

    // Assert
    assertEquals(null, actual);
  }

  @Test
  public void getIdTest() throws Exception {
    // Arrange
    DrinkDto drinkDto = new DrinkDto();

    // Act
    int actual = drinkDto.getId();

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void getIngredientsTest() throws Exception {
    // Arrange
    DrinkDto drinkDto = new DrinkDto();

    // Act
    List<IngredientDto> actual = drinkDto.getIngredients();

    // Assert
    assertEquals(0, actual.size());
  }

  @Test
  public void getPathImageTest() throws Exception {
    // Arrange
    DrinkDto drinkDto = new DrinkDto();

    // Act
    String actual = drinkDto.getPathImage();

    // Assert
    assertEquals(null, actual);
  }

  @Test
  public void getRecipeTest() throws Exception {
    // Arrange
    DrinkDto drinkDto = new DrinkDto();

    // Act
    String actual = drinkDto.getRecipe();

    // Assert
    assertEquals(null, actual);
  }

  @Test
  public void setDrinkNameTest() throws Exception {
    // Arrange
    DrinkDto drinkDto = new DrinkDto();
    String drinkName = "aaaaa";

    // Act
    drinkDto.setDrinkName(drinkName);

    // Assert
    assertEquals("aaaaa", drinkDto.getDrinkName());
  }

  @Test
  public void setIdTest() throws Exception {
    // Arrange
    DrinkDto drinkDto = new DrinkDto();
    int id = 1;

    // Act
    drinkDto.setId(id);

    // Assert
    assertEquals(1, drinkDto.getId());
  }

  @Test
  public void setIngredientsTest() throws Exception {
    // Arrange
    DrinkDto drinkDto = new DrinkDto();
    ArrayList<IngredientDto> arrayList = new ArrayList<IngredientDto>();
    arrayList.add(new IngredientDto("aaaaa"));

    // Act
    drinkDto.setIngredients(arrayList);

    // Assert
    assertSame(arrayList, drinkDto.getIngredients());
  }

  @Test
  public void setPathImageTest() throws Exception {
    // Arrange
    DrinkDto drinkDto = new DrinkDto();
    String pathImage = "aaaaa";

    // Act
    drinkDto.setPathImage(pathImage);

    // Assert
    assertEquals("aaaaa", drinkDto.getPathImage());
  }

  @Test
  public void setRecipeTest() throws Exception {
    // Arrange
    DrinkDto drinkDto = new DrinkDto();
    String recipe = "aaaaa";

    // Act
    drinkDto.setRecipe(recipe);

    // Assert
    assertEquals("aaaaa", drinkDto.getRecipe());
  }
}
