# Saucedemo Automation
This repository contains automation tests for the [Saucedemo](https://www.saucedemo.com/v1/) website using Selenium WebDriver with Java. The tests cover validation of the login functionality, including username, password, login button, website title, and URL.

The following tests are included:

1. **Username Test:**
    - Verifies that the username field is present and can be interacted with.

2. **Password Test:**
    - Verifies that the password field is present and can be interacted with.

3. **Login Button Test:**
    - Verifies that the login button is present and clickable.

4. **Website Title Test:**
    - Verifies that the website title is correct.

5. **Website URL Test:**
    - Verifies that the website URL is correct.

### Example Test Method

```java
@Test
public void testLoginButtonIsDisplayed() {
    WebElement loginButton = driver.findElement(By.id("login-button"));
    Assert.assertTrue(loginButton.isDisplayed());
}
