package com.HavanaClub.entity;

import org.junit.Test;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class OrdersTest {

  @Test
  public void OrdersTest() throws Exception {
    // Arrange
    LocalDateTime localDateTime = null;

    // Act
    Orders orders = new Orders(localDateTime);

    // Assert
    assertEquals(null, orders.getLocalDateTime());
  }

  @Test
  public void OrdersTest2() throws Exception {
    // Arrange and Act
    Orders orders = new Orders();

    // Assert
    assertEquals(0, (orders.getDrinks()).size());
  }

  @Test
  public void getDrinksTest() throws Exception {
    // Arrange
    Orders orders = new Orders();

    // Act
    Set<Drink> actual = orders.getDrinks();

    // Assert
    assertEquals(0, actual.size());
  }

  @Test
  public void getIdTest() throws Exception {
    // Arrange
    Orders orders = new Orders();

    // Act
    int actual = orders.getId();

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void getLocalDateTimeTest() throws Exception {
    // Arrange
    Orders orders = new Orders();

    // Act
    LocalDateTime actual = orders.getLocalDateTime();

    // Assert
    assertEquals(null, actual);
  }

  @Test
  public void getUserTest() throws Exception {
    // Arrange
    Orders orders = new Orders();

    // Act
    User actual = orders.getUser();

    // Assert
    assertEquals(null, actual);
  }

  @Test
  public void setDrinksTest() throws Exception {
    // Arrange
    Orders orders = new Orders();
    HashSet<Drink> hashSet = new HashSet<Drink>();
    hashSet.add(new Drink());

    // Act
    orders.setDrinks(hashSet);

    // Assert
    assertSame(hashSet, orders.getDrinks());
  }

  @Test
  public void setIdTest() throws Exception {
    // Arrange
    Orders orders = new Orders();
    int id = 1;

    // Act
    orders.setId(id);

    // Assert
    assertEquals(1, orders.getId());
  }

  @Test
  public void setLocalDateTimeTest() throws Exception {
    // Arrange
    Orders orders = new Orders();
    LocalDateTime localDateTime = null;

    // Act
    orders.setLocalDateTime(localDateTime);

    // Assert
    assertEquals(null, orders.getLocalDateTime());
  }

  @Test
  public void setUserTest() throws Exception {
    // Arrange
    Orders orders = new Orders();
    User user = new User();

    // Act
    orders.setUser(user);

    // Assert
    assertSame(user, orders.getUser());
  }
}
