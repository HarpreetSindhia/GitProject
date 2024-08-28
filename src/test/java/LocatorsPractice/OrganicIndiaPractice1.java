package LocatorsPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OrganicIndiaPractice1 {
	
	
		public static void main(String[] args) throws InterruptedException 
		{		
		 //TODO Auto-generated method stub	
		 ChromeOptions options = new ChromeOptions();		
		 options.addArguments("disable-notifications");	
		 WebDriver driver = new ChromeDriver(options);	
		 driver.manage().window().maximize();	
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://organicindia.com/?utm_source=Google&utm_medium=cpc&utm_campaign=1335309963&utm_adgroup=54547528518&utm_keyword=organic%20india&utm_device=c&utm_placement=&utm_network=g&gad_source=1&gclid=EAIaIQobChMIxpzAwszGhwMVzNhMAh3siiugEAAYASAAEgJievD_BwE");
		 /**		 * Switch To Frame */	
		 WebElement frameElement = driver.findElement(By.xpath("//*[@id='cmessage_form_iframe']"));	
		 driver.switchTo().frame(frameElement);		
		 /** Handling the Popup window*/	
		 driver.findElement(By.xpath("//div[@class='close_icon']")).click();			
		 driver.switchTo().defaultContent();
		 List<WebElement> option1 = driver.findElements(By.xpath("//a[@class='link-title '] //span[@class='sp-link-title']"));	
		 WebElement firstLink = option1.stream().filter(p -> p.getText().equalsIgnoreCase("Shop by Category")).findFirst().orElse(null);	
		 firstLink.click();	
		 JavascriptExecutor executor = (JavascriptExecutor)driver;		
		 executor.executeScript("window.scrollBy(0,400)");
		 List<WebElement> nutrition = driver.findElements(By.cssSelector("li[class='supmenu-li'] a"));	
		 WebElement dailyNutrition = nutrition.stream().filter(e -> e.getText().equalsIgnoreCase("Daily Nutrition")).findFirst().orElse(null);	
		 dailyNutrition.click();	
		 List<WebElement> supplements = driver.findElements(By.xpath("//li[@class='st-col-item']/div/div[2]/div[1]/a"));
		 WebElement mySupplement = supplements.stream().filter(s -> s.getText().equalsIgnoreCase("Moringa Powder to Embrace t...")).findFirst().orElse(null);	
		 System.out.println(mySupplement);
		 
		 mySupplement.click();
		 driver.findElement(By.id("AddToCart")).click();
		 
		 
		}
		
	}
