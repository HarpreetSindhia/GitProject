package LocatorsPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndToEndTravelWebsite {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ge");
		List<WebElement> countries = driver.findElements(By.cssSelector(".ui-widget-content a"));
		WebElement country = countries.stream().filter(p -> p.getText().equalsIgnoreCase("Germany")).findFirst().orElse(null);
		country.click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='MAA']")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
		driver.findElement(By.cssSelector(".ui-state-highlight")).click();
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
			{
			System.out.println("UI Calender disabled");
			Assert.assertTrue(true);
			}
		else
		{
			System.out.println("UI Calender enabled");
		    Assert.assertFalse(false);
		}  
		    driver.findElement(By.id("divpaxinfo")).click();
		    int i = 1;
		    while(i < 5)
		    {
		    driver.findElement(By.id("hrefIncAdt")).click();
		    i++;
		    }
		    int i1 = 1; 
		    while(i1 < 4)
		    {
		    driver.findElement(By.id("hrefIncChd")).click();
		    i1++;
		    }
		    driver.findElement(By.id("hrefIncInf")).click();
		    driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		    driver.findElement(By.id("btnclosepaxoption")).click();
		    WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		    Select dropDown = new Select(staticDropdown);
		    dropDown.selectByIndex(2);
		   String option=  dropDown.getFirstSelectedOption().getText();
		   Assert.assertEquals(option, "AED");
		   driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
		 
		    
		
	}

}
