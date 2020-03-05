package predavanja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/osx/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		
		driver.get("http://google.com");
		
		driver.navigate().to("https://www.youtube.com/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.findElement(By.id("search")).sendKeys("Stoja");
		//driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("search-icon-legacy")).click();
		
	}
	}
