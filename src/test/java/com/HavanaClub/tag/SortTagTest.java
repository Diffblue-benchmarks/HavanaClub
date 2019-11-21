package com.HavanaClub.tag;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class SortTagTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void SortTagTest() throws Exception {
    // Arrange and Act
    SortTag sortTag = new SortTag();

    // Assert
    assertEquals(null, sortTag.getParent());
  }
  @Test
  public void doTagTest() throws Exception {
    // Arrange
    SortTag sortTag = new SortTag();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    sortTag.doTag();
  }
  @Test
  public void isParamValuePresentTest() throws Exception {
    // Arrange
    SortTag sortTag = new SortTag();
    HashMap<String, String[]> hashMap = new HashMap<String, String[]>();
    hashMap.put("", new String[]{"", "", ""});

    // Act
    boolean actual = sortTag.isParamValuePresent(hashMap);

    // Assert
    assertFalse(actual);
  }
  @Test
  public void setInnerHtmlTest() throws Exception {
    // Arrange
    SortTag sortTag = new SortTag();
    String innerHtml = "";

    // Act
    sortTag.setInnerHtml(innerHtml);

    // Assert
    assertEquals(null, sortTag.getParent());
  }
  @Test
  public void setParamValueTest() throws Exception {
    // Arrange
    SortTag sortTag = new SortTag();
    String paramValue = "";

    // Act
    sortTag.setParamValue(paramValue);

    // Assert
    assertEquals(null, sortTag.getParent());
  }
}
