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
public class LinksHandling_Practice {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerSection = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerSection.findElements(By.tagName("a")).size());
		List<WebElement> footerSectionLinks = footerSection.findElements(By.tagName("a"));
		WebElement columnSection = footerSection.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnSection.findElements(By.tagName("a")).size());
		
		List<WebElement> firstColumnLinks = columnSection.findElements(By.tagName("a"));
		
		/*for(int i = 1; i < firstColumnLinks.size(); i++) {
			
			String onClickTabs = Keys.chord(Keys.CONTROL,Keys.ENTER);
			columnSection.findElements(By.tagName("a")).get(i).sendKeys(onClickTabs);
		}*/
		
		for(int i = 1; i < footerSectionLinks.size(); i++)
			
		{
			String onClickTabs = Keys.chord(Keys.CONTROL,Keys.ENTER);
			footerSection.findElements(By.tagName("a")).get(i).sendKeys(onClickTabs);
		}
		
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> windowID = windowHandles.iterator();
		while(windowID.hasNext())
		{
			driver.switchTo().window(windowID.next());
			System.out.println(driver.getTitle());
		}
		
		
		
		
		
		
		
		
		
		}

}
