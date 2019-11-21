package com.HavanaClub.validator.user;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UserValidatorTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  
  @Test
  public void validateTest() throws Exception {
    // Arrange
    UserValidator userValidator = new UserValidator();
    String o = "@";

    // Act and Assert
    thrown.expect(ClassCastException.class);
    userValidator.validate(o);
  }
}
