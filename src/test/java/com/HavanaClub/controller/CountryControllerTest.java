package com.HavanaClub.controller;

import com.HavanaClub.entity.Country;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.util.ArrayList;

public class CountryControllerTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
    @Test
  public void countryTest() throws Exception {
    // Arrange
    CountryController countryController = new CountryController();
    Country country = new Country();
    ExtendedModelMap extendedModelMap = new ExtendedModelMap();
    extendedModelMap.put("aaaaa", "aaaaa");
    ArrayList<MultipartFile> arrayList = new ArrayList<MultipartFile>();
    arrayList.add(null);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    countryController.country(country, extendedModelMap, arrayList);
  }
  @Test
  public void countryTest2() throws Exception {
    // Arrange
    CountryController countryController = new CountryController();
    ExtendedModelMap extendedModelMap = new ExtendedModelMap();
    extendedModelMap.put("aaaaa", "aaaaa");

    // Act and Assert
    thrown.expect(NullPointerException.class);
    countryController.country(extendedModelMap);
  }
  @Test
  public void deleteTest() throws Exception {
    // Arrange
    CountryController countryController = new CountryController();
    int id = 1;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    countryController.delete(id);
  }
  @Test
  public void updateCountryTest() throws Exception {
    // Arrange
    CountryController countryController = new CountryController();
    int countryId = 1;
    ExtendedModelMap extendedModelMap = new ExtendedModelMap();
    extendedModelMap.put("aaaaa", "aaaaa");

    // Act and Assert
    thrown.expect(NullPointerException.class);
    countryController.updateCountry(countryId, extendedModelMap);
  }
  @Test
  public void updateCountryTest2() throws Exception {
    // Arrange
    CountryController countryController = new CountryController();
    int countryId = 1;
    String name = "aaaaa";
    CommonsMultipartFile image = null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    countryController.updateCountry(countryId, name, image);
  }
}
