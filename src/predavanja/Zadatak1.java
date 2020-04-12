package domaci;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/osx/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://itbootcamp.rs/");

		driver.navigate().refresh();

		driver.navigate().to("https://itbootcamp.rs/course/testiranje-softvera/");

		driver.navigate().back();

		driver.navigate().forward();

		Dimension n = new Dimension(1200, 680);
		driver.manage().window().setSize(n);

		String url = driver.getCurrentUrl();

		System.out.println(url);

		String naslov = driver.getTitle();
		
		int duzinanaslova = naslov.length();

		System.out.println("Naslov Vase stranice je: " + naslov + ", a njegova duzina je: " + duzinanaslova);

	}

}
