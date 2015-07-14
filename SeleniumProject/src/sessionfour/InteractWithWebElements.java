package sessionfour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class InteractWithWebElements {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://docs.google.com/forms/d/187BwTa7DPgAs8ekW3R6blYDPNtqgIUG7AaKb-7VwFZQ/viewform");
		driver.manage().window().maximize();
		driver.findElement(By.id("entry_679637797")).sendKeys("Mrs");
		driver.findElement(By.name("entry.259408567")).sendKeys("Kalpana");
		driver.findElement(By.xpath("//*[@id='entry_1754607540']")).sendKeys("kalpana.vonteri@gmail.com");
		driver.findElement(By.xpath("//*[@id='entry_1011799188']")).sendKeys("746574567465");
		driver.findElement(By.xpath("//*[@id='entry_1145809750']")).sendKeys("GGK");
		driver.findElement(By.xpath("//*[@id='entry_515436121']")).sendKeys("Sou");
		
		driver.findElement(By.xpath("//*[@id='entry_858757481']")).sendKeys("6");
		driver.findElement(By.xpath("//*[@id='entry_435322519']")).sendKeys("http://www.tutorialspoint.com/");
		driver.findElement(By.xpath("//*[@id='entry_361641679']")).sendKeys("Sample Page");
		
		driver.findElement(By.xpath("//*[@id='ss-form']/ol/div[13]/div/div/ul/li[1]/label/span[1]")).click();
		driver.findElement(By.xpath("//*[@id='group_1099298672_1']")).click();
		driver.findElement(By.xpath("//*[@id='ss-submit']")).click();
		driver.quit();
		
		System.out.println("finished");

	}

}
