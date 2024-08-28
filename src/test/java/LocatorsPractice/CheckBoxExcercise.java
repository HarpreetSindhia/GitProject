package LocatorsPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CheckBoxExcercise {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Boolean valueSelect_1 = driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected();
		Assert.assertFalse(valueSelect_1);
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		Boolean valueSelect = driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected();
		Assert.assertTrue(valueSelect);
		
		//Static Dropdowns
		
		WebElement staticDropdown = driver.findElement(By.name("dropdown-class-example"));
		
		Select dropdown = new Select(staticDropdown);
		
		dropdown.selectByIndex(1);
		//To validate if the option present in the static dropdown is selected or not 
		String staticOption = dropdown.getFirstSelectedOption().getText();
		Assert.assertEquals(staticOption, "Option1");
		
		dropdown.selectByValue("option2");
		String staticOption_1= dropdown.getFirstSelectedOption().getText();
		Assert.assertEquals(staticOption_1, "Option2");
		
		
		//AutoSuggestive Dropdowns 
		
		driver.findElement(By.cssSelector(".ui-autocomplete-input")).sendKeys("lu");
		List<WebElement> options = driver.findElements(By.cssSelector(".ui-widget div"));
		
		WebElement myCountry = options.stream().filter(t->t.getText().equalsIgnoreCase("Luxembourg")).findFirst().orElse(null);
		myCountry.click();
		
		
		//RadioButton
		Boolean valueSelect_5 = driver.findElement(By.cssSelector(".radioButton")).isSelected();
		Assert.assertTrue(valueSelect_5);
		driver.findElement(By.cssSelector(".radioButton")).click();
		Boolean valueSelect_2 = driver.findElement(By.cssSelector(".radioButton")).isSelected();
		Assert.assertFalse(valueSelect_2);
		
		
		
		
		
	}

}
