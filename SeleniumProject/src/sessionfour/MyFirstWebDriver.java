package sessionfour;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstWebDriver {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://selenium.googlecode.com/svn/trunk/docs/api/java/index.html");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
		System.out.println("page source******************");
		System.out.println(driver.getPageSource());
	}

}
