package com.HavanaClub.serviceImpl;

import com.HavanaClub.entity.User;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UserServiceImplTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
    @Test
  public void deleteTest() throws Exception {
    // Arrange
    UserServiceImpl userServiceImpl = new UserServiceImpl();
    int id = 0;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    userServiceImpl.delete(id);
  }
  @Test
  public void findAllTest() throws Exception {
    // Arrange
    UserServiceImpl userServiceImpl = new UserServiceImpl();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    userServiceImpl.findAll();
  }
  @Test
  public void findByNameTest() throws Exception {
    // Arrange
    UserServiceImpl userServiceImpl = new UserServiceImpl();
    String name = "aaaaa";

    // Act and Assert
    thrown.expect(NullPointerException.class);
    userServiceImpl.findByName(name);
  }
  @Test
  public void findByUuidTest() throws Exception {
    // Arrange
    UserServiceImpl userServiceImpl = new UserServiceImpl();
    String uuid = "aaaaa";

    // Act and Assert
    thrown.expect(NullPointerException.class);
    userServiceImpl.findByUuid(uuid);
  }
  @Test
  public void findOneTest() throws Exception {
    // Arrange
    UserServiceImpl userServiceImpl = new UserServiceImpl();
    int id = 0;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    userServiceImpl.findOne(id);
  }
  @Test
  public void findUserByNameWithDrinksTest() throws Exception {
    // Arrange
    UserServiceImpl userServiceImpl = new UserServiceImpl();
    String name = "aaaaa";

    // Act and Assert
    thrown.expect(NullPointerException.class);
    userServiceImpl.findUserByNameWithDrinks(name);
  }
  @Test
  public void findUserWithDrinksTest() throws Exception {
    // Arrange
    UserServiceImpl userServiceImpl = new UserServiceImpl();
    int id = 0;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    userServiceImpl.findUserWithDrinks(id);
  }
  @Test
  public void findUserWithOrdersTest() throws Exception {
    // Arrange
    UserServiceImpl userServiceImpl = new UserServiceImpl();
    int id = 0;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    userServiceImpl.findUserWithOrders(id);
  }
  @Test
  public void loadUserByUsernameTest() throws Exception {
    // Arrange
    UserServiceImpl userServiceImpl = new UserServiceImpl();
    String name = "aaaaa";

    // Act and Assert
    thrown.expect(NullPointerException.class);
    userServiceImpl.loadUserByUsername(name);
  }
  @Test
  public void saveTest() throws Exception {
    // Arrange
    UserServiceImpl userServiceImpl = new UserServiceImpl();
    User user = new User();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    userServiceImpl.save(user);
  }
  @Test
  public void updateTest() throws Exception {
    // Arrange
    UserServiceImpl userServiceImpl = new UserServiceImpl();
    User user = new User();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    userServiceImpl.update(user);
  }
}
