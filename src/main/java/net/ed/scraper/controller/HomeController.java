package net.ed.scraper.controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("7. this is main()");

		final String HOME_URL = "http://localhost:8080/";
		
		// add support for chrome driver
		String keyx = "webdriver.chrome.driver";
		String valuex = "/Users/melocal/Applications/lib/chromedriver";
		System.setProperty(keyx, valuex);
		
		WebDriver driver;
		driver = new ChromeDriver();
			
		driver.get(HOME_URL);
		System.out.println("25. " + driver.getTitle());
		driver.close();

	}

}
