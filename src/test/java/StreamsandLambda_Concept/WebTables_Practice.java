package StreamsandLambda_Concept;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTables_Practice {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/Offers/");
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> items = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		List<String> originalList = items.stream().map(e->e.getText()).collect(Collectors.toList());
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(originalList.equals(sortedList));
		
		List<String> priceValue;
		do
		{
			
			List<WebElement> items1 = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		
		priceValue = items1.stream().filter(a->a.getText().contains("Guava")).map(a->a.findElement(By.xpath("following-sibling::td[1]")).getText()).collect(Collectors.toList());
		
		
		priceValue.forEach(a->System.out.println(a));
		
		if(priceValue.size() < 1)
		{
			driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		}
		
		
		
	}while(priceValue.size() < 1);

}

}