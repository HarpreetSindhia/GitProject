package LocatorsPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlingCheckboxandSize {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Boolean valueSelect_1 = driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected();
		Assert.assertFalse(valueSelect_1);
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		Boolean valueSelect = driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected();
		Assert.assertTrue(valueSelect);
		int sizeCheckBox = driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		Assert.assertEquals(sizeCheckBox, 6);
		
		
		
	}

}
