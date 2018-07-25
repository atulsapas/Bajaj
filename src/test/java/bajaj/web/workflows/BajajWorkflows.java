package bajaj.web.workflows;


import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import bajaj.web.testObjects.HomePageLocators;

import com.google.common.base.Optional;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.pages.BasePage;
import com.web.automation.utilities.ConfigManager;

public class BajajWorkflows extends BasePage {
	public WebDriver driver=ActionsLibrary.driver;
	//public EventFiringWebDriver driver;
	public ExtentLogs extentLogs = new ExtentLogs();
	Optional<Long> timeoutInSecond = Optional.of(Long.parseLong("5"));

	public BajajWorkflows(WebDriver driver) {

		super(driver);

	}

	public void Bajaj_CapitalVerifyUserDetails(BajajInput testData) throws Throwable
	{
		actionLib.Click(HomePageLocators.login, "Login Click");
		extentLogs.pass("Login Present", actionLib.getElementText(HomePageLocators.lbllogintext, "Login Message"));
		extentLogs.pass("Welcome Present", actionLib.getElementText(HomePageLocators.lblWelcometext, "Welcome Message"));
		extentLogs.pass("Phone Present", actionLib.getElementText(HomePageLocators.lblPhoneValidation, "Phone Message"));
		extentLogs.pass("Password Present", actionLib.getElementText(HomePageLocators.lblPwdValidation, "Password Message"));
		actionLib.type(HomePageLocators.EntEnterPhone, testData.UserName,"Enter Valid mobile number");
		actionLib.type(HomePageLocators.EntPass, testData.Password,"Enter Valid Password");
		actionLib.Click(HomePageLocators.BtnContinue, "Click on Continue");
		if(testData.Status.contains("InvalidNumber"))
		{
			if(driver.findElement(By.xpath("//p[@class='red animated bounceInUp delay-02']")).isDisplayed()){
					String str = driver.findElement(By.xpath("//p[@class='red animated bounceInUp delay-02']")).getText();
				  System.out.println(str);
				 extentLogs.info("Wrong number entered", "Wrong number entered" +str);
			}
		}
		else if(testData.Status.contains("Valid"))
		{
			if(driver.findElement(By.xpath("//*[@id='dropdownMenuLink']")).isDisplayed()){
				actionLib.Click(driver.findElement(By.xpath("//*[@id='dropdownMenuLink']")), "Logout");
			}
		}
		else if(testData.Status.contains("WrongPassword"))
		{
			if(driver.findElement(By.xpath("/html/body/app-root/app-login/section/div/div[1]/div[3]/p")).isDisplayed()){
				String str = driver.findElement(By.xpath("/html/body/app-root/app-login/section/div/div[1]/div[3]/p")).getText();
			  System.out.println(str);
				 extentLogs.info("Wrong number entered", "Wrong number entered" +str);}
		}
		else if(testData.Status.contains("NewUser"))
		{
			if(driver.findElement(By.xpath("/html/body/app-root/app-login/section/div/div[1]/div[3]/p")).isDisplayed()){
				String str = driver.findElement(By.xpath("/html/body/app-root/app-login/section/div/div[1]/div[3]/p")).getText();
			  System.out.println(str);
				 extentLogs.info("Wrong number entered", "Wrong number entered" +str);}
		}
		
	}
	public void Bajaj_CapitalVerifyRedeem(BajajInput testData) throws Throwable
	{
		actionLib.Click(HomePageLocators.login, "Login Click");
		extentLogs.pass("Login Present",actionLib.getElementText(HomePageLocators.lbllogintext, "Login Message"));
		extentLogs.pass("Welcome Present",actionLib.getElementText(HomePageLocators.lblWelcometext, "Welcome Message"));
		extentLogs.pass("Phone Present",actionLib.getElementText(HomePageLocators.lblPhoneValidation, "Phone Message"));
		extentLogs.pass("Password Present",actionLib.getElementText(HomePageLocators.lblPwdValidation, "Password Message"));
		actionLib.type(HomePageLocators.EntEnterPhone, testData.UserName,"Enter Valid mobile number");
		actionLib.type(HomePageLocators.EntPass, testData.Password,"Enter Valid Password");
		actionLib.Click(HomePageLocators.BtnContinue, "Click on Continue");
		
	}
	public void Bajaj_CapitalVerifyPortfolio(BajajInput testData) throws Throwable
	{
		actionLib.Click(HomePageLocators.login, "Login Click");
		extentLogs.pass("Login Present",actionLib.getElementText(HomePageLocators.lbllogintext, "Login Message"));
		extentLogs.pass("Welcome Present",actionLib.getElementText(HomePageLocators.lblWelcometext, "Welcome Message"));
		extentLogs.pass("Phone Present",actionLib.getElementText(HomePageLocators.lblPhoneValidation, "Phone Message"));
		extentLogs.pass("Password Present",actionLib.getElementText(HomePageLocators.lblPwdValidation, "Password Message"));
		actionLib.type(HomePageLocators.EntEnterPhone, testData.UserName,"Enter Valid mobile number");
		actionLib.type(HomePageLocators.EntPass, testData.Password,"Enter Valid Password");
		actionLib.Click(HomePageLocators.BtnContinue, "Click on Continue");
		extentLogs.pass("lblPortfolio Present",actionLib.getElementText(HomePageLocators.lblPortfolio, "The portfolio link"));
		actionLib.Click(HomePageLocators.lblPortfolio, "Click on The portfolio link");
		extentLogs.pass("linkAddexternal Present",actionLib.getElementText(HomePageLocators.linkAddexternal, "The portfolio link"));
		actionLib.Click(HomePageLocators.linkAddexternal, "Click on The Add External link");
	}
	public void Bajaj_CapitalVerifyaddexternal(BajajInput testData) throws Throwable
	{
		actionLib.type(HomePageLocators.Entfundname, "DSP BlackRock 3 Years Close Ended Equity Fund - Regular Plan - Dividend ","Enter Valid FUND");
		List<WebElement> eleList=driver.findElement(By.xpath("//*[@id='externalInvestmentModal']/div/div[2]/div/div/div[2]/form/ul")).findElements(By.tagName("li"));
		System.out.println(eleList.size());
		eleList.get(0).click();
		
		
		
		//Select select = new Select(driver.findElement(By.name("searchString")));
		//select.selectByVisibleText("DSP BlackRock 3 Years Close Ended Equity Fund - Regular Plan - Dividend");
		//Thread.sleep(10000);
		//actionLib.Click(HomePageLocators.Plan1, "Click on The FUND");
		actionLib.Click(HomePageLocators.Date, "Click on The FUND");
		Thread.sleep(2000);
		actionLib.type(HomePageLocators.Date, "12072018","Enter Valid Date");
		actionLib.Click(HomePageLocators.btncontinue1, "Click on The btn continue");
		actionLib.Click(HomePageLocators.error, "Click on The btn error");
		
		
	}
public void  Getdate()
{
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy ");
	Date date = new Date(0);
	String date1= dateFormat.format(date);
}
	
	public void Bajaj_Capital_Valid_Credentials(BajajInput testData) throws Throwable
	{
		actionLib.Click(HomePageLocators.login, "Login Click");
		extentLogs.pass("Login Present", actionLib.getElementText(HomePageLocators.lbllogintext, "Login Message"));
		extentLogs.pass("Welcome Present", actionLib.getElementText(HomePageLocators.lblWelcometext, "Welcome Message"));
		extentLogs.pass("Phone Present", actionLib.getElementText(HomePageLocators.lblPhoneValidation, "Phone Message"));
		extentLogs.pass("Password Present", actionLib.getElementText(HomePageLocators.lblPwdValidation, "Password Message"));
		actionLib.type(HomePageLocators.EntEnterPhone, testData.UserName,"Enter Valid mobile number");
		actionLib.type(HomePageLocators.EntPass, testData.Password,"Enter Valid Password");
		actionLib.Click(HomePageLocators.BtnContinue, "Click on Continue");
	//	if(driver.findElement(By.xpath("//p[@class='red animated bounceInUp delay-02']")).isDisplayed()){
		//	String str = driver.findElement(By.xpath("//p[@class='red animated bounceInUp delay-02']")).getText();
		  //System.out.println(str);
		// extentLogs.info("Wrong number entered", "Wrong number entered" +str);
		}
		//actionLib.Click(driver.findElement(By.xpath("//*[@id='dropdownMenuLink']")), "Logout");
		//actionLib.Click(driver.findElement(By.xpath("/html/body/app-root/app-dash-board/header[2]/nav/div/ul[2]/li[2]/div/div/a[2]")), "Logout");
		
	//}
	public void Bajaj_Capital_Blank_Credentials() throws Throwable
	{
		actionLib.Click(HomePageLocators.login, "Login Click");
		extentLogs.pass("Login Present", actionLib.getElementText(HomePageLocators.lbllogintext, "Login Message"));
		extentLogs.pass("Welcome Present", actionLib.getElementText(HomePageLocators.lblWelcometext, "Welcome Message"));
		extentLogs.pass("Phone Present", actionLib.getElementText(HomePageLocators.lblPhoneValidation, "Phone Message"));
		extentLogs.pass("Password Present", actionLib.getElementText(HomePageLocators.lblPwdValidation, "Password Message"));
		actionLib.type(HomePageLocators.EntEnterPhone, "","Enter Valid mobile number");
		actionLib.type(HomePageLocators.EntPass, "","Enter Valid Password");
		actionLib.Click(HomePageLocators.BtnContinue, "Click on Continue");
		
		if(actionLib.isElementPresent(HomePageLocators.lblinvalidmessage,"Invalid Message"))
		{
			String strText=actionLib.getElementText(HomePageLocators.lblinvalidmessage,"Invalid Message");
			System.out.println(strText);
			extentLogs.pass("Text Present", strText);
		}
		if(actionLib.isElementPresent(HomePageLocators.lblinvalidphonemessage,"Invalid Message"))
		{
			String strText=actionLib.getElementText(HomePageLocators.lblinvalidmessage,"Invalid Message");
			System.out.println(strText);
			extentLogs.pass("Text Present", strText);
		}
		else
				{
				}
				}
		
	
	public void Bajaj_Capital_Valid_New_Credentials() throws Throwable
	
	{
		actionLib.Click(HomePageLocators.login, "Login Click");
		extentLogs.pass("Login Present", actionLib.getElementText(HomePageLocators.lbllogintext, "Login Message"));
		extentLogs.pass("Welcome Present", actionLib.getElementText(HomePageLocators.lblWelcometext, "Welcome Message"));
		extentLogs.pass("Phone Present", actionLib.getElementText(HomePageLocators.lblPhoneValidation, "Phone Message"));
		extentLogs.pass("Password Present", actionLib.getElementText(HomePageLocators.lblPwdValidation, "Password Message"));
		actionLib.type(HomePageLocators.EntEnterPhone, "9711585579","Enter Valid mobile number");
		actionLib.type(HomePageLocators.EntPass, "Test@1234","Enter Valid Password");
		
		actionLib.Click(HomePageLocators.BtnContinue, "Click on Continue");
		{
		if(actionLib.isElementPresent(HomePageLocators.lblinvalidmessage,"Invalid Message"))
		{
			String strText=actionLib.getElementText(HomePageLocators.lblinvalidmessage,"Invalid Message");
			System.out.println(strText);
			extentLogs.pass("Text Present", strText);
		}
		else
				{
					
					} 
}

	}
	
	public void Bajaj_Capital_InValid_Credentials() throws Throwable
	{
		extentLogs.pass("Login Present", actionLib.getElementText(HomePageLocators.lbllogintext, "Login Message"));
		extentLogs.pass("Welcome Present", actionLib.getElementText(HomePageLocators.lblWelcometext, "Welcome Message"));
		extentLogs.pass("Phone Present", actionLib.getElementText(HomePageLocators.lblPhoneValidation, "Phone Message"));
		extentLogs.pass("Password Present", actionLib.getElementText(HomePageLocators.lblPwdValidation, "Password Message"));
		actionLib.type(HomePageLocators.EntEnterPhone, "9711585571","Enter Valid mobile number");
		actionLib.type(HomePageLocators.EntPass, "Test@123","Enter Valid Password");
		
		actionLib.Click(HomePageLocators.BtnContinue, "Click on Continue");
		{
		if(actionLib.isElementPresent(HomePageLocators.lblinvalidmessage,"Invalid Message"))
		{
			String strText=actionLib.getElementText(HomePageLocators.lblinvalidmessage,"Invalid Message");
			System.out.println(strText);
			extentLogs.pass("Text Present", strText);
		}
		else
				{
					
					} 
		}		 

	}
	public void Bajaj_Capital_InValid_format_Password_Credentials() throws Throwable
	{
		actionLib.Click(HomePageLocators.login, "Login Click");
		extentLogs.pass("Login Present", actionLib.getElementText(HomePageLocators.lbllogintext, "Login Message"));
		extentLogs.pass("Welcome Present", actionLib.getElementText(HomePageLocators.lblWelcometext, "Welcome Message"));
		extentLogs.pass("Phone Present", actionLib.getElementText(HomePageLocators.lblPhoneValidation, "Phone Message"));
		extentLogs.pass("Password Present", actionLib.getElementText(HomePageLocators.lblPwdValidation, "Password Message"));
		actionLib.type(HomePageLocators.EntEnterPhone, "9711585571","Enter Valid mobile number");
		actionLib.type(HomePageLocators.EntPass, "cdcdcdcdc","Enter Valid Password");
		
		actionLib.Click(HomePageLocators.BtnContinue, "Click on Continue");
		{
		if(actionLib.isElementPresent(HomePageLocators.lblinvalidmessage,"Invalid Message"))
		{
			String strText=actionLib.getElementText(HomePageLocators.lblinvalidmessage,"Invalid Message");
			System.out.println(strText);
			extentLogs.pass("Text Present", strText);
		}
		else
				{
					
					} 
		}		 

	}

	public void Bajaj_Capital_InValid_Phone_Credentials() throws Throwable
	{
		actionLib.Click(HomePageLocators.login, "Login Click");
		extentLogs.pass("Login Present", actionLib.getElementText(HomePageLocators.lbllogintext, "Login Message"));
		extentLogs.pass("Welcome Present", actionLib.getElementText(HomePageLocators.lblWelcometext, "Welcome Message"));
		extentLogs.pass("Phone Present", actionLib.getElementText(HomePageLocators.lblPhoneValidation, "Phone Message"));
		extentLogs.pass("Password Present", actionLib.getElementText(HomePageLocators.lblPwdValidation, "Password Message"));
		actionLib.type(HomePageLocators.EntEnterPhone, "9711","Enter InValid mobile number");
		actionLib.type(HomePageLocators.EntPass, "Test@1234","Enter Valid Password");
		
		actionLib.Click(HomePageLocators.BtnContinue, "Click on Continue");
		{
		if(actionLib.isElementPresent(HomePageLocators.lblinvalidphonemessage,"Invalid Message"))
		{
			String strText=actionLib.getElementText(HomePageLocators.lblinvalidmessage,"Invalid Message");
			System.out.println(strText);
			extentLogs.pass("Text Present", strText);
		}
		else
				{
					
					}
		}
}
	public void Forgotpassword(BajajInput testData) throws Throwable
	{
		actionLib.Click(HomePageLocators.login, "Login Click");
		if(actionLib.isElementPresent(HomePageLocators.forgotpwd,"Forgot password present"))
		{
			String strText=actionLib.getElementText(HomePageLocators.forgotpwd,"Password");
			System.out.println(strText);
			extentLogs.pass("Text Present", strText);
		}
		else
			
		actionLib.Click(HomePageLocators.forgotpwd, "Click on Continue");
		{
							}
		actionLib.Click(HomePageLocators.forgotpwd, "Click on Continue");
		actionLib.type(HomePageLocators.lblForgotMobilepwd,testData.UserName,"Enter  mobile number");
		actionLib.Click(HomePageLocators.mobileconfirm, "Click on Continue");
		Thread.sleep(60000);
		actionLib.type(HomePageLocators.Entnewpwd,testData.Password,"Enter  Password ");
		actionLib.type(HomePageLocators.Entrenewpwd,testData.Password,"Re-Enter  Password ");
		Thread.sleep(5000);
		actionLib.Click(HomePageLocators.btncontinue, "Click on Continue");
		
	}
		public void loginwith(BajajInput testData) throws Throwable
		{
			
			actionLib.type(HomePageLocators.EntEnterPhone,testData.UserName,"Phone number entered");
			actionLib.type(HomePageLocators.EntPass,testData.Password,"Password is entered");
			actionLib.Click(HomePageLocators.BtnContinue, "Click on Continue");
			Thread.sleep(10000);
			driver.quit();
			/*
			actionLib.type(HomePageLocators.EntPAN,"BDPPD8989C","PAN ID is entered");
			actionLib.type(HomePageLocators.EntDOB,"19011990","DOB is entered");
			actionLib.Click(HomePageLocators.BtnContinuenew, "Click on Continue");
			*/			
		}
		
		public void openUrl(String strURL)
		{
			System.out.println(strURL);
			actionLib.OpenApplication(strURL);
		}
		
		public void setupmainpage(BajajInput testData) throws Throwable
		{
			actionLib.Click(HomePageLocators.btngetstarted, "Click on Get started");
			Thread.sleep(2000);
			actionLib.Click(HomePageLocators.btngetgoin, "Click on Get Going");
			actionLib.type(HomePageLocators.EntName,testData.Name,"NAME is entered");	
			actionLib.Click(HomePageLocators.message, "Click on Get Going");
			Thread.sleep(2000);
			actionLib.Click(HomePageLocators.Entdob, "Click on Get Going");
			Thread.sleep(2000);
			actionLib.type(HomePageLocators.Entdob,testData.DOB,"DOB");
			actionLib.Click(HomePageLocators.message, "Click on Get Going");
			Thread.sleep(2000);
			actionLib.Click(HomePageLocators.iconprice, "Click on Get Going");
			actionLib.type(HomePageLocators.Entamount,testData.Salary,"AMOUNT is entered");
			actionLib.Click(HomePageLocators.btncont, "Click on Get Going");
			Thread.sleep(2000);
			//Step 3
		}
		public void setupplan(BajajInput testData) throws Throwable
		{
			if(testData.PlanName.contains("COVER YOUR BACK"))
			{
				actionLib.Click(HomePageLocators.COVERYOURBACK, "Click on COVER YOUR BACK");
			}
			else if(testData.PlanName.contains("IN IT TO WIN IT"))
			{
				actionLib.Click(HomePageLocators.INITTOWINIT, "Click on IN IT TO WIN IT");
			}
			else if(testData.PlanName.contains("SAVE YOUR SAVINGS"))
			{
				actionLib.Click(HomePageLocators.SAVEYOURSAVINGS, "Click on SAVE YOUR SAVINGS");
				
			}
			else if(testData.PlanName.contains("TAX PLANNING"))
			{
				actionLib.Click(HomePageLocators.TAXPLANNING, "Click on TAX PLANNING");
			}
			else if(testData.PlanName.contains("DREAM BIG"))
			{
				actionLib.Click(HomePageLocators.DREAMBIG, "Click on DREAM BIG");
			}
			
			
		
			actionLib.type(HomePageLocators.EntTargetName, testData.Name,"Enter on Get Going");
			actionLib.Click(HomePageLocators.message1, "Click on Get Going");
			actionLib.Click(HomePageLocators.btncont1, "Click on Continue");
			Thread.sleep(2000);
			//step 4 starts
		
			actionLib.Click(HomePageLocators.iconprice1, "Click on Icon");
			actionLib.type(HomePageLocators.enticonprice1, testData.OnetimeInvestment,"Enter one time SIP");
			
			actionLib.Click(HomePageLocators.iconprice2, "Click on Icon");
			actionLib.type(HomePageLocators.enticonprice2, testData.SIP,"Enter monthly SIP");
			actionLib.Click(HomePageLocators.btncont2, "Click on Confirm");
			//extentLogs.passWithScreenshot("Data Match Status", "Data successfully Match");
		
			
			//verify
			String strName=actionLib.getElementText(HomePageLocators.Lbltext, "Name");
			System.out.println(strName);
			if(strName.contains(testData.Name))
			{
				System.out.println("Name Match");
				extentLogs.pass("Data Match Status", "Data successfully Match" + strName);
				
			}
			String strDeposit=actionLib.getElementText(HomePageLocators.TxtOTdeposit, "Deposit");
			System.out.println(strDeposit);
			if(strName.contains(testData.Name))
			{
				System.out.println("Name Match");
				extentLogs.pass("Data Match Status", "Data successfully Match" + strDeposit);
				
			}
		}
		
		
		public void SignUp()
		{
			
			actionLib.Click(HomePageLocators.Register, "Register Click");
		}
		
		
		public void Bajaj_SignUp_Blank() throws Throwable
		{
			extentLogs.pass("SignUp Present", actionLib.getElementText(HomePageLocators.lblSignup, "SignUp Message"));
			extentLogs.pass("Thanks Message", actionLib.getElementText(HomePageLocators.lblthankstxt, "Thanks Message"));
			extentLogs.pass("P.S. message", actionLib.getElementText(HomePageLocators.lblPStxt, "P.S. Message"));
			extentLogs.pass("Email Lable", actionLib.getElementText(HomePageLocators.lblEmail, "Enter Email"));
			extentLogs.pass("Mob Enter", actionLib.getElementText(HomePageLocators.lblmobno, "Mobile Lable"));
			extentLogs.pass("AlrdyReg", actionLib.getElementText(HomePageLocators.lblAlReg, "User Alraedy registered"));
			extentLogs.pass("LoginLabel", actionLib.getElementText(HomePageLocators.BtnLngNw, "Login hyper link"));
			 actionLib.type(HomePageLocators.EntEmail, "","Email is required");
			actionLib.type(HomePageLocators.Entmobno, "","Mobile is required");
			actionLib.Click(HomePageLocators.BtnCntu, "Click on Continue");
			//Thread.sleep(2000l);
			extentLogs.pass("Emailvalidation", actionLib.getElementText(HomePageLocators.lblEmailvalidate, "Error Email validation"));
			Thread.sleep(2000l);
			extentLogs.pass("Mobile Validation", actionLib.getElementText(HomePageLocators.lblEntrMobile, "Error Mobile validation"));
		   
			
			if(actionLib.isElementPresent(HomePageLocators.lblEntrMobile,"Invalid Message"))
			{
				String strText=actionLib.getElementText(HomePageLocators.lblEntrMobile,"Invalid Message");
				System.out.println(strText);
				extentLogs.pass("Text Present", strText);
			}
			if(actionLib.isElementPresent(HomePageLocators.lblEmailvalidate,"Invalid Message"))
			{
				String strText=actionLib.getElementText(HomePageLocators.lblEmailvalidate,"Invalid Message");
				System.out.println(strText);
				extentLogs.pass("Text Present", strText);
			}
			else
					{
					}
					}
			
		
		public void Bajaj_SignUp_Invalid_Email() throws Throwable
		
		{
			extentLogs.pass("SignUp Present", actionLib.getElementText(HomePageLocators.lblSignup, "SignUp Message"));
			extentLogs.pass("Thanks Message", actionLib.getElementText(HomePageLocators.lblthankstxt, "Thanks Message"));
			extentLogs.pass("P.S. message", actionLib.getElementText(HomePageLocators.lblPStxt, "P.S. Message"));
			extentLogs.pass("Email Lable", actionLib.getElementText(HomePageLocators.lblEmail, "Enter Email"));
			extentLogs.pass("Mob Enter", actionLib.getElementText(HomePageLocators.lblmobno, "Mobile Lable"));
			extentLogs.pass("AlrdyReg", actionLib.getElementText(HomePageLocators.lblAlReg, "User Already registered"));
			extentLogs.pass("LoginLabel", actionLib.getElementText(HomePageLocators.BtnLngNw, "Login hyper link"));
		    actionLib.type(HomePageLocators.EntEmail, "abc","Enter Invalid Email address ");
			actionLib.type(HomePageLocators.Entmobno, "8130538887","Entered valid Mobileno. ");
			actionLib.Click(HomePageLocators.BtnCntu, "Click on Continue");
			extentLogs.pass("Emailvalidation", actionLib.getElementText(HomePageLocators.lblEmailvalidate, "Error Email validation"));
			
			
			
			if(actionLib.isElementPresent(HomePageLocators.lblEmailvalidate,"Invalid Message"))
			{
				String strText=actionLib.getElementText(HomePageLocators.lblEmailvalidate,"Invalid Message");
				System.out.println(strText);
				extentLogs.pass("Text Present", strText);
			}
			
			else
					{
					}
					}
			
	public void Bajaj_SignUp_Invalid_Mobno() throws Throwable
		
		{
			extentLogs.pass("SignUp Present", actionLib.getElementText(HomePageLocators.lblSignup, "SignUp Message"));
			extentLogs.pass("Thanks Message", actionLib.getElementText(HomePageLocators.lblthankstxt, "Thanks Message"));
			extentLogs.pass("P.S. message", actionLib.getElementText(HomePageLocators.lblPStxt, "P.S. Message"));
			extentLogs.pass("Email Lable", actionLib.getElementText(HomePageLocators.lblEmail, "Enter Email"));
			extentLogs.pass("Mob Enter", actionLib.getElementText(HomePageLocators.lblmobno, "Mobile Lable"));
			extentLogs.pass("AlrdyReg", actionLib.getElementText(HomePageLocators.lblAlReg, "User Alraedy registered"));
			extentLogs.pass("LoginLabel", actionLib.getElementText(HomePageLocators.BtnLngNw, "Login hyper link"));
		    actionLib.type(HomePageLocators.EntEmail, "abc@gmail.com","Enter valid Email address ");
			actionLib.type(HomePageLocators.Entmobno, "813053887","Entered less than Min lenght for Mobileno. ");
			actionLib.Click(HomePageLocators.BtnCntu, "Click on Continue");
			extentLogs.pass("Mobile Validation", actionLib.getElementText(HomePageLocators.lblInvalidMobile, "Error Mobile validation for less than Min lenght for Mobileno."));
			actionLib.type(HomePageLocators.Entmobno, "12","Entered Invalid Mobileno. ");
			actionLib.Click(HomePageLocators.BtnCntu, "Click on Continue");
			extentLogs.pass("Emailvalidation", actionLib.getElementText(HomePageLocators.lblValideEmailtxt, "Email validated Successfull"));
			
			extentLogs.pass("Mobile Validation", actionLib.getElementText(HomePageLocators.lblWrngMobno, "Error Mobile incorrect"));
			
			if(actionLib.isElementPresent(HomePageLocators.lblValideEmailtxt,"Invalid Message"))
			{
				String strText=actionLib.getElementText(HomePageLocators.lblValideEmailtxt,"Invalid Message");
				System.out.println(strText);
				extentLogs.pass("Text Present", strText);
			}
			if(actionLib.isElementPresent(HomePageLocators.lblInvalidMobile,"Invalid Message"))
			{
				String strText=actionLib.getElementText(HomePageLocators.lblInvalidMobile,"Invalid Message");
				System.out.println(strText);
				extentLogs.pass("Text Present", strText);
			}
			if(actionLib.isElementPresent(HomePageLocators.lblWrngMobno,"Invalid Message"))
			{
				String strText=actionLib.getElementText(HomePageLocators.lblWrngMobno,"Invalid Message");
				System.out.println(strText);
				extentLogs.pass("Text Present", strText);
			}
			
			else
					{
					}
					}
		
	public void Bajaj_SignUp_valid_RegInput() throws Throwable

	{
		extentLogs.pass("SignUp Present", actionLib.getElementText(HomePageLocators.lblSignup, "SignUp Message"));
		extentLogs.pass("Thanks Message", actionLib.getElementText(HomePageLocators.lblthankstxt, "Thanks Message"));
		extentLogs.pass("P.S. message", actionLib.getElementText(HomePageLocators.lblPStxt, "P.S. Message"));
		extentLogs.pass("Email Lable", actionLib.getElementText(HomePageLocators.lblEmail, "Enter Email"));
		extentLogs.pass("Mob Enter", actionLib.getElementText(HomePageLocators.lblmobno, "Mobile Lable"));
		extentLogs.pass("AlrdyReg", actionLib.getElementText(HomePageLocators.lblAlReg, "User Alraedy registered"));
		extentLogs.pass("LoginLabel", actionLib.getElementText(HomePageLocators.BtnLngNw, "Login hyper link"));
	   
		
	    actionLib.Click(HomePageLocators.BtnCntu, "Click on Continue");
	    extentLogs.pass("Emailvalidation", actionLib.getElementText(HomePageLocators.lblValideEmailtxt, "Email validated Successfull"));
	    if(actionLib.isElementPresent(HomePageLocators.lblValideEmailtxt,"Invalid Message"))
		{
			String strText=actionLib.getElementText(HomePageLocators.lblValideEmailtxt,"Invalid Message");
			System.out.println(strText);
			extentLogs.pass("Text Present", strText);
		}
		
		actionLib.type(HomePageLocators.EntEmail, "abc@gmail.com","Enter valid Email address ");
		actionLib.type(HomePageLocators.Entmobno, "9999661974","Entered Valid  Registered Mobileno. ");
		actionLib.Click(HomePageLocators.BtnCntu, "Click on Continue");
		extentLogs.pass("Mobile Validation", actionLib.getElementText(HomePageLocators.lblRegValidationMssg, "Error Mobile incorrect"));
		
		
		if(actionLib.isElementPresent(HomePageLocators.lblRegValidationMssg,"Invalid Message"))
		{
			String strText=actionLib.getElementText(HomePageLocators.lblRegValidationMssg,"Invalid Message");
			System.out.println(strText);
			extentLogs.pass("Text Present", strText);
		}
		
		else
				{
				}
				}


	public void Bajaj_SignUp_valid_Input() throws Throwable

	{
		extentLogs.pass("SignUp Present", actionLib.getElementText(HomePageLocators.lblSignup, "SignUp Message"));
		extentLogs.pass("Thanks Message", actionLib.getElementText(HomePageLocators.lblthankstxt, "Thanks Message"));
		extentLogs.pass("P.S. message", actionLib.getElementText(HomePageLocators.lblPStxt, "P.S. Message"));
		extentLogs.pass("Email Lable", actionLib.getElementText(HomePageLocators.lblEmail, "Enter Email"));
		extentLogs.pass("Mob Enter", actionLib.getElementText(HomePageLocators.lblmobno, "Mobile Lable"));
		extentLogs.pass("AlrdyReg", actionLib.getElementText(HomePageLocators.lblAlReg, "User Alraedy registered"));
		extentLogs.pass("LoginLabel", actionLib.getElementText(HomePageLocators.BtnLngNw, "Login hyper link"));
		actionLib.type(HomePageLocators.EntEmail, "abcyhuj@gmail.com","Enter valid Email address ");
		actionLib.type(HomePageLocators.Entmobno, "8130538676","Entered Unregistered Mobile No. ");
		extentLogs.pass("Emailvalidation", actionLib.getElementText(HomePageLocators.lblValideEmailtxt, "Email validated Successfull"));
		extentLogs.pass("Mobile Validation", actionLib.getElementText(HomePageLocators.lblValidMobno, " Mobile correct"));
		
		if(actionLib.isElementPresent(HomePageLocators.lblValideEmailtxt,"Invalid Message"))
		
		{
		
			String strText=actionLib.getElementText(HomePageLocators.lblValideEmailtxt,"Invalid Message");
			System.out.println(strText);
			extentLogs.pass("Text Present", strText);
		}
	 
		if(actionLib.isElementPresent(HomePageLocators.lblValidMobno,"Invalid Message"))
		{
			String strText=actionLib.getElementText(HomePageLocators.lblValidMobno,"Invalid Message");
			System.out.println(strText);
			extentLogs.pass("Text Present", strText);
		}
		
		else
				{
				}
				
	    actionLib.Click(HomePageLocators.BtnCntu, "Click on Continue");
	    
	    Thread.sleep(100000l);
	}
	}



