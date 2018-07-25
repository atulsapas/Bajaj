package bajaj.web.testObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePageLocators {



	//Home page
	public static By login=By.xpath(".//*[@id='navbarSupportedContent']/ul/li[5]/a");
	
	public static By lbllogintext=By.xpath("/html/body/app-root/app-login/section/div/div[1]/div[1]/h1");
	public static By lblWelcometext=By.xpath("/html/body/app-root/app-login/section/div/div[1]/div[1]/h2");
	public static By lblEntphonetext=By.xpath("/html/body/app-root/app-login/section/div/div[1]/div[2]/h2");
	public static By EntEnterPhone=By.xpath("//*[@id='phone']");
	public static By lblPhoneValidation=By.xpath("/html/body/app-root/app-login/section/div/div[1]/div[2]/h2");
	public static By lblEntPWDtext=By.xpath("/html/body/app-root/app-login/section/div/div[1]/div[3]/h2");
	public static By EntPass=By.xpath("//*[@id='pass']");
	public static By lblPwdValidation=By.xpath("/html/body/app-root/app-login/section/div/div[1]/div[3]/h2");
	public static By BtnContinue=By.xpath("/html/body/app-root/app-login/section/div/div[1]/div[4]/button");
	public static By lblinvalidmessage=By.xpath("/html/body/app-root/app-login/section/div/div[1]/div[3]/p");
	public static By lblinvalidphonemessage=By.xpath("//p[@class='red animated bounceInUp delay-02']");
	
	
	
	//Forgot Password
	public static By lblforgotpwd=By.xpath("/html/body/app-root/app-forgot-password/div/section/div/div/div[1]/h1");
	public static By forgotpwd=By.xpath("/html/body/app-root/app-login/section/div/div[2]/div/div[1]/a");
	public static By lblForgotMobilepwd=By.xpath("//*[@id='mobileNo']");
	public static By mobileconfirm=By.xpath("/html/body/app-root/app-forgot-password/div/section/div/div/div[3]/a/button");
	public static By BtnForgotpwdContinue=By.xpath("/html/body/app-root/app-forgot-password/div/section/div/div/div[3]/a/button");
	public static By lblforentphone=By.xpath("/html/body/app-root/app-forgot-password/div/section/div/div/div[2]/h2");
	public static By lblForgotMobilepwdValidation=By.xpath("/html/body/app-root/app-forgot-password/div/section/div/div/div[2]/p");
		
	// set password
	public static By lblsetpwd=By.xpath("/html/body/app-root/app-forgot-password/div/section/div/div/div[2]/h2");
	public static By lblenterpwd=By.xpath("/html/body/app-root/app-forgot-password/div/section/div/div/div[3]/form/h2");
	public static By Entnewpwd=By.xpath("//*[@id='nPassword']");
	public static By lblconfirmpwd=By.xpath("/html/body/app-root/app-forgot-password/div/section/div/div/div[4]/form/h2");
	public static By Entrenewpwd=By.xpath("//*[@id='cPassword']");
	public static By btncontinue=By.xpath("/html/body/app-root/app-forgot-password/div/section/div/div/div[5]/a/button");
	public static By EntPAN=By.xpath("//*[@id='pan1']");
	public static By EntDOB=By.xpath("//*[@id='userdob']");
	public static By BtnContinuenew=By.xpath("/html/body/app-root/app-kyc-verification/section/div/div/div[7]/div[2]/button");
	
	//New Quote
	
	public static By btngetstarted=By.xpath("/html/body/app-root/app-website-page/div[1]/section/div[2]/div/div/a");
	public static By btngetgoin=By.xpath("/html/body/app-root/app-on-boarding1/section/div/div/div[2]/button");
	public static By EntName=By.xpath("//*[@id='userName']");
	public static By iconprice=By.xpath("/html/body/app-root/app-setup-profile/section/div/div/div[3]/div/div/div[2]/div/div");
	public static By Entamount=By.xpath("//*[@id='annualSaleditTxt']");
	public static By btncont=By.xpath("/html/body/app-root/app-setup-profile/section/div/div/div[4]/button");
	public static By message=By.xpath("/html/body/app-root/app-setup-profile/section/div/div/div[1]/h2");
	public static By Entdob=By.xpath("//*[@id='userDob']");
	public static By selectplan=By.xpath("//*[@id='RainyDayFund']/div[2]");
	public static By EntTargetName=By.xpath("//*[@id='wealthTargetNameinput']");
	public static By message1=By.xpath("/html/body/app-root/app-name-wealthtarget/section/div/div/div[2]/h2");
	public static By btncont1=By.xpath("/html/body/app-root/app-name-wealthtarget/section/div/div/div[4]/button");
	public static By iconprice1=By.xpath("//*[@id='oneTimeSipeditAmount']");
	public static By enticonprice1=By.xpath("//*[@id='oneTimeSipeditText']");
	public static By iconprice2=By.xpath("//*[@id='autoMatedSipeditAmount']");
	public static By enticonprice2=By.xpath("//*[@id='autoMatedSipeditText']");
	public static By btncont2=By.xpath("/html/body/app-root/app-amount-invstform/section/div/div/div[5]/a/button");
	public static By finalimage=By.xpath("/html/body/app-root/app-recomendation/section/div[3]/div/div[1]/div");
	//Final Quote Page
	public static By Lbltext=By.xpath("/html/body/app-root/app-recomendation/section/div[3]/div/div[1]/div/h3/label");
	public static By TxtOTdeposit=By.xpath("//*[@id='amount']");
	public static By TxtSIP=By.xpath("//*[@id='amount2']");
	public static By TxtDuration=By.xpath("//*[@id='termText']");
	public static By BtnInvestNow=By.xpath("/html/body/app-root/app-recomendation/section/div[3]/div/div[1]/div/div[4]/div[1]/a/button");
	public static By Lbl6Month=By.xpath("/html/body/app-root/app-recomendation/section/div[3]/div/div[1]/div/div[3]/div/div[2]/div[2]/div/small");
	public static By AssetAllocation=By.xpath("/html/body/app-root/app-recomendation/section/div[3]/div/div[2]/div[2]/div[1]/ul/li[3]/a");
	public static By Assetdetails=By.xpath("//*[@id='card-scroll']");
	

	//Home page
	
	public static By Register=By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[6]/a");
	// Signup
	public static By lblSignup=By.xpath("/html/body/app-root/app-sign-up/section/div/form/div/div[1]/h1");
	public static By lblthankstxt = By.xpath("/html/body/app-root/app-sign-up/section/div/form/div/div[1]/h2");
	public static By lblPStxt = By.xpath("/html/body/app-root/app-sign-up/section/div/form/div/div[1]/p");
	public static By lblEmail = By.xpath("/html/body/app-root/app-sign-up/section/div/form/div/div[2]/h2");
	public static By EntEmail = By.id("userEmail");
	public static By lblmobno = By.xpath("/html/body/app-root/app-sign-up/section/div/form/div/div[3]/h2");
	public static By Entmobno = By.id("userMob");
	public static By BtnCntu= By.xpath("/html/body/app-root/app-sign-up/section/div/form/div/div[4]/button");
	public static By lblAlReg= By.xpath("/html/body/app-root/app-sign-up/section/div/form/div/div[5]/p");
	public static By BtnLngNw= By.xpath("/html/body/app-root/app-sign-up/section/div/form/div/div[5]/button");
	public static By lblEmailvalidate=By.xpath("/html/body/app-root/app-sign-up/section/div/form/div/div[2]/p");
	public static By lblEntrMobile= By.xpath("/html/body/app-root/app-sign-up/section/div/form/div/div[3]/p");
	public static By InvEmail= By.xpath("/html/body/app-root/app-sign-up/section/div/form/div/div[2]/p");

	public static By lblInvalidMobile= By.xpath("/html/body/app-root/app-sign-up/section/div/form/div/div[3]/p");
	public static By lblWrngMobno = By.xpath("/html/body/app-root/app-sign-up/section/div/form/div/div[3]/p");
	public static By lblValideEmailtxt= By.xpath("/html/body/app-root/app-sign-up/section/div/form/div/div[2]/p");
	public static By lblRegValidationMssg = By.xpath("/html/body/app-root/app-sign-up/section/div/form/div/div[3]/p");
	public static By lblValidMobno = By.xpath("/html/body/app-root/app-sign-up/section/div/form/div/div[3]/p");

	//Plan
	
	public static By COVERYOURBACK=By.id("RainyDayFundsub");
	public static By INITTOWINIT=By.id("ReteirmentFundsub");
	public static By SAVEYOURSAVINGS=By.id("BuildWealthsub");
	public static By TAXPLANNING=By.id("TaxPlanningsub");
	public static By DREAMBIG=By.id("CustomFund3sub");
	
	//Portfolio
	public static By lblPortfolio = By.xpath("/html/body/app-root/app-dash-board/header[2]/nav/div/ul[1]/li[2]");
	public static By linkAddexternal = By.xpath("/html/body/app-root/app-dash-board/app-dashboard-portfolio/div[2]/section[2]/div/div/div/div[1]/ul[2]/li[3]");
	public static By Entfundname= By.name("searchString");
	public static By btncontinue1 = By.xpath("//*[contains(@class,'btn btn-primary btn-orange')]");
	public static By Date=By.id("dateOfInvestment");
	public static By error = By.xpath("//*[@id='exampleModalCenter']/div/div/button/span/img");
	
	
	//
	}
