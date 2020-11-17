package testingdevops.maventesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class secondTest {
	
	@Test
	public void sampletest() throws InterruptedException
	{
		System.out.println("am second working");
		Thread.sleep(5000);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CP002\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
		
	}


}
