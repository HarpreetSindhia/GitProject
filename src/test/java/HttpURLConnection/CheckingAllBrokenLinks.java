package HttpURLConnection;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class CheckingAllBrokenLinks {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> allLinks = driver.findElements(By.cssSelector(".gf-li a"));
		
		SoftAssert soft = new SoftAssert();
		
		for(int i = 0; i < allLinks.size(); i++)
		{
			
			String url = allLinks.get(i).getAttribute("href");
			
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int resCode = conn.getResponseCode();
			
			System.out.println(resCode);
			
			soft.assertTrue(resCode<400,"The link " +allLinks.get(i).getText()+ " is broken with code" + resCode);
			
		}
		
		
		soft.assertAll();
		
		
		
		
	}

}
