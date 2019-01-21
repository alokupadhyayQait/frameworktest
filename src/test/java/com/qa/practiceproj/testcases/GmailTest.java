package com.qa.practiceproj.testcases;

import org.testng.annotations.Test;

import com.qa.practiceproj.base.Testbase;
import com.qa.practiceproj.pages.GmailTestActions;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;


public class GmailTest extends Testbase {
	GmailTestActions obj;
	public GmailTest()
	{
		super();
	}
	  @BeforeClass
	  public void beforeClass() {
		  initialization();
		  obj=new GmailTestActions();
	  }	
	
  @Test
  public void a_LaunchGmail() 
  {
  obj.launchGmail();
  }
  @Test
  public void b_clickOnSignIN()
  {
  obj.clickOnSignInButton();
	
  } 
  @AfterClass
  public void afterMethod() {
	  driver.quit();  
  }


}
