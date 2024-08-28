package LocatorsPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlertHandle {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys("Harpreet Sindhia");
		driver.findElement(By.id("alertbtn")).click();
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmbtn")).click();
		String confirmMessage = driver.switchTo().alert().getText();
		System.out.println(confirmMessage);
		driver.switchTo().alert().dismiss();
		
		
	}
}
