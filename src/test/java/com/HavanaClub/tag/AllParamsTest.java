package com.HavanaClub.tag;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class AllParamsTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void AllParamsTest() throws Exception {
    // Arrange and Act
    AllParams allParams = new AllParams();

    // Assert
    assertEquals(null, allParams.getParent());
  }

  @Test
  public void doTagTest() throws Exception {
    // Arrange
    AllParams allParams = new AllParams();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    allParams.doTag();
  }
}
