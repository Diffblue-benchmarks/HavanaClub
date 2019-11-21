package com.HavanaClub.entity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class CountryImagesTest {

  @Test
  public void CountryImagesTest() throws Exception {
    // Arrange
    String pathImage = "aaaaa";

    // Act
    CountryImages countryImages = new CountryImages(pathImage);

    // Assert
    assertEquals("aaaaa", countryImages.getPathImage());
  }

  @Test
  public void CountryImagesTest2() throws Exception {
    // Arrange and Act
    CountryImages countryImages = new CountryImages();

    // Assert
    assertEquals(0, countryImages.getId());
  }

  @Test
  public void getCountryTest() throws Exception {
    // Arrange
    CountryImages countryImages = new CountryImages();

    // Act
    Country actual = countryImages.getCountry();

    // Assert
    assertEquals(null, actual);
  }

  @Test
  public void getIdTest() throws Exception {
    // Arrange
    CountryImages countryImages = new CountryImages();

    // Act
    int actual = countryImages.getId();

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void getPathImageTest() throws Exception {
    // Arrange
    CountryImages countryImages = new CountryImages();

    // Act
    String actual = countryImages.getPathImage();

    // Assert
    assertEquals(null, actual);
  }

  @Test
  public void setCountryTest() throws Exception {
    // Arrange
    CountryImages countryImages = new CountryImages();
    Country country = new Country();

    // Act
    countryImages.setCountry(country);

    // Assert
    assertSame(country, countryImages.getCountry());
  }

  @Test
  public void setIdTest() throws Exception {
    // Arrange
    CountryImages countryImages = new CountryImages();
    int id = 1;

    // Act
    countryImages.setId(id);

    // Assert
    assertEquals(1, countryImages.getId());
  }

  @Test
  public void setPathImageTest() throws Exception {
    // Arrange
    CountryImages countryImages = new CountryImages();
    String pathImage = "aaaaa";

    // Act
    countryImages.setPathImage(pathImage);

    // Assert
    assertEquals("aaaaa", countryImages.getPathImage());
  }
}
