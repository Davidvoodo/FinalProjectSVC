package Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Pages.loginPage;

class E2ElLogin {

	@Test
	void test() throws InterruptedException 
	{
		loginPage test1 = new loginPage();
	    test1.E2ELogin("Chrome");
	}

}
