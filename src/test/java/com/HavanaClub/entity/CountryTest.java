package com.HavanaClub.entity;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class CountryTest {

  @Test
  public void CountryTest() throws Exception {
    // Arrange
    String name = "aaaaa";

    // Act
    Country country = new Country(name);

    // Assert
    assertEquals("aaaaa", country.getName());
  }

  @Test
  public void CountryTest2() throws Exception {
    // Arrange and Act
    Country country = new Country();

    // Assert
    assertEquals(0, (country.getCountryImages()).size());
  }

  @Test
  public void getCountryImagesTest() throws Exception {
    // Arrange
    Country country = new Country();

    // Act
    List<CountryImages> actual = country.getCountryImages();

    // Assert
    assertEquals(0, actual.size());
  }

  @Test
  public void getDrinksTest() throws Exception {
    // Arrange
    Country country = new Country();

    // Act
    List<Drink> actual = country.getDrinks();

    // Assert
    assertEquals(0, actual.size());
  }

  @Test
  public void getIdTest() throws Exception {
    // Arrange
    Country country = new Country();

    // Act
    int actual = country.getId();

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void getNameTest() throws Exception {
    // Arrange
    Country country = new Country();

    // Act
    String actual = country.getName();

    // Assert
    assertEquals(null, actual);
  }

  @Test
  public void setCountryImagesTest() throws Exception {
    // Arrange
    Country country = new Country();
    ArrayList<CountryImages> arrayList = new ArrayList<CountryImages>();
    arrayList.add(new CountryImages());

    // Act
    country.setCountryImages(arrayList);

    // Assert
    assertSame(arrayList, country.getCountryImages());
  }

  @Test
  public void setDrinksTest() throws Exception {
    // Arrange
    Country country = new Country();
    ArrayList<Drink> arrayList = new ArrayList<Drink>();
    arrayList.add(new Drink());

    // Act
    country.setDrinks(arrayList);

    // Assert
    assertSame(arrayList, country.getDrinks());
  }

  @Test
  public void setIdTest() throws Exception {
    // Arrange
    Country country = new Country();
    int id = 1;

    // Act
    country.setId(id);

    // Assert
    assertEquals(1, country.getId());
  }

  @Test
  public void setNameTest() throws Exception {
    // Arrange
    Country country = new Country();
    String name = "aaaaa";

    // Act
    country.setName(name);

    // Assert
    assertEquals("aaaaa", country.getName());
  }
}
