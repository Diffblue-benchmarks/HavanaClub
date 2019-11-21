package com.HavanaClub.serviceImpl;

import com.HavanaClub.entity.Ingredient;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.data.domain.PageRequest;

public class IngredientServiceImplTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
    @Test
  public void deleteTest() throws Exception {
    // Arrange
    IngredientServiceImpl ingredientServiceImpl = new IngredientServiceImpl();
    int id = 1;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ingredientServiceImpl.delete(id);
  }
  @Test
  public void findAllPagesTest() throws Exception {
    // Arrange
    IngredientServiceImpl ingredientServiceImpl = new IngredientServiceImpl();
    PageRequest pageable = new PageRequest(1, 1);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ingredientServiceImpl.findAllPages(pageable);
  }
  @Test
  public void findAllTest() throws Exception {
    // Arrange
    IngredientServiceImpl ingredientServiceImpl = new IngredientServiceImpl();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ingredientServiceImpl.findAll();
  }
  @Test
  public void findOneTest() throws Exception {
    // Arrange
    IngredientServiceImpl ingredientServiceImpl = new IngredientServiceImpl();
    int id = 1;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ingredientServiceImpl.findOne(id);
  }
  @Test
  public void saveTest() throws Exception {
    // Arrange
    IngredientServiceImpl ingredientServiceImpl = new IngredientServiceImpl();
    Ingredient ingredient = new Ingredient();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ingredientServiceImpl.save(ingredient);
  }
  @Test
  public void updateTest() throws Exception {
    // Arrange
    IngredientServiceImpl ingredientServiceImpl = new IngredientServiceImpl();
    Ingredient ingredient = new Ingredient();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ingredientServiceImpl.update(ingredient);
  }
}
