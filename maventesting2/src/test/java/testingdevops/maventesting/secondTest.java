package testingdevops.maventesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class secondTest {
	
	@Test
	public void sampletest() throws InterruptedException
	{
		System.out.println("am second working");
		/*String chrome_driver_path= "/maventesting2/driver/chromedriver.exe";*/		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\driver\\chromedriver.exe" );
		String chrome_path =  System.getProperty("user.dir") + ("\\driver\\chromedriver.exe");
		System.out.println(chrome_path);
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\CP002\\git\\newselenium\\maventesting2\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
		
	}


}
