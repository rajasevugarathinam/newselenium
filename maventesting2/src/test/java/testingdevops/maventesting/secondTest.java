package testingdevops.maventesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class secondTest {
	
	@Test
	public void sampletest()
	{
		System.out.println("am second working");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CP002\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
		
	}


}
