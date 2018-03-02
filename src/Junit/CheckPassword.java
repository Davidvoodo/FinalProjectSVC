package Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Pages.loginPage;
import Pages.signUpPage;

class CheckPassword {

	@Test
	void PostivePassword()
	{
		loginPage test1= new loginPage();
		assertEquals(true, test1.CheckPasswordIsValid("123456"), "Not Null");
		
	}
	
	@Test
	void NagativePassword()
	{
		loginPage test1= new loginPage();
		assertEquals(false, test1.CheckPasswordIsValid(""), "Null");
		
	}

}
