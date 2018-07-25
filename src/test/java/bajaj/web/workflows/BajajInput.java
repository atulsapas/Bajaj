package bajaj.web.workflows;

import java.io.IOException;

import com.web.automation.fileutils.ExcelReader;

public class BajajInput {
	public String Name;
	public String DOB;
	public String Salary;
	public String OnetimeInvestment;
	public String SIP;
	public String Equity;
	public String Debt;
	public String Year;
	public String UserName;
	public String Password;
	public String Status;
	public String PlanName;
	
	public static BajajInput fnGetTestData(String strFileName,String strSheetName,int intRowNo) throws IOException
	{
		BajajInput testData=new BajajInput();
		testData.Name=ExcelReader.fn_GetCellData(strFileName, strSheetName, intRowNo, "Name");
		testData.DOB=ExcelReader.fn_GetCellData(strFileName, strSheetName, intRowNo, "DOB");
		testData.Salary=ExcelReader.fn_GetCellData(strFileName, strSheetName, intRowNo, "Salary");
		testData.OnetimeInvestment=ExcelReader.fn_GetCellData(strFileName, strSheetName, intRowNo, "OnetimeInvestment");
		testData.SIP=ExcelReader.fn_GetCellData(strFileName, strSheetName, intRowNo, "SIP");
		testData.PlanName=ExcelReader.fn_GetCellData(strFileName, strSheetName, intRowNo, "PlanName");
//		testData.Name=ExcelReader.fn_GetCellData(strFileName, strSheetName, intRowNo, "Debt");
//		testData.Name=ExcelReader.fn_GetCellData(strFileName, strSheetName, intRowNo, "Year");
//	
		return testData;
	}
	public static BajajInput fnGetLoginData(String strFileName,String strSheetName,int intRowNo) throws IOException
	{
		BajajInput testData=new BajajInput();
		testData.UserName=ExcelReader.fn_GetCellData(strFileName, strSheetName, intRowNo, "UserName");
		testData.Password=ExcelReader.fn_GetCellData(strFileName, strSheetName, intRowNo, "Password");
		testData.Status=ExcelReader.fn_GetCellData(strFileName, strSheetName, intRowNo, "Status");
		return testData;
}
}
