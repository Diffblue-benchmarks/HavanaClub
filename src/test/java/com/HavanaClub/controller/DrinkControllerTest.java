package com.HavanaClub.controller;

import com.HavanaClub.entity.Drink;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DrinkControllerTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  
  @Test
  public void deleteDrinkTest() throws Exception {
    // Arrange
    DrinkController drinkController = new DrinkController();
    int id = 1;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    drinkController.deleteDrink(id);
  }

  @Test
  public void drinkTest() throws Exception {
    // Arrange
    DrinkController drinkController = new DrinkController();
    Drink drink = new Drink();
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    arrayList.add(new Integer(1));
    CommonsMultipartFile image = null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    drinkController.drink(drink, arrayList, image);
  }

  @Test
  public void drinkTest2() throws Exception {
    // Arrange
    DrinkController drinkController = new DrinkController();
    ExtendedModelMap extendedModelMap = new ExtendedModelMap();
    extendedModelMap.put("drink", "drink");

    // Act and Assert
    thrown.expect(NullPointerException.class);
    drinkController.drink(extendedModelMap);
  }

  @Test
  public void initTest() throws Exception {
    // Arrange
    DrinkController drinkController = new DrinkController();
    WebDataBinder webDataBinder = new WebDataBinder("drink");

    // Act
    drinkController.init(webDataBinder);

    // Assert
    BindingResult bindingResult = webDataBinder.getBindingResult();
    assertTrue(bindingResult instanceof BeanPropertyBindingResult);
    String objectName = bindingResult.getObjectName();
    String nestedPath = bindingResult.getNestedPath();
    FieldError fieldError = bindingResult.getFieldError();
    MessageCodesResolver messageCodesResolver = ((BeanPropertyBindingResult) bindingResult).getMessageCodesResolver();
    String[] suppressedFields = bindingResult.getSuppressedFields();
    PropertyEditorRegistry propertyEditorRegistry = bindingResult.getPropertyEditorRegistry();
    assertTrue(messageCodesResolver instanceof org.springframework.validation.DefaultMessageCodesResolver);
    assertEquals(null, fieldError);
    assertEquals("", nestedPath);
    assertEquals(0, suppressedFields.length);
    assertEquals("target", objectName);
    assertTrue(bindingResult.getTarget() instanceof String);
    assertTrue(propertyEditorRegistry instanceof BeanWrapperImpl);
    int autoGrowCollectionLimit = ((BeanWrapperImpl) propertyEditorRegistry).getAutoGrowCollectionLimit();
    String nestedPath1 = ((BeanWrapperImpl) propertyEditorRegistry).getNestedPath();
    String toStringResult = ((BeanWrapperImpl) propertyEditorRegistry).toString();
    boolean isAutoGrowNestedPathsResult = ((BeanWrapperImpl) propertyEditorRegistry).isAutoGrowNestedPaths();
    Object rootInstance = ((BeanWrapperImpl) propertyEditorRegistry).getRootInstance();
    assertTrue(isAutoGrowNestedPathsResult);
    assertEquals("", nestedPath1);
    assertEquals(256, autoGrowCollectionLimit);
    assertTrue(rootInstance instanceof String);
    assertTrue(((BeanWrapperImpl) propertyEditorRegistry).isExtractOldValueForEditor());
  }

  @Test
  public void searchDrinkTest() throws Exception {
    // Arrange
    DrinkController drinkController = new DrinkController();
    String search = "drink";

    // Act and Assert
    thrown.expect(NullPointerException.class);
    drinkController.searchDrink(search);
  }

  @Test
  public void updateDrinkTest() throws Exception {
    // Arrange
    DrinkController drinkController = new DrinkController();
    int id = 1;
    String drinkName = "drink";
    String recipe = "drink";
    CommonsMultipartFile image = null;
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    arrayList.add(new Integer(1));

    // Act and Assert
    thrown.expect(NullPointerException.class);
    drinkController.updateDrink(id, drinkName, recipe, image, arrayList);
  }

  @Test
  public void updateDrinkTest2() throws Exception {
    // Arrange
    DrinkController drinkController = new DrinkController();
    ExtendedModelMap extendedModelMap = new ExtendedModelMap();
    extendedModelMap.put("drink", "drink");
    int drink_id = 1;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    drinkController.updateDrink(extendedModelMap, drink_id);
  }
}
