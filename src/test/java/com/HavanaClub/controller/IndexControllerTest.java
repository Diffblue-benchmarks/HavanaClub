package com.HavanaClub.controller;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.data.domain.PageRequest;
import org.springframework.ui.ExtendedModelMap;

import javax.management.remote.JMXPrincipal;

import static org.junit.Assert.assertEquals;

public class IndexControllerTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void IndexControllerTest() throws Exception {
    // Arrange and Act
    IndexController indexController = new IndexController();

    // Assert
    assertEquals("views-admin-city", indexController.city());
  }
  @Test
  public void cityTest() throws Exception {
    // Arrange
    IndexController indexController = new IndexController();

    // Act
    String actual = indexController.city();

    // Assert
    assertEquals("views-admin-city", actual);
  }
  @Test
  public void indexAfterLoginTest() throws Exception {
    // Arrange
    IndexController indexController = new IndexController();
    ExtendedModelMap extendedModelMap = new ExtendedModelMap();
    extendedModelMap.put("admin", "admin");
    String username = "admin";
    PageRequest pageable = new PageRequest(1, 1);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    indexController.indexAfterLogin(extendedModelMap, username, pageable);
  }
  @Test
  public void indexTest() throws Exception {
    // Arrange
    IndexController indexController = new IndexController();
    ExtendedModelMap extendedModelMap = new ExtendedModelMap();
    extendedModelMap.put("admin", "admin");
    JMXPrincipal principal = new JMXPrincipal("admin");
    PageRequest pageable = new PageRequest(1, 655361);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    indexController.index(extendedModelMap, principal, pageable);
  }
  @Test
  public void randomTest() throws Exception {
    // Arrange
    IndexController indexController = new IndexController();
    ExtendedModelMap extendedModelMap = new ExtendedModelMap();
    extendedModelMap.put("admin", "admin");

    // Act and Assert
    thrown.expect(NullPointerException.class);
    indexController.random(extendedModelMap);
  }
  @Test
  public void recipeTest() throws Exception {
    // Arrange
    IndexController indexController = new IndexController();
    ExtendedModelMap extendedModelMap = new ExtendedModelMap();
    extendedModelMap.put("admin", "admin");
    int id = 1;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    indexController.recipe(extendedModelMap, id);
  }
}
