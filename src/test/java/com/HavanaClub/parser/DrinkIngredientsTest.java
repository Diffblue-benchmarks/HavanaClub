package com.HavanaClub.parser;

import com.HavanaClub.entity.Drink;
import org.jsoup.nodes.Document;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class DrinkIngredientsTest {
  
  @Test
  public void getDrinkNamesTest() throws Exception {
    // Arrange
    Document document = new Document("(");

    // Act
    List<Drink> actual = DrinkIngredients.getDrinkNames(document);

    // Assert
    assertEquals(0, actual.size());
  }
}
