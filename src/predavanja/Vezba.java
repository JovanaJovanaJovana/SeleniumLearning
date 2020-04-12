package predavanja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vezba {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/osx/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

		driver.manage().window().maximize();

		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.click();
		firstname.sendKeys("Jovana");

		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.click();
		lastname.sendKeys("Petrovic");

		WebElement gender = driver.findElement(By.id("sex-1"));
		gender.click();

		WebElement yearsOfExp = driver.findElement(By.id("exp-0"));
		yearsOfExp.click();

		WebElement date = driver.findElement(By.id("datepicker"));
		date.sendKeys("2020/03/06");

		WebElement profession = driver.findElement(By.id("profession-0"));
		profession.click();

		WebElement continents = driver.findElement(By.id("continents"));
		continents.click();
		continents.sendKeys("Europe");

		WebElement button = driver.findElement(By.id("submit"));
		button.click();

		WebElement link = driver.findElement(By.linkText("Selenium Webdriver Tutorials Series"));
		link.click();

	}

}
