package bajaj.web.workflows;


import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Date;
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

	public void Login()
	{
		
		actionLib.Click(HomePageLocators.login, "Login Click");
	}
	
	public void Bajaj_Capital_Valid_Credentials() throws Throwable
	{
		extentLogs.pass("Login Present", actionLib.getElementText(HomePageLocators.lbllogintext, "Login Message"));
		extentLogs.pass("Welcome Present", actionLib.getElementText(HomePageLocators.lblWelcometext, "Welcome Message"));
		extentLogs.pass("Phone Present", actionLib.getElementText(HomePageLocators.lblPhoneValidation, "Phone Message"));
		extentLogs.pass("Password Present", actionLib.getElementText(HomePageLocators.lblPwdValidation, "Password Message"));
		actionLib.type(HomePageLocators.EntEnterPhone, "9711585571","Enter Valid mobile number");
		actionLib.type(HomePageLocators.EntPass, "Test@1234","Enter Valid Password");
		actionLib.Click(HomePageLocators.BtnContinue, "Click on Continue");
	}
	public void Bajaj_Capital_Blank_Credentials() throws Throwable
	{
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
	public void Forgotpassword() throws Throwable
	{
		/*if(actionLib.isElementPresent(HomePageLocators.forgotpwd,"Forgot password present"))
		{
			String strText=actionLib.getElementText(HomePageLocators.forgotpwd,"Password");
			System.out.println(strText);
			extentLogs.pass("Text Present", strText);
		}
		else
		*/		{
		actionLib.Click(HomePageLocators.forgotpwd, "Click on Continue");
		{
							}
		actionLib.type(HomePageLocators.lblForgotMobilepwd, "8130538887","Enter  mobile number");
		actionLib.Click(HomePageLocators.mobileconfirm, "Click on Continue");
		Thread.sleep(60000);
		actionLib.type(HomePageLocators.Entnewpwd, "Abc@1234","Enter  Password ");
		actionLib.type(HomePageLocators.Entrenewpwd, "Abc@1234","Enter  Password ");
		Thread.sleep(5000);
		actionLib.Click(HomePageLocators.btncontinue, "Click on Continue");
		}
	}
		public void loginwith() throws Throwable
		{
			
			actionLib.type(HomePageLocators.EntEnterPhone,"8130538887","Phone number entered");
			actionLib.type(HomePageLocators.EntPass,"Abc@1234","Password is entered");
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
			actionLib.Click(HomePageLocators.selectplan, "Click on Get Going");
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
		}
		
		
		}



