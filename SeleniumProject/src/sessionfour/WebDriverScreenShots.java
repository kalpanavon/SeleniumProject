package sessionfour;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverScreenShots {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://bbc.co.uk");
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir")+"\\src\\screenshots\\first.png"));
		System.out.println("Screens captured");
		driver.close();
	}

}
