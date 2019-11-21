package com.HavanaClub.tag;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class SizeTagTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void SizeTagTest() throws Exception {
    // Arrange and Act
    SizeTag sizeTag = new SizeTag();

    // Assert
    assertEquals(null, sizeTag.getParent());
  }
  @Test
  public void doTagTest() throws Exception {
    // Arrange
    SizeTag sizeTag = new SizeTag();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    sizeTag.doTag();
  }
  @Test
  public void setPosibleSizesTest() throws Exception {
    // Arrange
    SizeTag sizeTag = new SizeTag();
    String posibleSizes = ", ";

    // Act
    sizeTag.setPosibleSizes(posibleSizes);

    // Assert
    assertEquals(null, sizeTag.getParent());
  }
  @Test
  public void setSizeTest() throws Exception {
    // Arrange
    SizeTag sizeTag = new SizeTag();
    int size = 0;

    // Act
    sizeTag.setSize(size);

    // Assert
    assertEquals(null, sizeTag.getParent());
  }
  @Test
  public void setTitleTest() throws Exception {
    // Arrange
    SizeTag sizeTag = new SizeTag();
    String title = ", ";

    // Act
    sizeTag.setTitle(title);

    // Assert
    assertEquals(null, sizeTag.getParent());
  }
}
