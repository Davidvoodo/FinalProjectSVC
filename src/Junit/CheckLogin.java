package Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Pages.loginPage;
import Pages.signUpPage;

class CheckLogin {

	@Test
	void loginPostive()
	{
		loginPage test1= new loginPage();
		assertEquals(true, test1.CanLogin("David@gmail.com","123456"), "Can Login");
	}
	
	@Test
	void loginNegative1()
	{
		loginPage test1= new loginPage();
		assertEquals(false, test1.CanLogin("Davigmail.com","123"), "Can't Login without @");
	}
	
	@Test
	void loginNegative2()
	{
		loginPage test1= new loginPage();
		assertEquals(false, test1.CanLogin("Davi@gmail.com",""), "Can't Login without Password");
	}

}
