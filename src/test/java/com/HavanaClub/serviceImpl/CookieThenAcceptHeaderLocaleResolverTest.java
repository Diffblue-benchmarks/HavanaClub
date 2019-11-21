package com.HavanaClub.serviceImpl;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import javax.servlet.http.HttpServletRequestWrapper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class CookieThenAcceptHeaderLocaleResolverTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void CookieThenAcceptHeaderLocaleResolverTest() throws Exception {
    // Arrange and Act
    CookieThenAcceptHeaderLocaleResolver cookieThenAcceptHeaderLocaleResolver = new CookieThenAcceptHeaderLocaleResolver();

    // Assert
    boolean isLanguageTagCompliantResult = cookieThenAcceptHeaderLocaleResolver.isLanguageTagCompliant();
    String cookiePath = cookieThenAcceptHeaderLocaleResolver.getCookiePath();
    boolean isCookieSecureResult = cookieThenAcceptHeaderLocaleResolver.isCookieSecure();
    String cookieName = cookieThenAcceptHeaderLocaleResolver.getCookieName();
    Integer cookieMaxAge = cookieThenAcceptHeaderLocaleResolver.getCookieMaxAge();
    assertFalse(isLanguageTagCompliantResult);
    assertFalse(cookieThenAcceptHeaderLocaleResolver.isCookieHttpOnly());
    assertEquals(null, cookieMaxAge);
    assertEquals("org.springframework.web.servlet.i18n.CookieLocaleResolver.LOCALE", cookieName);
    assertFalse(isCookieSecureResult);
    assertEquals("/", cookiePath);
  }

  @Test
  public void determineDefaultLocaleTest() throws Exception {
    // Arrange
    CookieThenAcceptHeaderLocaleResolver cookieThenAcceptHeaderLocaleResolver = new CookieThenAcceptHeaderLocaleResolver();
    HttpServletRequestWrapper request = null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    cookieThenAcceptHeaderLocaleResolver.determineDefaultLocale(request);
  }
}
