package LocatorsPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LatestDropdownLoopingUI {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		driver.findElement(By.id("divpaxinfo")).click();
		int i = 1; 
		while(i<5) 
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
		}
		int k = 1;
		while(k<3) 
		{
			driver.findElement(By.id("hrefIncChd")).click();
			k++;
		}
		int m = 1;
		while(m<3) 
		{
			driver.findElement(By.id("hrefIncInf")).click();
			m++;
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		
	}

}
