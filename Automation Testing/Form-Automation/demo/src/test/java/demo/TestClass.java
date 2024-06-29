package demo;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// initialization
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		// Site Navigate
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		
		// name
		driver.findElement(By.id("fname")).sendKeys("Faysal");
		driver.findElement(By.id("lname")).sendKeys("Mahmud");
		
		// web element
		// Radio button
		WebElement radioButton = driver.findElement(By.id("male"));
		radioButton.click();
		
		assert radioButton.isSelected();
		System.out.println(radioButton.isSelected());
		
		// Dropdown
		WebElement testDropdown = driver.findElement(By.id("option"));
		Select dropdown = new Select(testDropdown);
				
//		dropdown.selectByIndex(2);
		dropdown.selectByValue("option 1");
//		dropdown.selectByVisibleText("Option 1");
		
		// scroll dropdown
		WebElement testScrollDropdown = driver.findElement(By.id("owc"));
		Select scrollDropdown = new Select(testScrollDropdown);
				
		scrollDropdown.selectByValue("option 2");
		
		// check box
		WebElement checkbox1 = driver.findElement(By.id("moption"));
		checkbox1.click();
		
		WebElement checkbox2 = driver.findElement(By.name("option2"));
		checkbox2.click();
		
		// submit button
		driver.findElement(By.className("btn-success")).click();
	}

}
