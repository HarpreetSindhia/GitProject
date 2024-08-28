package LocatorsPractice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling_Concept {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> windowID = windowHandles.iterator();
		while(windowID.hasNext())
		{
			String parentID = windowID.next();
			String childID = windowID.next();
			
			driver.switchTo().window(childID);
			
			//Please email us at mentor@rahulshettyacademy.com with below template to receive response
		
		
		String userName = driver.findElement(By.cssSelector("div[class='row'] div:nth-child(2) p:nth-child(2)")).getText()
				.split("at")[1].trim().split("with")[0].trim();
		System.out.println(userName);
		
		driver.switchTo().window(parentID);
		driver.findElement(By.cssSelector(".form-group input[id='username']")).sendKeys(userName);
		
	}

}

}