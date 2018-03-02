package Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Pages.signUpPage;

class E2ESignUp {

	@Test
	void test() throws InterruptedException 
	{
		signUpPage test1= new signUpPage();
		test1.E2ESignUp("IE");
		
	}

}
