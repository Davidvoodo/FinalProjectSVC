package Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Pages.loginPage;
import Pages.signUpPage;

class UIText {

	@Test
	void LoginUI() 
	{
		//UI -Login Page . 
		loginPage loginUi = new loginPage("Chrome","LOGIN");
		//Verify if the page Contains - Welcome Back!
		loginUi.ifContainsText("Welcome Back!");
	}
	
	@Test
	void SignUpUI() 
	{
		///UI -Sign Up Page . 
		signUpPage signUpUi = new signUpPage("Chrome","SIGN UP");
		signUpUi.ifContainsText("Sign Up for Free");
	}

}
