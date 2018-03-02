package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Selenium.Elements;

public class signUpPage extends Elements {

	// Parameters .
	private WebElement signUpBtnPage;
	private WebElement signUpBtnText;
	private WebElement firstName;
	private WebElement lastName;
	private WebElement newEmail;
	private WebElement newPassword;
	private WebElement getStartedBTN;

	// Constructor .
	public signUpPage(String browser, String pageName1) {
		super(browser, pageName1);
	}

	// Constructor 2 .
	public signUpPage() {

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

	// Check if Not Null
	public boolean CheckIsNotNull(String str) {
		boolean isNull = false;
		try {
			if (str != null) {
				return isNull = true;
			} else {
				System.out.println("Please Enter Text");
				return isNull = false;
			}
		} catch (Exception e) {
			System.out.println("the massage is: " + e.getMessage());
		}

		return isNull;

	}

	// Method-Can Login
	public boolean LetsGetStarted(String firstName, String lastName, String email, String Password) {
		boolean getStarted = false;

		try {
			if (CheckEmailIsValid(email) && CheckIsNotNull(firstName) && CheckIsNotNull(lastName)
					&& CheckIsNotNull(Password) == true) {
				return getStarted = true;
			}

			else {
				System.out.println("Please Enter Text to all the fields or email must contains @ ");
				return getStarted = false;
			}
		} catch (Exception e) {
			System.out.println("the massage is: " + e.getMessage());
		}

		return getStarted;
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

	public void E2ESignUp(String browser) throws InterruptedException {
		try {
			// Define Browser(Chrome\IE\FireFox)and Url .
			signUpPage signUp1 = new signUpPage(browser, "SIGN UP");

			// Enter First Name.
			signUp1.getFirstName().sendKeys("David");

			// Enter Last Name.
			signUp1.getLastName().sendKeys("Mizrahi");

			// Enter E-mail.
			signUp1.getNewEmail().sendKeys("David2@gmail.com");

			// Enter Password.
			signUp1.getNewPassword().sendKeys("654321");

			// Click Element in Page .
			signUp1.getGetStartedBTN().click();

			// Wait
			Thread.sleep(3000);

			// Quiet
			signUp1.Quiet();
		} catch (Exception e) {
			System.out.println("the massage is: " + e.getMessage());
		}

	}

	// Getters and Setters .
	public WebElement getSignUpBtnPage() {
		return driver.findElement(By.id("Sign-UpB"));
	}

	public void setSignUpBtnPage(String signUpBtnPage) {
		this.signUpBtnPage = driver.findElement(By.id(signUpBtnPage));
	}

	public WebElement getSignUpBtnText() {
		return driver.findElement(By.cssSelector("#signup > h1"));
	}

	public void setSignUpBtnText(String signUpBtnText) {
		this.signUpBtnText = driver.findElement(By.id(signUpBtnText));
	}

	public WebElement getFirstName() {
		return driver.findElement(By.id("FNTB"));
	}

	public void setFirstName(String firstName) {
		this.firstName = driver.findElement(By.id(firstName));
	}

	public WebElement getLastName() {
		return driver.findElement(By.id("LNTB"));
	}

	public void setLastName(String lastName) {
		this.lastName = driver.findElement(By.id(lastName));
	}

	public WebElement getNewEmail() {
		return driver.findElement(By.id("EmailTB"));
	}

	public void setNewEmail(String newEmail) {
		this.newEmail = driver.findElement(By.id(newEmail));
	}

	public WebElement getNewPassword() {
		return driver.findElement(By.id("PassTB"));
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = driver.findElement(By.id(newPassword));
	}

	public WebElement getGetStartedBTN() {
		return driver.findElement(By.id("BGetS"));
	}

	public void setGetStartedBTN(String getStartedBTN) {
		this.getStartedBTN = driver.findElement(By.id(getStartedBTN));
	}

}
