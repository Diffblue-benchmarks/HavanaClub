package com.HavanaClub.validator.user;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserExceptionTest {

  @Test
  public void UserExceptionTest() throws Exception {
    // Arrange
    String message = "aaaaa";

    // Act
    UserException userException = new UserException(message);

    // Assert
    assertEquals("com.HavanaClub.validator.user.UserException: aaaaa", userException.toString());
  }
}
