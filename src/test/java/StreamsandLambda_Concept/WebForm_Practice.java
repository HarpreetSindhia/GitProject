package StreamsandLambda_Concept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebForm_Practice {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("//form/div[1]/input")).sendKeys("Harpreet Kaur");
		driver.findElement(By.xpath("//form/div[2]/input")).sendKeys("harpreetsindhia999@gmail.com");
		driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("harpreet");
		driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();
		Select dropDown = new Select(driver.findElement(By.cssSelector("#exampleFormControlSelect1")));
		dropDown.selectByVisibleText("Female");
		String optionSelect = dropDown.getFirstSelectedOption().getText();
		System.out.println(optionSelect);
		driver.findElement(By.cssSelector("#inlineRadio2")).click();
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("8-8-2024");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		
		
		
		
		
		
		
	}
}
