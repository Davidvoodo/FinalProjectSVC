package Selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.ie.InternetExplorerDriver;

import org.openqa.selenium.support.Color;



public class Initialize 
{
   //Parameters .
   static String pageName ;
   protected static WebDriver driver ;
   
   //Constructor .

	public Initialize(String browser ,String pageName1) 
	{
		Choosebrowser(browser);
        getNameUrl(pageName1); 
        this.driver.get(this.pageName);
	} 
	
	//Constructor 2 .
	
	public Initialize() 
	{

	} 
	
	
	//Method -Choose Browser . 
	public void Choosebrowser (String browser)
	{	  
		switch (browser)
		{
	    	case "Chrome":
	        this.setDriver(new ChromeDriver());
	    	break;
	    	case "FireFox":
	        this.setDriver(new FirefoxDriver());
		    break;
	    	case "IE":
	    	this.setDriver(new InternetExplorerDriver()); 
		    break; 
		}
		
	}
	


	//Method -Choose URL  . 
	public void  getNameUrl(String pageName)
	{		
		switch(pageName)
		{
		case "LOGIN":
			this.setPageName("file:///C:/Users/Owner/Desktop/signUp/index.html"); 
			break;
		case "SIGN UP":
			this.setPageName("file:///C:/Users/Owner/Desktop/signUp/index.html"); 
		    break;
		}

	}
	

	

	
	//Getters and Setters 
	
	public WebDriver getDriver() 
	{
		return driver;
	}
	
	public void setDriver(WebDriver driver) 
	{
		this.driver = driver;
	}

	public String getPageName()
	{
		return pageName;
	}

	public void setPageName(String pageName) 
	{
		this.pageName = pageName;
	}

	


	 

}
