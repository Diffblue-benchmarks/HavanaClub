package com.HavanaClub.validator.userLoginValidation;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UserLoginValidatorTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
    @Test
  public void validateTest() throws Exception {
    // Arrange
    UserLoginValidator userLoginValidator = new UserLoginValidator();
    String o = "EMPTY USERNAME FIELD";

    // Act and Assert
    thrown.expect(ClassCastException.class);
    userLoginValidator.validate(o);
  }
}
