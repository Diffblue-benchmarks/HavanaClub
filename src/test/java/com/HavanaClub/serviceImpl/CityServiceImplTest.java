package com.HavanaClub.serviceImpl;

import com.HavanaClub.entity.City;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CityServiceImplTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
    @Test
  public void deleteTest() throws Exception {
    // Arrange
    CityServiceImpl cityServiceImpl = new CityServiceImpl();
    int id = 1;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    cityServiceImpl.delete(id);
  }
  @Test
  public void findAllTest() throws Exception {
    // Arrange
    CityServiceImpl cityServiceImpl = new CityServiceImpl();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    cityServiceImpl.findAll();
  }
  @Test
  public void saveTest() throws Exception {
    // Arrange
    CityServiceImpl cityServiceImpl = new CityServiceImpl();
    City city = new City();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    cityServiceImpl.save(city);
  }
  @Test
  public void updateTest() throws Exception {
    // Arrange
    CityServiceImpl cityServiceImpl = new CityServiceImpl();
    String info = "aaaaa";

    // Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    cityServiceImpl.update(info);
  }
}
