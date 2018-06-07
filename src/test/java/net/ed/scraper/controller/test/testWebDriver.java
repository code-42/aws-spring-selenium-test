package net.ed.scraper.controller.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class testWebDriver {

	@Test
	public void testWebDriver() {
		  
			// add support for chrome driver
			String keyx = "webdriver.chrome.driver";
			String valuex = "/Users/melocal/Applications/lib/chromedriver";
			System.setProperty(keyx, valuex);
			
			WebDriver driver = new ChromeDriver();
			driver.get("http://login.yahoo.com");
			
			String expected = "Yahoo - login";
			String actual = driver.getTitle();
			assertEquals(expected, actual);
			driver.close();
	}
  
}
