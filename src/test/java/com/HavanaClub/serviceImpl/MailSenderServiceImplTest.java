package com.HavanaClub.serviceImpl;

import org.junit.Test;

public class MailSenderServiceImplTest {
  
  @Test
  public void sendMailTest() throws Exception {
    // Arrange
    MailSenderServiceImpl mailSenderServiceImpl = new MailSenderServiceImpl();
    String theme = "You have some problems with connection!";
    String mailBody = "You have some problems with connection!";
    String email = "You have some problems with connection!";

    // Act
    mailSenderServiceImpl.sendMail(theme, mailBody, email);
  }
}
