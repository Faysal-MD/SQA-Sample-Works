package demo;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestClass {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// initialization
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		// Site Navigate
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		// Login
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		// Title Check
		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		
//		type 1 -> Title Check
//		if (actualTitle.equals(expectedTitle)) {
//			System.out.println("Title Matched");
//		} else {
//			System.out.println("Title doesn't match");
//		}
		
		// type - 2 -> Title Check
		Assert.assertEquals(actualTitle, expectedTitle, "Conditions");
		
		// URL Check
		String expectedUrl = "https://www.saucedemo.com/inventory.html"; 
		String actualUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(actualUrl, expectedUrl, "URL does not match!");
		
		// Xpath
		// Select the element
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[6]/div[2]/div[1]/a/div")).click();
		// add to cart button
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@id = 'add-to-cart']")).click();
		// add to cart page
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		// Continue to shopping page
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/button[1]")).click();
		
	}

}
