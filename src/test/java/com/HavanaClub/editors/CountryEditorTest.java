package com.HavanaClub.editors;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class CountryEditorTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void CountryEditorTest() throws Exception {
    // Arrange and Act
    CountryEditor countryEditor = new CountryEditor();

    // Assert
    assertEquals(null, countryEditor.getAsText());
  }
  @Test
  public void setAsTextTest() throws Exception {
    // Arrange
    CountryEditor countryEditor = new CountryEditor();
    String idCountryFromJSP = "aaaaa";

    // Act and Assert
    thrown.expect(NumberFormatException.class);
    countryEditor.setAsText(idCountryFromJSP);
  }
}
