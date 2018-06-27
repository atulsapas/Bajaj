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

	
	
	public static BajajInput fnGetTestData(String strFileName,String strSheetName,int intRowNo) throws IOException
	{
		BajajInput testData=new BajajInput();
		testData.Name=ExcelReader.fn_GetCellData(strFileName, strSheetName, intRowNo, "Name");
		testData.DOB=ExcelReader.fn_GetCellData(strFileName, strSheetName, intRowNo, "DOB");
		testData.Salary=ExcelReader.fn_GetCellData(strFileName, strSheetName, intRowNo, "Salary");
		testData.OnetimeInvestment=ExcelReader.fn_GetCellData(strFileName, strSheetName, intRowNo, "OnetimeInvestment");
		testData.SIP=ExcelReader.fn_GetCellData(strFileName, strSheetName, intRowNo, "SIP");
//		testData.Name=ExcelReader.fn_GetCellData(strFileName, strSheetName, intRowNo, "Equity");
//		testData.Name=ExcelReader.fn_GetCellData(strFileName, strSheetName, intRowNo, "Debt");
//		testData.Name=ExcelReader.fn_GetCellData(strFileName, strSheetName, intRowNo, "Year");
//	
		return testData;
	}
	
}
