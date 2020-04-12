package lokatori;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LokatoriIntro {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/osx/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://shop.demoqa.com/my-account/");

		WebElement username = driver.findElement(By.id("username"));

		driver.findElement(By.cssSelector("input#password")).sendKeys("mojasifra");
		driver.findElement(By.name("login")).click();
		driver.navigate().to("http://shop.demoqa.com/");
		driver.findElement(By.linkText("Search")).click();
		driver.findElement(By.className("form-control")).sendKeys("dress");
		driver.findElement(By.className("form-control")).sendKeys(Keys.ENTER);
		driver.navigate().to("http://shop.demoqa.com/product/black-cross-back-maxi-dress/");

		List<WebElement> fotografije = driver.findElements(By.className("noo-woo-thumbnails__image"));

		for (int i = 0; i < fotografije.size(); i++) {
			fotografije.get(i).click();
			sacekaj();
		}

		driver.findElement(By.xpath("//img[@title='black-cross-back-maxi-dress']"));

	}

	public static void sacekaj() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

}
