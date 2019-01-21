package com.qa.practiceproj.pages;

import java.util.concurrent.TimeUnit;
import org.testng.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.qa.practiceproj.base.LocatorsCall;
import com.qa.practiceproj.base.Testbase;

public class GmailTestActions extends Testbase 
{
	LocatorsCall locatorCall;
   JavascriptExecutor js = (JavascriptExecutor) driver;
   WebElement e;
   int count=1;
	
	public GmailTestActions()
	{
		PageFactory.initElements(driver, this);
		locatorCall= new LocatorsCall(driver);
	}

	public void launchGmail()
	{   
		System.out.println("launcing gmail");
		driver.get("https://www.amazon.in/");
		System.out.println("launched gmail");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		System.out.println("wait complete");
	}
  /*   public void clickOnSignInButton()
	{   
		
		count++;
		System.out.println("clicking");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		if(count<3)
		{
		Assert.assertTrue(!(driver.findElement(By.cssSelector("#nav-link-yourAccount")).isDisplayed()));
		js.executeScript("document.querySelectorAll(\"#nav-link-yourAccount\")[0].click();","");
		}
		if(count==3)
		{
		Assert.assertTrue((driver.findElement(By.cssSelector("#nav-link-yourAccount")).isDisplayed()));
		js.executeScript("document.querySelectorAll(\"#nav-link-yourAccount\")[0].click();","");
		}
		//driver.findElement(By.cssSelector("#nav-link-yourAccount")).click();
		System.out.println("displayed+clicked");
	}*/
	public void clickOnSignInButton()
	{   
		System.out.println("clicking");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		//Assert.assertTrue(driver.findElement(By.cssSelector("#nav-link-yourAccount")).isDisplayed());
		e=locatorCall.getWebElementsTag("signIn");
		System.out.println("printing e-->"+e);
		e.click();
		System.out.println("displayed+clicked");
	}
   
}
