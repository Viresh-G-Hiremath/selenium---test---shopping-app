package com.automationpractice.Shopping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	WebDriver driver;
	
	//Declaration of elements
	
	//sign up elements
	@FindBy(xpath="//a[@class='login']")
	private WebElement signup_ele;
	
	@FindBy(xpath="//input[@id='email_create']")
	private WebElement email_create_ele;
	
	@FindBy(xpath="//button[@id='SubmitCreate']")
	private WebElement register_ele;
	
	//register page elements
	
	@FindBy(xpath="//label[@for='id_gender1']")
	private WebElement title_ele;
	
	@FindBy(xpath="//input[@id='customer_firstname']")
	private WebElement cust_firstName_ele;
	
	@FindBy(xpath="//input[@id='customer_lastname']")
	private WebElement cust_lastName_ele;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement email_ele;
	
	@FindBy(xpath="//input[@id='passwd']")
	private WebElement password_create_ele;
	
	@FindBy(xpath="//select[@id='days']")
	private WebElement dop_days_ele;
	
	@FindBy(xpath="//select[@id='months']")
	private WebElement dop_months_ele;
	
	@FindBy(xpath="//select[@id='years']")
	private WebElement dop_years_ele;
	
	@FindBy(xpath="//input[@id='firstname']")
	private WebElement firstName_ele;
	
	@FindBy(xpath="//input[@id='lastname']")
	private WebElement lastName_ele;
	
	@FindBy(xpath="//input[@id='address1']")
	private WebElement address_ele;
	
	@FindBy(xpath="//input[@id='city']")
	private WebElement city_ele;
	
	@FindBy(xpath="//select[@id='id_state']")
	private WebElement state_ele;
	
	@FindBy(xpath="//input[@id='postcode']")
	private WebElement postcode_ele;
	
	@FindBy(xpath="//input[@id='phone_mobile']")
	private WebElement phone_ele;
	
	@FindBy(xpath="//input[@id='alias']")
	private WebElement alias_ele;
	
	@FindBy(xpath="//button[@id='submitAccount']")
	private WebElement register_button_ele;
	
	//search
	
	@FindBy(xpath="//input[@id='search_query_top']")
	private WebElement search_ele;
	
	@FindBy(xpath="//button[@class='btn btn-default button-search']")
	private WebElement search_icon_ele;
	
	//in search results
	
	@FindBy(xpath="//img[@title='Faded Short Sleeve T-shirts']")
	private WebElement product_ele;
	
	@FindBy(xpath="//span[.='More']")
	private WebElement product_more_ele;
	
	//add to cart
	
	@FindBy(xpath="//span[.='Add to cart']")
	private WebElement addToCart_ele;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement proccedToCheckout_1_ele;
	
	//In cart
	
	@FindBy(xpath="//i [@class='icon-plus']")
	private WebElement plus_icon_ele;
	
	@FindBy(xpath="//span[.='Proceed to checkout']")
	private WebElement proccedToCheckout_2_ele;
	
	@FindBy(xpath="//span[.='Proceed to checkout']")
	private WebElement proccedToCheckout_3_ele;
	
	@FindBy(xpath="//input[@id='cgv']")
	private WebElement terms_check_ele;
	
	@FindBy(xpath="//button[@name='processCarrier']")
	private WebElement proccedToCheckout_4_ele;
	
	@FindBy(xpath="//a[@class='bankwire']")
	private WebElement payByBank_ele;
	
	@FindBy(xpath="//span[.='I confirm my order']")
	private WebElement confirmOrder_ele;
	
	
	
	//Initialization of elements
	
	public BaseClass (WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Utilization of elements
	
	//sign up elements
	
	public void signup_ele(){
		signup_ele.click();
	}
	
	public void email_create_ele(String email){
		email_create_ele.sendKeys(email);
	}
	
	public void register_ele(){
		register_ele.click();
	}
	
	//register page elements
	
	
	public void title_ele(){
		title_ele.click();
	}
	
	public void custFirstName_ele(String firstName){
		cust_firstName_ele.sendKeys(firstName);
	}
	
	public void custLastName_ele(String lastName){
		cust_lastName_ele.sendKeys(lastName);
	}
	
	public void email_ele(){
		email_ele.click();
	}
	
	public void password_create_ele(String password){
		password_create_ele.sendKeys(password);
	}
	
	public void dop_days_ele(String dopDay){
		Select s = new Select(dop_days_ele);
		s.selectByValue(dopDay);
	}
	
	public void dop_months_ele(String dopMonth){
		Select s = new Select(dop_months_ele);
		s.selectByValue(dopMonth);
	}
	
	public void dop_years_ele(String dopYear){
		Select s = new Select(dop_years_ele);
		s.selectByValue(dopYear);
	}
	
	public void firstName_ele(String firstName){
		firstName_ele.sendKeys(firstName);
	}
	
	public void lastName_ele(String lastName){
		lastName_ele.sendKeys(lastName);
	}
	
	public void address_ele(String address){
		address_ele.sendKeys(address);
	}
	
	public void city_ele(String city){
		city_ele.sendKeys(city);
	}
	
	public void state_ele(String state){
		Select s = new Select(state_ele);
		s.selectByValue(state);
	}
	
	public void postcode_ele(String postcode){
		postcode_ele.sendKeys(postcode);
	}
	
	public void phone_ele(String phone){
		phone_ele.sendKeys(phone);
	}
	
	public void alias_ele(String address){
		alias_ele.clear();
		alias_ele.sendKeys(address);
	}
	
	public void register_button_ele(){
		register_button_ele.click();
	}
	
	//search
	
	public void search_ele(String search){
		search_ele.sendKeys(search);
	}
	
	public void search_icon_ele(){
		search_icon_ele.click();
	}
	
	//in search results
	
	public void product_ele(){
		Actions act=new Actions(driver);
		act.moveToElement(product_ele).perform();
	}
	
	public void product_more_ele(){
		product_more_ele.click();
	}
	
	//add to cart
	
	public void addToCart_ele(){
		addToCart_ele.click();
	}
	
	public void proccedToCheckout_1_ele(){
		proccedToCheckout_1_ele.click();
	}
	
	//In cart
	
	public void plus_icon_ele(){
		plus_icon_ele.click();
	}
	
	public void proccedToCheckout_2_ele(){
		proccedToCheckout_2_ele.click();
	}
	
	public void proccedToCheckout_3_ele(){
		proccedToCheckout_3_ele.click();
	}
	
	public void terms_check_ele(){
		terms_check_ele.click();
	}
	
	public void proccedToCheckout_4_ele(){
		proccedToCheckout_4_ele.click();
	}
	
	public void payByBank_ele(){
		payByBank_ele.click();
	}
	
	public void confirmOrder_ele(){
		confirmOrder_ele.click();
	}
	
}