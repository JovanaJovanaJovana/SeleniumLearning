package predavanja;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Intro2 {

	WebDriver driver;
	String title;

	@BeforeClass
	public void openBrowser() {

		System.setProperty("webdriver.chrome.driver", "/Users/osx/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void testGoogle() {

		driver.get("http://google.com");

		title = driver.getTitle();

		System.out.println("Naslov je " + title);

		Assert.assertEquals(title, "Google");
	}

	@Test
	public void testYouTube() {

		driver.navigate().to("https://www.youtube.com/");

		title = driver.getTitle();

		System.out.println("Naslov je " + title);

		Assert.assertEquals(title, "YouTube");
	}

	@AfterClass
	public void closeBrowser() {

		driver.close();
	}
}
