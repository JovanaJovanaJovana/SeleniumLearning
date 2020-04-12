package predavanja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intro {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/osx/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		driver.getTitle();
		String title = driver.getTitle();

		System.out.println("Naslov je " + title);

		driver.navigate().to("https://www.youtube.com/");
		title = driver.getTitle();
		System.out.println("Naslov je " + title);

		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

		WebElement search = driver.findElement(By.id("search"));
		search.sendKeys("magic mountain");
		driver.findElement(By.id("search-icon-legacy")).click();
		driver.findElement(By.id("search-icon-legacy")).click();
		WebElement lupica = driver.findElement(By.id("search-icon-legacy"));
		lupica.click();

		driver.close();

	}

}
