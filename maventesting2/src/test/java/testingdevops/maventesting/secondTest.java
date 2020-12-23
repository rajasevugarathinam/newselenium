package testingdevops.maventesting;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
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
		
		driver.get("https://convergepoint-b45c1a964d84c4.sharepoint.com/sites/Policy-Test/PolicyPortal/Pages/Default.aspx");
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//input[@id='i0116']"));
		username.sendKeys("raja.sevugarathinam@convergepoint.com");
		WebElement nextclick1 = driver.findElement(By.xpath("//input[@id='idSIButton9']"));
		nextclick1.click();
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("//input[@id='i0118']"));
		password.sendKeys("Brilliant@123");
		WebElement signin = driver.findElement(By.xpath("//input[@id='idSIButton9']"));
		signin.click();
		Thread.sleep(5000);
		WebElement Btnno = driver.findElement(By.xpath("//input[@id='idBtn_Back']"));
		Btnno.click();
		
		Actions menu = new Actions(driver);
		WebElement menumouseover = driver.findElement(By.xpath("//*[@id=\'style-1\']/ul/li[1]"));
		menu.moveToElement(menumouseover).perform();
		WebElement Admin = driver.findElement(By.xpath("//span[contains(.,'Administration')]"));
		Admin.click();
		Thread.sleep(1000);
		WebElement policynew = driver.findElement(By.xpath("(//button[@type='button'])[6]"));
		policynew.click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		//driver.switchTo().frame("DlgFrame57d6c444-c3a6-4ada-9011-0736196722f7");
		 driver.switchTo().frame(driver.findElement(By.xpath("//*[contains(@id,'DlgFrame')]")));
		System.out.println(driver.getTitle());
		WebElement policytype = driver.findElement(By.xpath("//input[contains(@id,'TextField')]"));		
		policytype.sendKeys("December Friday Demo");
		WebElement PolicyCreator = driver.findElement(By.xpath("//input[@id='PolicyCreator_5be90856-cc8e-48bf-9bf0-0718b96e54dc_"
				+ "$ClientPeoplePicker_EditorInput']")); 
		PolicyCreator.sendKeys("Raja Sevugarathinam");
		PolicyCreator.sendKeys(Keys.TAB);
		Thread.sleep(5000);
		WebElement SkipDrafting = driver.findElement(By.xpath("//select[contains(@id,'$DropDownChoice')][@title='Skip Drafting']"));
		SkipDrafting.sendKeys("Yes");
		Thread.sleep(5000);
		WebElement Skipreview = driver.findElement(By.xpath("//*[@id='SkipReviewing_"
				+ "6e022853-600c-46ed-aba1-cb38661198c6_$DropDownChoice']"));
		Skipreview.sendKeys("Yes");
		Thread.sleep(5000);
		WebElement RequiredReviewer = driver.findElement(By.xpath("//select[@id='RequiredReviewer_"
				+ "9889644a-e50c-46ee-a35a-b72bac94e9f5_$DropDownChoice']"));
		RequiredReviewer.sendKeys("No");
		RequiredReviewer.sendKeys(Keys.TAB);
		Thread.sleep(5000);
		
		
		WebElement Approvers = driver.findElement(By.xpath("//*[@id='Approvers_16b7d5be-b8be"
				+ "-4320-8ef3-ed00b03058d2_"
				+ "$ClientPeoplePicker']"));
		Actions Approvers1 = new Actions(driver);
		Approvers1.click(Approvers).sendKeys("Raja Sevugarathinam").build().perform();
		Approvers1.sendKeys(Keys.TAB).build().perform();
		
		Thread.sleep(5000);
		WebElement Notification = driver.findElement(By.xpath("//*[@id='NotificationTo_98929906-a8d5"
				+ "-4999-8bed-b02a9da0a1b2_$ClientPeoplePicker_InitialHelpText']"));
		Approvers1.sendKeys("Raja Sevugarathinam").build().perform();
		Thread.sleep(5000);
		Approvers1.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(5000);
		
		
		WebElement Duration  = driver.findElement(By.xpath("//*[contains(@id,'NumberField')]"));
		Duration.sendKeys("1");
		Duration.sendKeys(Keys.TAB);
		Thread.sleep(5000);
		
		WebElement Expiration  = driver.findElement(By.xpath("//div[@title='Expiration Notice']"));
		Actions Expiration1 = new Actions(driver);
		Approvers1.sendKeys(Expiration,"Raja Sevugarathinam").build().perform();
		Thread.sleep(5000);
		Approvers1.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(5000);
		WebElement save  = driver.findElement(By.xpath("//input[@id='ctl00_ctl40_g_954baaa6_dd6f_4abc_8979_80171ce33259_ctl00_toolBarTbl_RightRptControls_ctl00_ctl00_diidIOSaveItem']"));
		save.click();
		
	}


}
