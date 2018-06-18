package bajaj.web.testObjects;

import org.openqa.selenium.By;

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
	public static By lblinvalidphonemessage=By.xpath("/html/body/app-root/app-login/section/div/div[1]/div[2]/p");
	
	//Forgot Password
	public static By lblforgotpwd=By.xpath("/html/body/app-root/app-forgot-password/div/section/div/div/div[1]/h1");
	public static By forgotpwd=By.xpath("/html/body/app-root/app-login/section/div/div[2]/div/div[1]/a");
	public static By mobilepwd=By.xpath("//*[@id='mobileNo']");
	public static By mobileconfirm=By.xpath("/html/body/app-root/app-forgot-password/div/section/div/div/div[3]/a/button");
}
