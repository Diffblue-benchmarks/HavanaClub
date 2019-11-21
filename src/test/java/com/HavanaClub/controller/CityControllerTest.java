package com.HavanaClub.controller;

import com.HavanaClub.entity.City;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CityControllerTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  
  @Test
  public void deleteCityTest() throws Exception {
    // Arrange
    CityController cityController = new CityController();
    String idCity = "aaaaa";

    // Act and Assert
    thrown.expect(NumberFormatException.class);
    cityController.deleteCity(idCity);
  }

  @Test
  public void loadCitiesTest() throws Exception {
    // Arrange
    CityController cityController = new CityController();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    cityController.loadCities();
  }

  @Test
  public void saveCityTest() throws Exception {
    // Arrange
    CityController cityController = new CityController();
    City city = new City();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    cityController.saveCity(city);
  }

  @Test
  public void updateCityTest() throws Exception {
    // Arrange
    CityController cityController = new CityController();
    String info = "aaaaa";

    // Act and Assert
    thrown.expect(NullPointerException.class);
    cityController.updateCity(info);
  }
}
