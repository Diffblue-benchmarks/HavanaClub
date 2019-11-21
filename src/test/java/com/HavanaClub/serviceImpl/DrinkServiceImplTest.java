package com.HavanaClub.serviceImpl;

import com.HavanaClub.entity.Drink;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.util.ArrayList;

public class DrinkServiceImplTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
    @Test
  public void deleteTest() throws Exception {
    // Arrange
    DrinkServiceImpl drinkServiceImpl = new DrinkServiceImpl();
    int id = 1;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    drinkServiceImpl.delete(id);
  }
  @Test
  public void drinkWithAllInfoTest() throws Exception {
    // Arrange
    DrinkServiceImpl drinkServiceImpl = new DrinkServiceImpl();
    int id = 1;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    drinkServiceImpl.drinkWithAllInfo(id);
  }
  @Test
  public void drinkWithIngredientsParsedTest() throws Exception {
    // Arrange
    DrinkServiceImpl drinkServiceImpl = new DrinkServiceImpl();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    drinkServiceImpl.drinkWithIngredientsParsed();
  }
  @Test
  public void drinkWithIngredientsParsedTest2() throws Exception {
    // Arrange
    DrinkServiceImpl drinkServiceImpl = new DrinkServiceImpl();
    int id = 1;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    drinkServiceImpl.drinkWithIngredientsParsed(id);
  }
  @Test
  public void drinkWithIngredientsTest() throws Exception {
    // Arrange
    DrinkServiceImpl drinkServiceImpl = new DrinkServiceImpl();
    int id = 1;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    drinkServiceImpl.drinkWithIngredients(id);
  }
  @Test
  public void drinksWithIngredientsPagesTest() throws Exception {
    // Arrange
    DrinkServiceImpl drinkServiceImpl = new DrinkServiceImpl();
    PageRequest pageable = new PageRequest(1, 1);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    drinkServiceImpl.drinksWithIngredientsPages(pageable);
  }
  @Test
  public void filterByAlcoholTest() throws Exception {
    // Arrange
    DrinkServiceImpl drinkServiceImpl = new DrinkServiceImpl();
    String alco = "/";

    // Act and Assert
    thrown.expect(NullPointerException.class);
    drinkServiceImpl.filterByAlcohol(alco);
  }
  @Test
  public void findAllTest() throws Exception {
    // Arrange
    DrinkServiceImpl drinkServiceImpl = new DrinkServiceImpl();
    PageRequest pageable = new PageRequest(1, 1);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    drinkServiceImpl.findAll(pageable);
  }
  @Test
  public void findOneTest() throws Exception {
    // Arrange
    DrinkServiceImpl drinkServiceImpl = new DrinkServiceImpl();
    int id = 1;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    drinkServiceImpl.findOne(id);
  }
  @Test
  public void randomTest() throws Exception {
    // Arrange
    DrinkServiceImpl drinkServiceImpl = new DrinkServiceImpl();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    drinkServiceImpl.random();
  }
  @Test
  public void saveTest() throws Exception {
    // Arrange
    DrinkServiceImpl drinkServiceImpl = new DrinkServiceImpl();
    Drink drink = new Drink();
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    arrayList.add(new Integer(1));
    CommonsMultipartFile image = null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    drinkServiceImpl.save(drink, arrayList, image);
  }
  @Test
  public void searchDrinksTest() throws Exception {
    // Arrange
    DrinkServiceImpl drinkServiceImpl = new DrinkServiceImpl();
    String search = "/";

    // Act and Assert
    thrown.expect(NullPointerException.class);
    drinkServiceImpl.searchDrinks(search);
  }
  @Test
  public void updateDrinkTest() throws Exception {
    // Arrange
    DrinkServiceImpl drinkServiceImpl = new DrinkServiceImpl();
    Drink drink = new Drink();
    CommonsMultipartFile image = null;
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    arrayList.add(new Integer(1));

    // Act and Assert
    thrown.expect(NullPointerException.class);
    drinkServiceImpl.updateDrink(drink, image, arrayList);
  }
}
