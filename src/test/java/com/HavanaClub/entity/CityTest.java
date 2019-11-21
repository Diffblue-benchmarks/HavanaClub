package com.HavanaClub.entity;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class CityTest {

  @Test
  public void CityTest() throws Exception {
    // Arrange and Act
    City city = new City();

    // Assert
    assertEquals(0, (city.getBars()).size());
  }

  @Test
  public void getBarsTest() throws Exception {
    // Arrange
    City city = new City();

    // Act
    List<Bar> actual = city.getBars();

    // Assert
    assertEquals(0, actual.size());
  }

  @Test
  public void getIdTest() throws Exception {
    // Arrange
    City city = new City();

    // Act
    int actual = city.getId();

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void getLocationLatTest() throws Exception {
    // Arrange
    City city = new City();

    // Act
    double actual = city.getLocationLat();

    // Assert
    assertEquals(0.0, actual, 0.1);
  }

  @Test
  public void getLocationLngTest() throws Exception {
    // Arrange
    City city = new City();

    // Act
    double actual = city.getLocationLng();

    // Assert
    assertEquals(0.0, actual, 0.1);
  }

  @Test
  public void getNameTest() throws Exception {
    // Arrange
    City city = new City();

    // Act
    String actual = city.getName();

    // Assert
    assertEquals(null, actual);
  }

  @Test
  public void setBarsTest() throws Exception {
    // Arrange
    City city = new City();
    ArrayList<Bar> arrayList = new ArrayList<Bar>();
    arrayList.add(new Bar());

    // Act
    city.setBars(arrayList);

    // Assert
    assertSame(arrayList, city.getBars());
  }

  @Test
  public void setIdTest() throws Exception {
    // Arrange
    City city = new City();
    int id = 1;

    // Act
    city.setId(id);

    // Assert
    assertEquals(1, city.getId());
  }

  @Test
  public void setLocationLatTest() throws Exception {
    // Arrange
    City city = new City();
    double locationLat = 1.0;

    // Act
    city.setLocationLat(locationLat);

    // Assert
    assertEquals(1.0, city.getLocationLat(), 0.1);
  }

  @Test
  public void setLocationLngTest() throws Exception {
    // Arrange
    City city = new City();
    double locationLng = 1.0;

    // Act
    city.setLocationLng(locationLng);

    // Assert
    assertEquals(1.0, city.getLocationLng(), 0.1);
  }

  @Test
  public void setNameTest() throws Exception {
    // Arrange
    City city = new City();
    String name = "aaaaa";

    // Act
    city.setName(name);

    // Assert
    assertEquals("aaaaa", city.getName());
  }

  @Test
  public void toStringTest() throws Exception {
    // Arrange
    City city = new City();

    // Act
    String actual = city.toString();

    // Assert
    assertEquals("City{id=0, name='null'}", actual);
  }
}
