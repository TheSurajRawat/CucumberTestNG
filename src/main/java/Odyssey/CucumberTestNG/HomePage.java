package Odyssey.CucumberTestNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage  {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		//super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//input[@class='search-bar__input']")
	WebElement searchBar;
	
	@FindBy(xpath="//p[@class='search-bar__item-title']/strong")
	WebElement book;
	
	@FindBy(xpath="//div[@class='product-form__info-item']/div/div/span[@class='price price--highlight']")
	WebElement price;
	
	
	@FindBy(xpath="//button[@data-action='add-to-cart']")
	WebElement addCart;
	
	@FindBy(xpath="//span[@class='header__cart-count']")
	WebElement cartCount;
	
	@FindBy(xpath="//a[text()='My account ']")
	WebElement myAccount;
	
	@FindBy(xpath="//button[text()='Create your account']")
	WebElement createAccount;
	

	@FindBy(xpath="//input[@id='register-customer[first_name]']")
	WebElement firstName;
	

	@FindBy(xpath="//input[@id='register-customer[last_name]']")
	WebElement lastName;
	

	@FindBy(xpath="//input[@id='register-customer[email]']")
	WebElement email;
	
	
	@FindBy(xpath="//input[@id='register-customer[password]']")
	WebElement password;
	
	@FindBy(xpath="//button[text()='Create my account']")
	WebElement createMyAccount;
	
	@FindBy(xpath="//li[@class='alert__error-item']")
	WebElement accountVerification;
	
	@FindBy(xpath="//a[text()='Our Store Locations']")
	WebElement storeLocation;
	

	@FindBy(xpath="//strong[text()='ODYSSEY Bookstore is located in Chennai.']")
	WebElement storeLocLabel;
	

	@FindBy(xpath="//a[text()='Contact us']")
	WebElement contactUs;
	

	@FindBy(xpath="//main[@id='main']//p[1]")
	WebElement timing;
	
	@FindBy(xpath="//a[text()='Returns & Refund Policy']")
	WebElement returnrefund;
	

	@FindBy(xpath="//strong[normalize-space()='7 days']")
	WebElement returnpolicy;
	

	@FindBy(xpath="//a[text()='Terms of Service']")
	WebElement termofService;
	

	@FindBy(xpath="//span[@class='header__desktop-nav-text' and text()='Menu']")
	WebElement menu;
	

	@FindBy(xpath="//a[normalize-space()='Refund policy']")
	WebElement refundpolicy;
	

	@FindBy(xpath="//main[@id='main']//p[4]")
	WebElement nonreturnableitem;
	
	public String SearchBook(String tittle) {
		
		searchBar.sendKeys(tittle);
		book.click();
		String str=price.getText();
		return str;
		 
		       
		
	}
	
public String AddCart(String tittle) throws InterruptedException {
		
		searchBar.sendKeys(tittle);
		book.click();
		addCart.click();
		Thread.sleep(3000);
		String str=cartCount.getText();
		return str;
		 
		       
		
	}	
	public String CreateAccount(String fName, String lName,String Email, String pwd) throws InterruptedException {
		
		myAccount.click();
		createAccount.click();
		Thread.sleep(3000);
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
	    email.sendKeys(Email);
	    password.sendKeys(pwd);
	    createMyAccount.click();
	    String str=accountVerification.getText();
		return str;
		
			
	}
	
	public String StoreLocation() {
		
		storeLocation.click();
		String str=storeLocLabel.getText();
		return str;
	}
	
	public String ContactUs() {
		
		contactUs.click();
		String str= timing.getText();
		return str;
		
	}
	
	public String ReturnAndRefund() {
		
		returnrefund.click();
		String str= returnpolicy.getText();
		return str;
	}
	
	public String TermOfService() {
		
		termofService.click();
		String str= driver.getTitle();
		return str;		
	}
	
public String NonReturnableItem() {
		
	    refundpolicy.click();
		String str= nonreturnableitem.getText();
		return str;		
	}

public void goTo() {
	// TODO Auto-generated method stub
	driver.get("https://odyssey.in/");
	
}
}
