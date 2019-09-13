package com.teammartial.stepdefinitions;

import org.springframework.beans.factory.annotation.Autowired;

import com.teammartial.pages.EditProfilePage;
import com.teammartial.pages.HomePage;
import com.teammartial.pages.LoginPage;
import com.teammartial.pages.ProfilePage;
import com.teammartial.utils.TestData;

import io.github.cdimascio.dotenv.Dotenv;

public class BaseSteps {

	protected Dotenv dotenv;

	public BaseSteps() {
		dotenv = Dotenv.load();

	}

	@Autowired
	protected LoginPage loginPage;

	@Autowired
	protected ProfilePage profilePage;

	@Autowired
	protected HomePage homePage;
	
	@Autowired
	EditProfilePage editProfilePage;
	
	@Autowired
	TestData testdata;

}
