package com.HavanaClub.entity;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DrinkTest {

  @Test
  public void DrinkTest() throws Exception {
    // Arrange
    String drinkName = "aaaaa";

    // Act
    Drink drink = new Drink(drinkName);

    // Assert
    assertEquals("aaaaa", drink.getDrinkName());
  }

  @Test
  public void DrinkTest2() throws Exception {
    // Arrange
    int id = 1;
    String drinkName = "aaaaa";
    String recipe = "aaaaa";

    // Act
    Drink drink = new Drink(id, drinkName, recipe);

    // Assert
    int id1 = drink.getId();
    String recipe1 = drink.getRecipe();
    assertEquals(1, id1);
    assertEquals("aaaaa", drink.getDrinkName());
    assertEquals("aaaaa", recipe1);
  }

  @Test
  public void DrinkTest3() throws Exception {
    // Arrange and Act
    Drink drink = new Drink();

    // Assert
    assertEquals(0, (drink.getUsers()).size());
  }

  @Test
  public void equalsTest() throws Exception {
    // Arrange
    Drink drink = new Drink();
    String o = "aaaaa";

    // Act
    boolean actual = drink.equals(o);

    // Assert
    assertFalse(actual);
  }

  @Test
  public void getCountryTest() throws Exception {
    // Arrange
    Drink drink = new Drink();

    // Act
    Country actual = drink.getCountry();

    // Assert
    assertEquals(null, actual);
  }

  @Test
  public void getDrinkNameTest() throws Exception {
    // Arrange
    Drink drink = new Drink();

    // Act
    String actual = drink.getDrinkName();

    // Assert
    assertEquals(null, actual);
  }

  @Test
  public void getIdTest() throws Exception {
    // Arrange
    Drink drink = new Drink();

    // Act
    int actual = drink.getId();

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void getIngredientsTest() throws Exception {
    // Arrange
    Drink drink = new Drink();

    // Act
    List<Ingredient> actual = drink.getIngredients();

    // Assert
    assertEquals(0, actual.size());
  }

  @Test
  public void getOrdersTest() throws Exception {
    // Arrange
    Drink drink = new Drink();

    // Act
    List<Orders> actual = drink.getOrders();

    // Assert
    assertEquals(0, actual.size());
  }

  @Test
  public void getPathImageTest() throws Exception {
    // Arrange
    Drink drink = new Drink();

    // Act
    String actual = drink.getPathImage();

    // Assert
    assertEquals(null, actual);
  }

  @Test
  public void getPriceTest() throws Exception {
    // Arrange
    Drink drink = new Drink();

    // Act
    int actual = drink.getPrice();

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void getRecipeTest() throws Exception {
    // Arrange
    Drink drink = new Drink();

    // Act
    String actual = drink.getRecipe();

    // Assert
    assertEquals(null, actual);
  }

  @Test
  public void getUsersTest() throws Exception {
    // Arrange
    Drink drink = new Drink();

    // Act
    List<User> actual = drink.getUsers();

    // Assert
    assertEquals(0, actual.size());
  }

  @Test
  public void hashCodeTest() throws Exception {
    // Arrange
    Drink drink = new Drink();

    // Act
    int actual = drink.hashCode();

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void setCountryTest() throws Exception {
    // Arrange
    Drink drink = new Drink();
    Country country = new Country();

    // Act
    drink.setCountry(country);

    // Assert
    assertSame(country, drink.getCountry());
  }

  @Test
  public void setDrinkNameTest() throws Exception {
    // Arrange
    Drink drink = new Drink();
    String drinkName = "aaaaa";

    // Act
    drink.setDrinkName(drinkName);

    // Assert
    assertEquals("aaaaa", drink.getDrinkName());
  }

  @Test
  public void setIdTest() throws Exception {
    // Arrange
    Drink drink = new Drink();
    int id = 1;

    // Act
    drink.setId(id);

    // Assert
    assertEquals(1, drink.getId());
  }

  @Test
  public void setIngredientsTest() throws Exception {
    // Arrange
    Drink drink = new Drink();
    ArrayList<Ingredient> arrayList = new ArrayList<Ingredient>();
    arrayList.add(new Ingredient());

    // Act
    drink.setIngredients(arrayList);

    // Assert
    assertSame(arrayList, drink.getIngredients());
  }

  @Test
  public void setOrdersTest() throws Exception {
    // Arrange
    Drink drink = new Drink();
    ArrayList<Orders> arrayList = new ArrayList<Orders>();
    arrayList.add(new Orders());

    // Act
    drink.setOrders(arrayList);

    // Assert
    assertSame(arrayList, drink.getOrders());
  }

  @Test
  public void setPathImageTest() throws Exception {
    // Arrange
    Drink drink = new Drink();
    String pathImage = "aaaaa";

    // Act
    drink.setPathImage(pathImage);

    // Assert
    assertEquals("aaaaa", drink.getPathImage());
  }

  @Test
  public void setPriceTest() throws Exception {
    // Arrange
    Drink drink = new Drink();
    int price = 1;

    // Act
    drink.setPrice(price);

    // Assert
    assertEquals(1, drink.getPrice());
  }

  @Test
  public void setRecipeTest() throws Exception {
    // Arrange
    Drink drink = new Drink();
    String recipe = "aaaaa";

    // Act
    drink.setRecipe(recipe);

    // Assert
    assertEquals("aaaaa", drink.getRecipe());
  }

  @Test
  public void setUsersTest() throws Exception {
    // Arrange
    Drink drink = new Drink();
    ArrayList<User> arrayList = new ArrayList<User>();
    arrayList.add(new User());

    // Act
    drink.setUsers(arrayList);

    // Assert
    assertSame(arrayList, drink.getUsers());
  }

  @Test
  public void toStringTest() throws Exception {
    // Arrange
    Drink drink = new Drink();

    // Act
    String actual = drink.toString();

    // Assert
    assertEquals("Drink{id=0, drinkName='null', price=0, alcohol=false}", actual);
  }
}
