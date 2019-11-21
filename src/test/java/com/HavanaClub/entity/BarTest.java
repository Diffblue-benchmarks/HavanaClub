package com.HavanaClub.entity;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class BarTest {

  @Test
  public void BarTest() throws Exception {
    // Arrange and Act
    Bar bar = new Bar();

    // Assert
    assertEquals(0, (bar.getCities()).size());
  }

  @Test
  public void getCitiesTest() throws Exception {
    // Arrange
    Bar bar = new Bar();

    // Act
    List<City> actual = bar.getCities();

    // Assert
    assertEquals(0, actual.size());
  }

  @Test
  public void getIdTest() throws Exception {
    // Arrange
    Bar bar = new Bar();

    // Act
    int actual = bar.getId();

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void getNameTest() throws Exception {
    // Arrange
    Bar bar = new Bar();

    // Act
    String actual = bar.getName();

    // Assert
    assertEquals(null, actual);
  }

  @Test
  public void setCitiesTest() throws Exception {
    // Arrange
    Bar bar = new Bar();
    ArrayList<City> arrayList = new ArrayList<City>();
    arrayList.add(new City());

    // Act
    bar.setCities(arrayList);

    // Assert
    assertSame(arrayList, bar.getCities());
  }

  @Test
  public void setIdTest() throws Exception {
    // Arrange
    Bar bar = new Bar();
    int id = 1;

    // Act
    bar.setId(id);

    // Assert
    assertEquals(1, bar.getId());
  }

  @Test
  public void setNameTest() throws Exception {
    // Arrange
    Bar bar = new Bar();
    String name = "aaaaa";

    // Act
    bar.setName(name);

    // Assert
    assertEquals("aaaaa", bar.getName());
  }
}
