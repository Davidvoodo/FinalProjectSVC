package Pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import Selenium.Elements;


public class loginPage extends Elements {

	// Parameters .
	private WebElement loginBtnPage;
	private WebElement loginBtnPageText;
	private WebElement inputEmail;
	private WebElement inputPassword;
	private WebElement forgotPasswordLink;
	private WebElement goToSignUpBtn;
	private WebElement loginBtn;

	// Constructor .

	public loginPage(String browser, String pageName1) {
		super(browser, pageName1);

	}

	// Constructor 2 .
	public loginPage() {

	}

	// Method -Check @ in Email .
	public boolean CheckEmailIsValid(String email) {
		boolean correctEmail = false;
		try {
			if (email.contains("@") == true) {
				return correctEmail = true;
			} else {
				System.out.println("email must contains @");
				return correctEmail = false;
			}
		} catch (Exception e) {
			System.out.println("the massage is: " + e.getMessage());
		}

		return correctEmail = false;

	}

	// Check Password
	public boolean CheckPasswordIsValid(String password) {
		boolean correctPassword = false;
		try {
			if (password == null || password.isEmpty() == true) {
				System.out.println("Please Enter Password");
				return correctPassword = false;
			} else {
				return correctPassword = true;
			}
		} catch (Exception e) {
			System.out.println("the massage is: " + e.getMessage());
		}

		return correctPassword;

	}

	// Method-Can Login
	public boolean CanLogin(String email, String password) {
		if (CheckEmailIsValid(email) && this.CheckPasswordIsValid(password) == true) {
			return true;
		}

		else {
			System.out.println("Please Enter Password or email must contains @ ");
			return false;
		}
	}

	// Method-IF ContainsText
	public void ifContainsText(String text) {
		
		
		try {
			if (driver.getPageSource().contains(text) == true) {
				System.out.println("The Text Appear");
			}

			else {
				System.out.println("The Text Not Appear");

			}
		} catch (Exception e) {
			System.out.println("the massage is: " + e.getMessage());
		}

	}

	public void E2ELogin(String browser) throws InterruptedException {
		try {
			// Define Browser(Chrome\IE\FireFox)and Url
			loginPage login1 = new loginPage(browser, "LOGIN");

			// Click to Enter Login Page .
			login1.getLoginBtnPage().click();

			// Enter E-mail.
			login1.getInputEmail().sendKeys("David1@gmail.com");

			// Enter Password.
			login1.getInputPassword().sendKeys("123456");

			// Click Login Button .
			login1.loginBtn().click();

			// Wait
			Thread.sleep(3000);

			// Quiet
			login1.Quiet();
		} catch (Exception e) {
			System.out.println("the massage is: " + e.getMessage());

		}

	}
	
	
	

	// Getters and Setters .
	public WebElement getLoginBtnPage() {
		return driver.findElement(By.id("LoginB"));
	}

	public void setLoginBtnPage(String loginBtnPage) {
		this.loginBtnPage = driver.findElement(By.id(loginBtnPage));
	}

	public WebElement getLoginBtnPageText() {
		return driver.findElement(By.cssSelector("#login > h1"));
	}

	public void setLoginBtnPageText(String loginBtnPageText) {
		this.loginBtnPageText = driver.findElement(By.cssSelector(loginBtnPageText));
	}

	public WebElement getInputEmail() {
		return driver.findElement(By.id("ReEmailTB"));
	}

	public void setInputEmail(String inputEmail) {
		this.inputEmail = driver.findElement(By.id(inputEmail));
	}

	public WebElement getInputPassword() {
		return driver.findElement(By.id("RePassTB"));
	}

	public void setInputPassword(String inputPassword) {
		this.inputPassword = driver.findElement(By.id(inputPassword));
	}

	public WebElement getForgotPasswordLink() {
		return driver.findElement(By.cssSelector("#login > form > p > a"));
	}

	public void setForgotPasswordLink(String forgotPasswordLink) {
		this.forgotPasswordLink = driver.findElement(By.cssSelector(forgotPasswordLink));
	}

	public WebElement getGoToSignUpBtn() {
		return driver.findElement(By.id("Sign-UpB"));
	}

	public void setGoToSignUpBtn(String goToSignUpBtn) {
		this.goToSignUpBtn = driver.findElement(By.id(goToSignUpBtn));
	}

	public WebElement loginBtn() {
		return driver.findElement(By.id("ReBGetS"));
	}

	public void setLoginBtn(String loginBtn) {
		this.loginBtn = driver.findElement(By.id(loginBtn));
	}

}
