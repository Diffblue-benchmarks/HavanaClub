package com.HavanaClub.editors;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class IngredientEditorTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void IngredientEditorTest() throws Exception {
    // Arrange and Act
    IngredientEditor ingredientEditor = new IngredientEditor();

    // Assert
    assertEquals(null, ingredientEditor.getAsText());
  }

  @Test
  public void setAsTextTest() throws Exception {
    // Arrange
    IngredientEditor ingredientEditor = new IngredientEditor();
    String text = "aaaaa";

    // Act and Assert
    thrown.expect(NumberFormatException.class);
    ingredientEditor.setAsText(text);
  }
}
