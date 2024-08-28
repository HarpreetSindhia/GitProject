package ChomeOptionsClass;

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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyCarmesi_BlockPopupWindows {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(5));
		driver.get("https://www.mycarmesi.com/");
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='cntl-placeholder-form-fixed-item']/iframe")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='form-body-main']/div[1]//div[@class='close_icon']")));
		driver.findElement(By.xpath("//div[@id='form-body-main']/div[1]//div[@class='close_icon']")).click();
		driver.switchTo().defaultContent();
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//div[@class='text-center']/ul/li[3]/a"))).build().perform();
		WebElement groomingNeeds = driver.findElement(By.xpath("//div[@class='text-center']/ul/li[3]/ul"));
		System.out.println(groomingNeeds.findElements(By.tagName("a")).size());
		
		List<WebElement> groomingLinks = groomingNeeds.findElements(By.tagName("a"));
		
		for(int i = 0; i < groomingLinks.size(); i++)
		{
			String onClickTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			groomingLinks.get(i).sendKeys(onClickTab);
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
