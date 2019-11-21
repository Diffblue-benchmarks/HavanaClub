package com.HavanaClub.serviceImpl;

import com.HavanaClub.entity.Orders;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import javax.management.remote.JMXPrincipal;

public class OrdersServiceImplTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
    @Test
  public void addIntoBasketTest() throws Exception {
    // Arrange
    OrdersServiceImpl ordersServiceImpl = new OrdersServiceImpl();
    JMXPrincipal principal = new JMXPrincipal("aaaaa");
    int id = 1;

    // Act and Assert
    thrown.expect(NumberFormatException.class);
    ordersServiceImpl.addIntoBasket(principal, id);
  }
  @Test
  public void buyTest() throws Exception {
    // Arrange
    OrdersServiceImpl ordersServiceImpl = new OrdersServiceImpl();
    int userId = 1;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ordersServiceImpl.buy(userId);
  }
  @Test
  public void deleteFromBasketTest() throws Exception {
    // Arrange
    OrdersServiceImpl ordersServiceImpl = new OrdersServiceImpl();
    int userId = 1;
    int drinkId = 1;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ordersServiceImpl.deleteFromBasket(userId, drinkId);
  }
  @Test
  public void deleteTest() throws Exception {
    // Arrange
    OrdersServiceImpl ordersServiceImpl = new OrdersServiceImpl();
    int id = 1;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ordersServiceImpl.delete(id);
  }
  @Test
  public void findAllTest() throws Exception {
    // Arrange
    OrdersServiceImpl ordersServiceImpl = new OrdersServiceImpl();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ordersServiceImpl.findAll();
  }
  @Test
  public void findOneTest() throws Exception {
    // Arrange
    OrdersServiceImpl ordersServiceImpl = new OrdersServiceImpl();
    int id = 1;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ordersServiceImpl.findOne(id);
  }
  @Test
  public void updateTest() throws Exception {
    // Arrange
    OrdersServiceImpl ordersServiceImpl = new OrdersServiceImpl();
    Orders orders = new Orders();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ordersServiceImpl.update(orders);
  }
}
