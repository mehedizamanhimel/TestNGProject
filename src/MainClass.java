import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utils.testData_properties;

public class MainClass {

	static testData_properties testData;
	
   
	public RandomGenerator random = new RandomGenerator();
	
	@BeforeTest
	public void beforeTest() throws IOException {
		testData = new testData_properties();
		
	}
	
	
	//@Test(priority=2)
	public void openingBaseUrl() throws InterruptedException {
		/*WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(5000);
		driver.close();	*/
		System.out.println("This is test one");
		System.out.println();
	}
	
	//@Test(priority=0)
	@Test
	public void testTwo() {
		System.out.println("This is test two");
		String baseUrl = "http://demo.guru99.com/test/upload/";
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));       
        uploadElement.sendKeys("C:\\Users\\User\\Desktop\\WP_000310.jpg");
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.name("send")).click();
        
        
        }
	
	
	@Test
	public void testThree() {
		
		System.out.println("This is test three to test" );
		System.out.println(" the result of test properties is: "+testData.property.getProperty("ami"));
		System.out.println("The random generated mobile number is: "+ random.randomNumberGenerator());
		System.err.println("The random string value is: "+ random.randomStringGenerator());
	
	}
	

}
