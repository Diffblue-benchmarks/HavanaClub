package com.HavanaClub;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
  
  @Test
  public void addTest() throws Exception {
    // Arrange
    Calculator calculator = new Calculator();
    int a = 1;
    int b = 1;

    // Act
    int actual = calculator.add(a, b);

    // Assert
    assertEquals(2, actual);
  }

  @Test
  public void divideTest() throws Exception {
    // Arrange
    Calculator calculator = new Calculator();
    int i = 1;
    int j = 1;

    // Act
    double actual = calculator.divide(i, j);

    // Assert
    assertEquals(1.0, actual, 0.1);
  }
}
