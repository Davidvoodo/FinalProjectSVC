package Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Pages.loginPage;


class CheckEmail {
	
	@Test
	void testEmailLoginPostavie() 
	{
		loginPage test= new loginPage();
	    assertEquals(true, test.CheckEmailIsValid("da@gmail.com"), "Email is valid");
	}
	
	@Test
	void testEmailLoginNagtive() 
	{
		loginPage test= new loginPage();
	    assertEquals(false, test.CheckEmailIsValid("dagmail.com"), "Email is not valid");
	}
	
	
	
	@Test
	void testEmailSignUpPostavie() 
	{
		loginPage test= new loginPage();
	    assertEquals(true, test.CheckEmailIsValid("Hila.hen@walla.co.il"), "Email is valid");
	}
	
	
	@Test
	void testEmailSignUpNagtive() 
	{
		loginPage test= new loginPage();
	    assertEquals(false,test.CheckEmailIsValid("Hila.henwalla.co.il"), "Email is not valid");
	}


	
	
}
