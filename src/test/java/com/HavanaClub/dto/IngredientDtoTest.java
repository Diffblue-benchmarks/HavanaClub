package com.HavanaClub.dto;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IngredientDtoTest {

  @Test
  public void IngredientDtoTest() throws Exception {
    // Arrange
    String ingredientName = "aaaaa";

    // Act
    IngredientDto ingredientDto = new IngredientDto(ingredientName);

    // Assert
    assertEquals("aaaaa", ingredientDto.getIngredientName());
  }

  @Test
  public void getIngredientNameTest() throws Exception {
    // Arrange
    IngredientDto ingredientDto = new IngredientDto("aaaaa");

    // Act
    String actual = ingredientDto.getIngredientName();

    // Assert
    assertEquals("aaaaa", actual);
  }

  @Test
  public void setIngredientNameTest() throws Exception {
    // Arrange
    IngredientDto ingredientDto = new IngredientDto("aaaaa");
    String ingredientName = "aaaaa";

    // Act
    ingredientDto.setIngredientName(ingredientName);

    // Assert
    assertEquals("aaaaa", ingredientDto.getIngredientName());
  }
}
