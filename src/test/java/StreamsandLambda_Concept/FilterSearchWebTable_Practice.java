package StreamsandLambda_Concept;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FilterSearchWebTable_Practice {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/Offers/");
		driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys("Potato");
		List<WebElement> itemMatched = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		List<WebElement> filterMatch = itemMatched.stream().filter(i->i.getText().contains("Potato")).collect(Collectors.toList());
		Assert.assertEquals(itemMatched, filterMatch);
		
		
		
		
	}

}
