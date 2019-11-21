package com.HavanaClub.tag;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class PageableTagTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void PageableTagTest() throws Exception {
    // Arrange and Act
    PageableTag pageableTag = new PageableTag();

    // Assert
    assertEquals(null, pageableTag.getParent());
  }
  @Test
  public void doTagTest() throws Exception {
    // Arrange
    PageableTag pageableTag = new PageableTag();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    pageableTag.doTag();
  }
  @Test
  public void setCellTest() throws Exception {
    // Arrange
    PageableTag pageableTag = new PageableTag();
    String cell = "<";

    // Act and Assert
    thrown.expect(StringIndexOutOfBoundsException.class);
    pageableTag.setCell(cell);
  }
  @Test
  public void setContainerTest() throws Exception {
    // Arrange
    PageableTag pageableTag = new PageableTag();
    String container = "<";

    // Act and Assert
    thrown.expect(StringIndexOutOfBoundsException.class);
    pageableTag.setContainer(container);
  }
}
