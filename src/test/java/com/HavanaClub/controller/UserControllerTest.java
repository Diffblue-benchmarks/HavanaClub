package com.HavanaClub.controller;

import com.HavanaClub.entity.User;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.ui.ExtendedModelMap;

import javax.management.remote.JMXPrincipal;

import static org.junit.Assert.assertEquals;

public class UserControllerTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
    @Test
  public void confirmTest() throws Exception {
    // Arrange
    UserController userController = new UserController();
    String uuid = "EMAIL ALREADY EXIST";

    // Act and Assert
    thrown.expect(NullPointerException.class);
    userController.confirm(uuid);
  }
  @Test
  public void failureLoginTest() throws Exception {
    // Arrange
    UserController userController = new UserController();
    ExtendedModelMap extendedModelMap = new ExtendedModelMap();
    extendedModelMap.put("EMAIL ALREADY EXIST", "EMAIL ALREADY EXIST");
    String username = "EMAIL ALREADY EXIST";
    String password = "EMAIL ALREADY EXIST";

    // Act and Assert
    thrown.expect(NullPointerException.class);
    userController.failureLogin(extendedModelMap, username, password);
  }
  @Test
  public void historyTest() throws Exception {
    // Arrange
    UserController userController = new UserController();
    JMXPrincipal principal = new JMXPrincipal("EMAIL ALREADY EXIST");
    ExtendedModelMap extendedModelMap = new ExtendedModelMap();
    extendedModelMap.put("EMAIL ALREADY EXIST", "EMAIL ALREADY EXIST");

    // Act and Assert
    thrown.expect(NumberFormatException.class);
    userController.history(principal, extendedModelMap);
  }
  @Test
  public void profileTest() throws Exception {
    // Arrange
    UserController userController = new UserController();
    JMXPrincipal principal = new JMXPrincipal("EMAIL ALREADY EXIST");
    ExtendedModelMap extendedModelMap = new ExtendedModelMap();
    extendedModelMap.put("EMAIL ALREADY EXIST", "EMAIL ALREADY EXIST");

    // Act and Assert
    thrown.expect(NumberFormatException.class);
    userController.profile(principal, extendedModelMap);
  }
  @Test
  public void signUpTest() throws Exception {
    // Arrange
    UserController userController = new UserController();
    User user = new User();
    ExtendedModelMap extendedModelMap = new ExtendedModelMap();
    extendedModelMap.put("EMAIL ALREADY EXIST", "EMAIL ALREADY EXIST");

    // Act and Assert
    thrown.expect(NullPointerException.class);
    userController.signUp(user, extendedModelMap);
  }
  @Test
  public void signUpTest2() throws Exception {
    // Arrange
    UserController userController = new UserController();
    ExtendedModelMap extendedModelMap = new ExtendedModelMap();
    extendedModelMap.put("EMAIL ALREADY EXIST", "EMAIL ALREADY EXIST");

    // Act
    String actual = userController.signUp(extendedModelMap);

    // Assert
    assertEquals("views-user-signUp", actual);
  }
}
