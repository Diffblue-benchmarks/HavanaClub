package com.HavanaClub.serviceImpl;

import com.HavanaClub.entity.Country;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.util.ArrayList;

public class CountryServiceImplTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
    @Test
  public void countriesWithImagesTest() throws Exception {
    // Arrange
    CountryServiceImpl countryServiceImpl = new CountryServiceImpl();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    countryServiceImpl.countriesWithImages();
  }
  @Test
  public void deleteTest() throws Exception {
    // Arrange
    CountryServiceImpl countryServiceImpl = new CountryServiceImpl();
    int id = 1;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    countryServiceImpl.delete(id);
  }
  @Test
  public void findAllTest() throws Exception {
    // Arrange
    CountryServiceImpl countryServiceImpl = new CountryServiceImpl();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    countryServiceImpl.findAll();
  }
  @Test
  public void findOneTest() throws Exception {
    // Arrange
    CountryServiceImpl countryServiceImpl = new CountryServiceImpl();
    int id = 1;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    countryServiceImpl.findOne(id);
  }
  @Test
  public void saveTest() throws Exception {
    // Arrange
    CountryServiceImpl countryServiceImpl = new CountryServiceImpl();
    Country country = new Country();
    ArrayList<MultipartFile> arrayList = new ArrayList<MultipartFile>();
    arrayList.add(null);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    countryServiceImpl.save(country, arrayList);
  }
  @Test
  public void updateTest() throws Exception {
    // Arrange
    CountryServiceImpl countryServiceImpl = new CountryServiceImpl();
    Country country = new Country();
    CommonsMultipartFile image = null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    countryServiceImpl.update(country, image);
  }
}
