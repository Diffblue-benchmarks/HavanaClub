package com.HavanaClub.controller;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.ui.ExtendedModelMap;

import javax.management.remote.JMXPrincipal;

public class OrdersControllerTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
    @Test
  public void buyTest() throws Exception {
    // Arrange
    OrdersController ordersController = new OrdersController();
    JMXPrincipal principal = new JMXPrincipal("aaaaa");
    int id = 1;
    ExtendedModelMap extendedModelMap = new ExtendedModelMap();
    extendedModelMap.put("aaaaa", "aaaaaaaaaaaaaaa");

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ordersController.buy(principal, id, extendedModelMap);
  }
  @Test
  public void buyTest2() throws Exception {
    // Arrange
    OrdersController ordersController = new OrdersController();
    JMXPrincipal principal = new JMXPrincipal("aaaaa");

    // Act and Assert
    thrown.expect(NumberFormatException.class);
    ordersController.buy(principal);
  }
  @Test
  public void deleteFromBasketTest() throws Exception {
    // Arrange
    OrdersController ordersController = new OrdersController();
    int userId = 1;
    int drinkId = 1;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ordersController.deleteFromBasket(userId, drinkId);
  }
}
