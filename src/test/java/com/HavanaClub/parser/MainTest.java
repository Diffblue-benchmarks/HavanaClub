package com.HavanaClub.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
  
  @Test
  public void mainTest() throws Exception {
    // Arrange
    String[] stringArray = new String[]{"C:\\workspace\\apache-tomcat-8.0.33\\resources\\newFolder\\qwe",
        "C:\\workspace\\apache-tomcat-8.0.33\\resources\\newFolder\\qwe",
        "C:\\workspace\\apache-tomcat-8.0.33\\resources\\newFolder\\qwe"};

    // Act
    Main.main(stringArray);

    // Assert
    assertEquals(3, stringArray.length);
  }
}
