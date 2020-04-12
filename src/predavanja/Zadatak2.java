package domaci;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Pomocu jave i seleniuma otvoriti pretrazivac i otici na Youtube. Pet puta
		 * kliknuti na dugme refresh, i tek onda zatvoriti pretrazivac.
		 */
		
		System.setProperty("webdriver.chrome.driver", "/Users/osx/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://youtube.com/");
		
		driver.navigate().refresh();
		
		driver.navigate().refresh();
		
		driver.navigate().refresh();
		
		driver.navigate().refresh();
		
		driver.navigate().refresh();
		
		driver.close();
		
	}

}
