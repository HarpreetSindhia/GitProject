package LocatorsPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class StaticDropDowns {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement staticDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		//Select class is used to handle the static dropdowns 
		Select dropDown = new Select(staticDropDown);
		dropDown.selectByIndex(3);
		String option1 = dropDown.getFirstSelectedOption().getText();
		Assert.assertEquals(option1, "USD");
		
		dropDown.selectByVisibleText("AED");
		String option2 = dropDown.getFirstSelectedOption().getText();
		Assert.assertEquals(option2, "AED");
		
		dropDown.selectByValue("INR");
		String option3 = dropDown.getFirstSelectedOption().getText();
		Assert.assertEquals(option3, "INR");
		
		
		
		
		
		
		
	}

}
