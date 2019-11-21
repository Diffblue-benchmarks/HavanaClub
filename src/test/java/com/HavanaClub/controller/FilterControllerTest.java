package com.HavanaClub.controller;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FilterControllerTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  
  @Test
  public void filterAlcoholTest() throws Exception {
    // Arrange
    FilterController filterController = new FilterController();
    String alcoValue = "aaaaa";

    // Act and Assert
    thrown.expect(NullPointerException.class);
    filterController.filterAlcohol(alcoValue);
  }
}
