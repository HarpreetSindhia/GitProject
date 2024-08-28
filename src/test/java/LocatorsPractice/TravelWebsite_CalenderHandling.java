package LocatorsPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TravelWebsite_CalenderHandling {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("input[value='RoundTrip']")).click();
		driver.findElement(By.name("ctl00$mainContent$view_date1")).click();
		driver.findElement(By.cssSelector(".ui-datepicker-group-first table tbody tr:nth-child(4) td:nth-child(6)")).click();
		driver.findElement(By.name("ctl00$mainContent$view_date2")).click();
		driver.findElement(By.cssSelector(".ui-datepicker-group-last div a")).click();
		driver.findElement(By.cssSelector(".ui-datepicker-group-last table tbody tr:nth-child(3) td:nth-child(3) a")).click();
		
		
		
	}

}
