package com.HavanaClub.entity;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class IngredientTest {

  @Test
  public void IngredientTest() throws Exception {
    // Arrange
    int id = 1;

    // Act
    Ingredient ingredient = new Ingredient(id);

    // Assert
    assertEquals(1, ingredient.getId());
  }

  @Test
  public void IngredientTest2() throws Exception {
    // Arrange and Act
    Ingredient ingredient = new Ingredient();

    // Assert
    assertEquals(0, (ingredient.getDrinks()).size());
  }

  @Test
  public void IngredientTest3() throws Exception {
    // Arrange
    int id = 1;
    String ingredientName = "aaaaa";

    // Act
    Ingredient ingredient = new Ingredient(id, ingredientName);

    // Assert
    int id1 = ingredient.getId();
    assertEquals(1, id1);
    assertEquals("aaaaa", ingredient.getIngredientName());
  }

  @Test
  public void equalsTest() throws Exception {
    // Arrange
    Ingredient ingredient = new Ingredient();
    String o = "aaaaa";

    // Act
    boolean actual = ingredient.equals(o);

    // Assert
    assertFalse(actual);
  }

  @Test
  public void getDrinksTest() throws Exception {
    // Arrange
    Ingredient ingredient = new Ingredient();

    // Act
    List<Drink> actual = ingredient.getDrinks();

    // Assert
    assertEquals(0, actual.size());
  }

  @Test
  public void getIdTest() throws Exception {
    // Arrange
    Ingredient ingredient = new Ingredient();

    // Act
    int actual = ingredient.getId();

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void getIngredientNameTest() throws Exception {
    // Arrange
    Ingredient ingredient = new Ingredient();

    // Act
    String actual = ingredient.getIngredientName();

    // Assert
    assertEquals(null, actual);
  }

  @Test
  public void hashCodeTest() throws Exception {
    // Arrange
    Ingredient ingredient = new Ingredient();

    // Act
    int actual = ingredient.hashCode();

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void setDrinksTest() throws Exception {
    // Arrange
    Ingredient ingredient = new Ingredient();
    ArrayList<Drink> arrayList = new ArrayList<Drink>();
    arrayList.add(new Drink());

    // Act
    ingredient.setDrinks(arrayList);

    // Assert
    assertSame(arrayList, ingredient.getDrinks());
  }

  @Test
  public void setIdTest() throws Exception {
    // Arrange
    Ingredient ingredient = new Ingredient();
    int id = 1;

    // Act
    ingredient.setId(id);

    // Assert
    assertEquals(1, ingredient.getId());
  }

  @Test
  public void setIngredientNameTest() throws Exception {
    // Arrange
    Ingredient ingredient = new Ingredient();
    String ingredientName = "aaaaa";

    // Act
    ingredient.setIngredientName(ingredientName);

    // Assert
    assertEquals("aaaaa", ingredient.getIngredientName());
  }

  @Test
  public void toStringTest() throws Exception {
    // Arrange
    Ingredient ingredient = new Ingredient();

    // Act
    String actual = ingredient.toString();

    // Assert
    assertEquals("Ingredient{id=0, ingredientName='null'}", actual);
  }
}
