package domaci;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Zadatak3Test {
	
	@Test
	public void testNaslov() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/osx/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://covid19.rs/");
		
		driver.getTitle();
		
		String title = "COVID-19";
		
		Assert.assertEquals(driver.getTitle(), title);
		
	}
	

}
