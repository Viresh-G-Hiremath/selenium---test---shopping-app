package com.automationpractice.Shopping;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass extends BrowserSetUp {
	
	String url ="http://www.automationpractice.com/index.php";
	String firstName ="viresh";
	String lastName ="hiremath";
	String phone="1234567890";
	String email="acykjgjhvkhgkjgfl@gmail.com";
	String address="namo nagar";
	String city="belagavi";
	String state="40";
	String postcode="59112";
	String username="hgviresh";
	String password ="1234viresh";
	String dopDay ="31";
	String dopMonth ="7";
	String dopYear ="1998";
	String search ="Faded Short Sleeve T-shirts ";
	
	//Website launching
	
	@BeforeMethod
	public void goingToWeb()
	{
		browserLaunch(url);
	}
	
	//closing
	
	@AfterMethod
	public void closingBrowse()
	{
		BrowserClose();
	}
	
	@Test
	public void shopping_test() throws InterruptedException, IOException
	{
		BaseClass b = new BaseClass(driver);
		
		//sign up
		
		b.signup_ele();
		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,400)");
		
		b.email_create_ele(email);
		Thread.sleep(1000);
		b.register_ele();
		
		System.out.println("Successfully clicked on signup");
		
		//register
		
		b.title_ele();
		b.custFirstName_ele(firstName);
		b.custLastName_ele(lastName);
		b.email_ele();
		b.password_create_ele(password);
		
		j.executeScript("window.scrollBy(0,400)");
		
		b.dop_days_ele(dopDay);
		b.dop_months_ele(dopMonth);
		b.dop_years_ele(dopYear);
		b.firstName_ele(firstName);
		b.lastName_ele(lastName);
		b.address_ele(address);
		b.city_ele(city);
		b.state_ele(state);
		
		j.executeScript("window.scrollBy(0,400)");
		
		b.postcode_ele(postcode);
		b.phone_ele(phone);
		b.alias_ele(address);
		b.register_button_ele();
		
		System.out.println("Successfully registered as user");
		
		//search
		
		b.search_ele(search);
		b.search_icon_ele();
		
		System.out.println("Successfully searched for item");
		
		//in search results
		
		j.executeScript("window.scrollBy(0,400)");
		
		b.product_ele();
		b.product_more_ele();
		
		//add to cart
		
		j.executeScript("window.scrollBy(0,400)");
		
		b.addToCart_ele();
		
		System.out.println("Successfully Product added to cart");
		
		b.proccedToCheckout_1_ele();
		
		//In cart
		
		j.executeScript("window.scrollBy(0,400)");
		
		b.plus_icon_ele();
		b.proccedToCheckout_2_ele();
		
		j.executeScript("window.scrollBy(0,400)");
		
		b.proccedToCheckout_3_ele();
		
		j.executeScript("window.scrollBy(0,400)");
		
		b.terms_check_ele();
		b.proccedToCheckout_4_ele();
		
		System.out.println("Successfully proceed to checkout");
		
		j.executeScript("window.scrollBy(0,400)");
		
		b.payByBank_ele();
		
		j.executeScript("window.scrollBy(0,400)");
		
		b.confirmOrder_ele();
		
		System.out.println("Payment successfully done");
		
		j.executeScript("window.scrollBy(0,400)");
		
		//taking screenshot
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		File ss = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("./screenshots/confirmationss.jpeg");
		FileUtils.copyFile(ss,dst);
		
		System.out.println("Screenshot taken for confirmation");
		
	}
}