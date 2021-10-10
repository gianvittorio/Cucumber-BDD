package hellocucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayAdvancedSearch_Steps {

    @Given("I am on Ebay Advanced Search Page")
    public void i_am_on_ebay_advanced_search_page() {
        System.out.printf("I am on Ebay Advanced Search Page");;
    }
    @When("I click on Ebay Logo")
    public void i_click_on_ebay_logo() {
        System.out.printf("I click on Ebay Logo");
    }
    @Then("I am navigated to Ebay Home Page")
    public void i_am_navigated_to_ebay_home_page() {
        System.out.printf("I am navigated to Ebay Home Page");
    }
}
