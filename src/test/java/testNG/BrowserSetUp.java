package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BrowserSetUp {

	String url = "http://www.automationpractice.com/index.php";
	WebDriver driver;
	
	//Browser Launching
	@BeforeMethod
	public void browserLaunch(){
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
	}
	
	//Browser Closing
	@AfterMethod
	public void BrowserClose(){
		driver.close();
	}
}
