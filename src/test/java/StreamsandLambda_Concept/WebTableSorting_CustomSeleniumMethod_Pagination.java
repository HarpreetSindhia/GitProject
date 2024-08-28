package StreamsandLambda_Concept;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableSorting_CustomSeleniumMethod_Pagination {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers/");
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> itemsList = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		List<String> originalList = itemsList.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(originalList.equals(sortedList));
		
		List<String> priceFruit;
		do
		{
		
			List<WebElement> itemsList1 = driver.findElements(By.xpath("//tbody/tr/td[1]"));
			
		priceFruit = itemsList1.stream().filter(s->s.getText().contains("Wheat")).map(s->s.findElement(By.xpath("following-sibling::td[1]")).getText()).collect(Collectors.toList());
		
		priceFruit.forEach(a->System.out.println(a));
		
		if(priceFruit.size() < 1)
		{
			driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		}
			
	}while(priceFruit.size() < 1);

}
	
}
