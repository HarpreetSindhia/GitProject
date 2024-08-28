package LocatorsPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Vaaare_LinksPractice {
	
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.vaaree.com/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.cssSelector(".t4s-col-item nav ul li:nth-child(1) a"))).build().perform();
		actions.moveToElement(driver.findElement(By.cssSelector("#content_mega_GKngKq div div"))).build().perform();
		
		WebElement headerSection = driver.findElement(By.cssSelector("#content_mega_GKngKq div div"));
		
		System.out.println(headerSection.findElements(By.tagName("a")).size());
		List<WebElement> headerSectionLinks = headerSection.findElements(By.tagName("a"));
		
		for(int i = 0; i < headerSectionLinks.size(); i++)
		{
			
			String seperateTabOpen = Keys.chord(Keys.CONTROL , Keys.ENTER);
			headerSection.findElements(By.tagName("a")).get(i).sendKeys(seperateTabOpen);
		}
		
		
		
		
		
	
		
		
		
	}

}
