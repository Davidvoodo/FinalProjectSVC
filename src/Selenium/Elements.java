package Selenium;

import org.openqa.selenium.By;

public class Elements extends Initialize
{
	
	//Parameters .
	private String ID ;
	private String Name;
	private String Xpath ; 
	private String cssSelector ;
	private String ClassName ;
	private String LinkText ;
	
	
	//Constructor.
	public Elements(String browser, String pageName1) 
	{
		super(browser, pageName1);

	}
	
	//Constructor 2 .
	public Elements() 
	{
		

	}
	
	


	//Method - Click Element.
		public void ClickElement (String ByElement,String nameOfElement)
		{
			switch(ByElement)
			{
			case"ID":
				this.driver.findElement(By.id(nameOfElement)).click();
			  break ;
			case"Name":
				this.driver.findElement(By.name(nameOfElement)).click();
			  break ;
			case"Xpath":
				this.driver.findElement(By.xpath(nameOfElement)).click();
			  break ;
			case"cssSelector":
				this.driver.findElement(By.cssSelector(nameOfElement)).click();
			  break ;
			case"ClassName":
				this.driver.findElement(By.className(nameOfElement)).click();
			  break ;
			case"LinkText":
				this.driver.findElement(By.linkText(nameOfElement)).click();
			  break ;
			
			}
		}
	

		//Method - Send Keys to Element .
				public void SendKeysElement (String ByElement,String nameOfElement,String text)
				{
					switch(ByElement)
					{
					  case"ID":
						  this.driver.findElement(By.id(nameOfElement)).sendKeys(text);
					  break ;
					  case"Name":
						  this.driver.findElement(By.name(nameOfElement)).sendKeys(text);
					  break ;
					  case"Xpath":
						  this.driver.findElement(By.xpath(nameOfElement)).sendKeys(text);
					  break ;
					  case"cssSelector":
						  this.driver.findElement(By.cssSelector(nameOfElement)).sendKeys(text);
					  break ;
					  case"ClassName":
						  this.driver.findElement(By.className(nameOfElement)).sendKeys(text);
					  break ;
					  case"LinkText":
						  this.driver.findElement(By.linkText(nameOfElement)).sendKeys(text);
					  break ;
					
					}
				}
			
				
				//Method - if Page contains Text .
				public void ifContainsText(String str)
				{
				   if(this.driver.getPageSource().contains(str)==true) 
				      {
					       System.out.println("Test UI(Text)-Pass");
				      }
				
				  else
				      {
				       	  System.out.println("Test UI(Text)-Failed");
			          }
				}
			
				//Method - if Page contains Color  .
			    public void CheckElementColor( )
			    {
			    	
			    	String ElementColor1 =  this.driver.findElement(By.id("ReBGetS")).getCssValue("ReBGetS");
			    	
			    }
			    
			    
			    
			  //Method - Quiet Element.
			    public void Quiet( )
			    {
			    	
			    	 this.driver.quit();
			    	
			    }
			    

	
	
	
	//Getters and Setters .
	
	public String getID() 
	{
		return ID;
	}
	public void setID(String iD)
	{
		ID = iD;
	}
	public String getName() 
	{
		return Name;
	}
	public void setName(String name)
	{
		Name = name;
	}
	public String getXpath()
	{
		return Xpath;
	}
	public void setXpath(String xpath) 
	{
		Xpath = xpath;
	}
	
	
	public String getCssSelector() {
		return cssSelector;
	}


	public void setCssSelector(String cssSelector) {
		this.cssSelector = cssSelector;
	}


	public String getClassName() 
	{
		return ClassName;
	}
	public void setClassName(String className) 
	{
		ClassName = className;
	}
	public String getLinkText() 
	{
		return LinkText;
	}
	public void setLinkText(String linkText)
	{
		LinkText = linkText;
	}
	
	
	

}
