package com.HavanaClub.entity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class UserTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void UserTest() throws Exception {
    // Arrange
    String name = "aaaaa";
    String email = "aaaaa";
    String password = "aaaaa";

    // Act
    User user = new User(name, email, password);

    // Assert
    String name1 = user.getName();
    String toStringResult = user.toString();
    String email1 = user.getEmail();
    assertEquals("aaaaa", user.getPassword());
    assertEquals("aaaaa", email1);
    assertEquals("User{id=0, name='aaaaa', email='aaaaa', password='aaaaa', drinks=[]}", toStringResult);
    assertEquals("aaaaa", name1);
  }

  @Test
  public void UserTest2() throws Exception {
    // Arrange and Act
    User user = new User();

    // Assert
    assertEquals("User{id=0, name='null', email='null', password='null', drinks=[]}", user.toString());
  }

  @Test
  public void UserTest3() throws Exception {
    // Arrange
    String name = "aaaaa";
    String password = "aaaaa";

    // Act
    User user = new User(name, password);

    // Assert
    String name1 = user.getName();
    String toStringResult = user.toString();
    assertEquals("aaaaa", user.getPassword());
    assertEquals("User{id=0, name='aaaaa', email='null', password='aaaaa', drinks=[]}", toStringResult);
    assertEquals("aaaaa", name1);
  }

  @Test
  public void getAuthoritiesTest() throws Exception {
    // Arrange
    User user = new User();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    user.getAuthorities();
  }

  @Test
  public void getDrinksTest() throws Exception {
    // Arrange
    User user = new User();

    // Act
    List<Drink> actual = user.getDrinks();

    // Assert
    assertEquals(0, actual.size());
  }

  @Test
  public void getEmailTest() throws Exception {
    // Arrange
    User user = new User();

    // Act
    String actual = user.getEmail();

    // Assert
    assertEquals(null, actual);
  }

  @Test
  public void getIdTest() throws Exception {
    // Arrange
    User user = new User();

    // Act
    int actual = user.getId();

    // Assert
    assertEquals(0, actual);
  }

  @Test
  public void getNameTest() throws Exception {
    // Arrange
    User user = new User();

    // Act
    String actual = user.getName();

    // Assert
    assertEquals(null, actual);
  }

  @Test
  public void getOrdersTest() throws Exception {
    // Arrange
    User user = new User();

    // Act
    Set<Orders> actual = user.getOrders();

    // Assert
    assertEquals(0, actual.size());
  }

  @Test
  public void getPasswordTest() throws Exception {
    // Arrange
    User user = new User();

    // Act
    String actual = user.getPassword();

    // Assert
    assertEquals(null, actual);
  }

  @Test
  public void getRoleTest() throws Exception {
    // Arrange
    User user = new User();

    // Act
    Role actual = user.getRole();

    // Assert
    assertEquals(null, actual);
  }

  @Test
  public void getUsernameTest() throws Exception {
    // Arrange
    User user = new User();

    // Act
    String actual = user.getUsername();

    // Assert
    assertEquals("0", actual);
  }

  @Test
  public void getUuidTest() throws Exception {
    // Arrange
    User user = new User();

    // Act
    String actual = user.getUuid();

    // Assert
    assertEquals(null, actual);
  }

  @Test
  public void isAccountNonExpiredTest() throws Exception {
    // Arrange
    User user = new User();

    // Act
    boolean actual = user.isAccountNonExpired();

    // Assert
    assertTrue(actual);
  }

  @Test
  public void isAccountNonLockedTest() throws Exception {
    // Arrange
    User user = new User();

    // Act
    boolean actual = user.isAccountNonLocked();

    // Assert
    assertTrue(actual);
  }

  @Test
  public void isCredentialsNonExpiredTest() throws Exception {
    // Arrange
    User user = new User();

    // Act
    boolean actual = user.isCredentialsNonExpired();

    // Assert
    assertTrue(actual);
  }

  @Test
  public void isEnableTest() throws Exception {
    // Arrange
    User user = new User();

    // Act
    boolean actual = user.isEnable();

    // Assert
    assertFalse(actual);
  }

  @Test
  public void isEnabledTest() throws Exception {
    // Arrange
    User user = new User();

    // Act
    boolean actual = user.isEnabled();

    // Assert
    assertFalse(actual);
  }

  @Test
  public void setDrinksTest() throws Exception {
    // Arrange
    User user = new User();
    ArrayList<Drink> arrayList = new ArrayList<Drink>();
    arrayList.add(new Drink());

    // Act
    user.setDrinks(arrayList);

    // Assert
    assertEquals(
        "User{id=0, name='null', email='null', password='null', drinks=[Drink{id=0, drinkName='null', price=0, alcohol=false}]}",
        user.toString());
  }

  @Test
  public void setEmailTest() throws Exception {
    // Arrange
    User user = new User();
    String email = "aaaaa";

    // Act
    user.setEmail(email);

    // Assert
    assertEquals("aaaaa", user.getEmail());
  }

  @Test
  public void setEnableTest() throws Exception {
    // Arrange
    User user = new User();
    boolean enable = true;

    // Act
    user.setEnable(enable);

    // Assert
    assertTrue(user.isEnabled());
  }

  @Test
  public void setIdTest() throws Exception {
    // Arrange
    User user = new User();
    int id = 1;

    // Act
    user.setId(id);

    // Assert
    assertEquals(1, user.getId());
  }

  @Test
  public void setNameTest() throws Exception {
    // Arrange
    User user = new User();
    String name = "aaaaa";

    // Act
    user.setName(name);

    // Assert
    assertEquals("aaaaa", user.getName());
  }

  @Test
  public void setOrdersTest() throws Exception {
    // Arrange
    User user = new User();
    HashSet<Orders> hashSet = new HashSet<Orders>();
    hashSet.add(new Orders());

    // Act
    user.setOrders(hashSet);

    // Assert
    assertSame(hashSet, user.getOrders());
  }

  @Test
  public void setPasswordTest() throws Exception {
    // Arrange
    User user = new User();
    String password = "aaaaa";

    // Act
    user.setPassword(password);

    // Assert
    assertEquals("aaaaa", user.getPassword());
  }

  @Test
  public void setRoleTest() throws Exception {
    // Arrange
    User user = new User();
    Role role = Role.ROLE_ADMIN;

    // Act
    user.setRole(role);

    // Assert
    assertEquals(Role.ROLE_ADMIN, user.getRole());
  }

  @Test
  public void setUuidTest() throws Exception {
    // Arrange
    User user = new User();
    String uuid = "aaaaa";

    // Act
    user.setUuid(uuid);

    // Assert
    assertEquals("aaaaa", user.getUuid());
  }

  @Test
  public void toStringTest() throws Exception {
    // Arrange
    User user = new User();

    // Act
    String actual = user.toString();

    // Assert
    assertEquals("User{id=0, name='null', email='null', password='null', drinks=[]}", actual);
  }
}
