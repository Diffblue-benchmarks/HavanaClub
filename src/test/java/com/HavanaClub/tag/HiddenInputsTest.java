package com.HavanaClub.tag;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class HiddenInputsTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void HiddenInputsTest() throws Exception {
    // Arrange and Act
    HiddenInputs hiddenInputs = new HiddenInputs();

    // Assert
    assertEquals(null, hiddenInputs.getParent());
  }

  @Test
  public void doTagTest() throws Exception {
    // Arrange
    HiddenInputs hiddenInputs = new HiddenInputs();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    hiddenInputs.doTag();
  }

  @Test
  public void setExcludeParamsTest() throws Exception {
    // Arrange
    HiddenInputs hiddenInputs = new HiddenInputs();
    String excludeParams = ", ";

    // Act
    hiddenInputs.setExcludeParams(excludeParams);

    // Assert
    assertEquals(null, hiddenInputs.getParent());
  }
}
