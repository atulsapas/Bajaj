package bajaj.web.scripts;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import bajaj.web.workflows.BajajWorkflows;

import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.fileutils.ExcelReader;
import com.web.automation.googledrive.ReportStatus;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.pages.SugarCRMPage;
import com.web.automation.pages.SugarContactsInput;
import com.web.automation.utilities.CommonVariables;

public class Bajaj_Capital_InValid_Phone_Credentials extends TestEngineWeb {

	public String strBuildNo="";
	private String testCaseFailureReason = "";
	private boolean testCaseStatus = true;
	protected String sheetPath = System.getProperty("user.dir").replace("\\", "/") + "/testdata/TestData.xlsx";
	protected String sheetName = "Bajaj_1";
	Map<String, List<String>> testdata = null;
	private ExtentLogs extentLogs = new ExtentLogs();
	private BajajWorkflows Bajaj;
	boolean isLoginSuccessfull,isLogOutSuccessfull;
	public void TestCaseStatus(Boolean status, String reason) {
		if (status == false) {
			Assert.fail("Test Case Failed because - " + reason);
		}
	}
	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() throws Throwable {
		Bajaj = new BajajWorkflows(CommonVariables.CommonDriver.get());
	}
	@Test(description = "Bajaj", groups = { "smoke", "regression" })
	public void Bajaj_Capital_InValid_Phone_Credentials() throws Throwable {
		try {
			Bajaj.Login();
			Bajaj.Bajaj_Capital_InValid_Phone_Credentials();
			Thread.sleep(10000);
			//System.out.println("Valid Login is successful");
		
		}
		catch (Exception e) {
			testCaseFailureReason = "Failed to complete Bajaj Web Script";
			String stackTrace = extentLogs.getStackTraceAsString("Test", testCaseFailureReason, e);
			extentLogs.fail("Bajaj ", testCaseFailureReason + "Failed Reason : " + stackTrace);
			testCaseStatus = false;
		}
		TestCaseStatus(testCaseStatus, testCaseFailureReason);
	}
	
	
	
	
}

