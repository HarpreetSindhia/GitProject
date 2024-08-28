package LocatorsPractice;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LinksHandlingPractice2_Vaaree {
	
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.vaaree.com/");
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.cssSelector("#item_mega_9B3cx3 a"))).build().perform();
		WebElement kidsSection = driver.findElement(By.cssSelector("#content_mega_9B3cx3 div div"));
		System.out.println(kidsSection.findElements(By.tagName("a")).size());
		List<WebElement> kidsSectionLinks = kidsSection.findElements(By.tagName("a"));
		
		for(int i = 0; i < kidsSectionLinks.size(); i++ )
		{
			
			String onClickTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			kidsSection.findElements(By.tagName("a")).get(i).sendKeys(onClickTab);
		}
		
		//Grab the title of every window opened 
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> windowID = windowHandles.iterator();
		while(windowID.hasNext())
		{
			
			driver.switchTo().window(windowID.next());
			System.out.println(driver.getTitle());
		}
		
		
		
		
		
		
	}

}
