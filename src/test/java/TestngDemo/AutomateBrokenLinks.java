package TestngDemo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateBrokenLinks {
	
	@Test
	public void automateBrokenLink() throws MalformedURLException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> allLinks = driver.findElements(By.cssSelector(".gf-li a"));
		
		SoftAssert softAssert = new SoftAssert();
				
				
		for(int i = 0; i < allLinks.size(); i++)
		{
			
			String url = allLinks.get(i).getAttribute("href");
		
		HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
		
		conn.setRequestMethod("HEAD");
		
		conn.connect();
		
		System.out.println(conn.getResponseCode());
		
		int responseCode = conn.getResponseCode();
		
		
		softAssert.assertTrue(responseCode<400, "The links " + allLinks.get(i).getText() + " is broken with code " +responseCode);
		
		}
		
		softAssert.assertAll();
		
		
		
	}
	
	
	@Test
	public void linkCount() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement footerSection = driver.findElement(By.cssSelector("#gf-BIG"));
		System.out.println(footerSection.findElements(By.tagName("a")).size());
		WebElement columnLinks = driver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]/ul/li"));
		List<WebElement> links = columnLinks.findElements(By.tagName("a"));
		for(int i = 0; i < links.size(); i++)
		{
			String onClickTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			links.get(i).sendKeys(onClickTab);
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
