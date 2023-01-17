package Odyssey.CucumberTestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestComponents {
	public WebDriver driver;
	
	public WebDriver intializeDriver() throws IOException {
		
		Properties prop= new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\syed.yesrib\\eclipse-workspace\\CucumberTestNG\\src\\main\\java\\Odyssey\\CucumberTestNG\\GlobalData.properties");
		prop.load(fis);
		String browserName= prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\syed.yesrib\\eclipse-workspace\\CucumberTestNG\\lib\\chromedriver.exe");
			driver= new ChromeDriver();
	
		}
		else {
			System.out.println("Browser driver not available");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	
	}
	
	public HomePage launchApplication() throws IOException {
		
		driver= intializeDriver();
		HomePage lg= new HomePage(driver);
		lg.goTo();
		return lg;
		
	}
	
	public void scrollBrowser() {
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	

}
