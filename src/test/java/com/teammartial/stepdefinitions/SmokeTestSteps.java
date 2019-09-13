package com.teammartial.stepdefinitions;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SmokeTestSteps extends BaseSteps {

	@Given("I have logged in to the teammartial portal")
	public void i_have_logged_in_to_the_teammartial_portal() {
		loginPage.goToPage(dotenv.get("TM_URL"));
		loginPage.loginToApplication(dotenv.get("TM_USERNAME"), dotenv.get("TM_PASSWORD"));
	}

	@Given("I am on the homepage")
	public void i_am_on_the_homepage() {
		System.out.println("Given 2");
	}

	@When("I edit my profile")
	public void i_edit_my_profile() {
		homePage.goToProfile();
		System.out.println("Page Heading:"+profilePage.getPageHeading());
		assertEquals(profilePage.getPageHeading(),"My Profile");
		editProfilePage.editPhoneNumber();
		editProfilePage.setAddress();

	}

	@Then("My details must get updated")
	public void my_details_must_get_updated() {

		System.out.println("Then 2");
	}

}
