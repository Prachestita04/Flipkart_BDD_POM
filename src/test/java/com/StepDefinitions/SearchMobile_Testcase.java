package com.StepDefinitions;

import com.BaseClass.Library;
import com.Pages.SearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class SearchMobile_Testcase extends Library {
    public static SearchPage sp;

    @Given("Launch the Flipkart Application")
    public void launch_the_flipkart_application() throws IOException {
        launchapplication();
    }

    @When("Close the popup")
    public void close_the_popup() {
        sp = new SearchPage(driver);
        sp.handlePopup();
        System.out.println(driver.getTitle());
    }

    @Then("It should navigate to the Home Page")
    public void it_should_navigate_to_the_home_page() {

        sp.homeScreen();
    }

    @Given("User enters the Text in the Search field")
    public void user_enters_the_text_in_the_search_field() {
        sp.search("Mobile");
    }

    @When("Click the Search button")
    public void click_the_search_button() {
        sp.clickSearch();
    }

    @Then("It should navigate to the search result page and display the relevant details")
    public void it_should_navigate_to_the_search_result_page_and_display_the_relevant_details() {
        sp.result();
    }
}
