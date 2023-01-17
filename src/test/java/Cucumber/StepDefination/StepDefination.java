package Cucumber.StepDefination;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Odyssey.CucumberTestNG.HomePage;
import Odyssey.CucumberTestNG.TestComponents;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefination extends TestComponents {
	
	public WebDriver driver;
	public HomePage lg;
	String str;

    @Given("^I launched Odyssey application$")
    public void i_launched_odyssey_application() throws IOException {
		lg= launchApplication();
	    	}
    

    @And("^scroll the browser down$")
    public void scroll_the_browser_down() {
		scrollBrowser();
    }
    
    @When("^Searched book with book Name (.+)$")
    public void searched_book_with_book_name(String bookname) {
		str= lg.SearchBook(bookname);
	}
    
    @When("^Add book to cart with book Name (.+)$")
    public void add_book_to_cart_with_book_name(String bookname) throws InterruptedException {
    	
    	str= lg.AddCart(bookname);
    	
    }

    @When("^Enter account details with FirstName (.+) LastName (.+) Email (.+) and Password (.+)$")
    public void enter_account_details_with_firstname_lastname_email_and_password(String firstname, String lastname, String email, String password) throws InterruptedException {
    	
    	str= lg.CreateAccount(firstname,lastname,email,password);
    }    

    @When("^Find store location$")
    public void find_store_location() {
    	str=lg.StoreLocation();
    }
    
    @When("^Find contact us details$")
    public void find_contact_us_details() {
    	str=lg.ContactUs();
    }
    


    @When("^Find return and refund details$")
    public void find_return_and_refund_details() {
    	str=lg.ReturnAndRefund();
    	
    }
    

    @When("^Find term of service details$")
    public void find_term_of_service_details() {
    	
    	str=lg.TermOfService();
    	
    }
    

    @When("^Find non returnable item details$")
    public void find_non_returnable_item_details() {
    	
    	str=lg.NonReturnableItem();
    	
    }
    
    
    @Then("^Cost (.+) of the book$")
    public void cost_of_the_book(String cost) {
    
		Assert.assertEquals(str.toString(),cost);
	}


   

    @Then("^\"([^\"]*)\" message is displayed on confirmation page$")
    public void something_message_is_displayed_on_confirmation_page(String strArg1) {
    	
    	Assert.assertTrue(str.contains(strArg1));	
    }

        

    @Then("^Cart count is (.+)$")
    public void cart_count_is(String count) {
    	
    	Assert.assertTrue(str.equalsIgnoreCase(count));
    	
    }
    

    @Then("^Location is (.+)$")
    public void location_is(String location) {
    	Assert.assertTrue(str.contains("Chennai"));
    }
    

    @Then("^It opens \"([^\"]*)\"$")
    public void it_opens_something(String strArg1) {
    	Assert.assertTrue(str.contains("Between 10am and 6.30pm on weekdays"));
    }
    

    @Then("^It opens for \"([^\"]*)\"$")
    public void it_opens_for_something(String strArg1) {
    	
    	Assert.assertTrue(str.contains("7 days"));
    	
    }
    

    @Then("^verify \"([^\"]*)\"$")
    public void verify_something(String strArg1) {
    	//System.out.println("Print: "+str);
    	Assert.assertTrue(str.contains("Terms of Service"));
    	
    }
    

    @Then("^verify the \"([^\"]*)\"$")
    public void verify_the_something(String strArg1) {
    	
    	Assert.assertTrue(str.contains("non-returnable items:"));
    	
    }
    

    @Then("verify is {string} returnable")
    public void verify_is_returnable(String string) {
    	
    	Assert.assertTrue(str.contains("Gift cards"));
    	
    }


}
