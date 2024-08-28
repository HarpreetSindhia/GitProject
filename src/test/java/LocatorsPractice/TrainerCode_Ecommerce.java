package LocatorsPractice;


	
	import java.time.Duration;

	import java.util.List;

	import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.WebElement;

	import org.openqa.selenium.chrome.ChromeDriver;

	import org.testng.Assert;



	public class TrainerCode_Ecommerce {



	    public static void main(String[] args) {



	        WebDriver driver = new ChromeDriver();

	        driver.manage().window().maximize();

	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        driver.get("https://rahulshettyacademy.com/seleniumPractise/");

	       

	        // Get the list of all vegetables

	        List<WebElement> vegetables = driver.findElements(By.cssSelector(".products .product"));



	        // Find the Cauliflower element

	        WebElement cauliflower = vegetables.stream()

	            .filter(v -> v.findElement(By.cssSelector("h4.product-name")).getText().contains("Cauliflower"))

	            .findFirst()

	            .orElse(null);



	        // Check if Cauliflower element is found and click the Add to Cart button

	        if (cauliflower != null) {

	            cauliflower.findElement(By.cssSelector(".product-action button")).click();

	        } else {

	            System.out.println("Cauliflower not found");

	        }



	        // Close the driver

	        driver.quit();

	    }

	}


