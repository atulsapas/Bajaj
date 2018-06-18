package com.web.automation.googledrive;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class ReportStatus {
public static boolean blnStatus=true;

public static void fnUpdateResultStatus(String strBrowser,String strScriptName,String strBuildNo) throws IOException, InterruptedException
{
	//Find the Row
	String spreadsheetId="1JbJZ2hjDwxDQ079VuvPdZjJrDrGTHR9NIUKdE2RnaWk";
	String strSheetName="Reg_Prod_Web_Chrome_IN";
	String range="";
	//Get the Row Number
	int intRowNo=GoogleDriveAPI.fnGetRowNo(strBrowser, strScriptName,strSheetName);				
	//Update Current Status
	String strStatus="";
	boolean blnStatus=ReportStatus.blnStatus;
	if(blnStatus)
	{
		strStatus="PASS";
	}
	else
	{
		strStatus="FAIL";
	}
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
	LocalDate localDate = LocalDate.now();
	String strDate=dtf.format(localDate);
	Calendar cal = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    String strTime=sdf.format(cal.getTime());
	//Update the Current Status
	String rangeStatus = strSheetName+"!G"+intRowNo+":G"+intRowNo;
	GoogleDriveAPI.updateContentData(spreadsheetId,rangeStatus,strStatus);
	//Update Current Date
	String rangeCurrentDate = strSheetName+"!I"+intRowNo+":I"+intRowNo;
	GoogleDriveAPI.updateContentData(spreadsheetId,rangeCurrentDate,strDate);
	//Update Current Time
	String rangeCurrentTime = strSheetName+"!J"+intRowNo+":J"+intRowNo;
	GoogleDriveAPI.updateContentData(spreadsheetId,rangeCurrentTime,strTime);
	//Update Current Build No
	String rangeCurrentBuild = strSheetName+"!H"+intRowNo+":H"+intRowNo;
	GoogleDriveAPI.updateContentData(spreadsheetId,rangeCurrentBuild,strBuildNo);
	if(strBuildNo.length()>0)
	{
	if(strStatus.equals("PASS"))
	{
		//Update Pass Count
		String rangePassCount = strSheetName+"!K"+intRowNo+":K"+intRowNo;
		//Get the current Count of Pass
		String strPassCount=GoogleDriveAPI.fnGetData(spreadsheetId,rangePassCount);
		int CountPass=Integer.parseInt(strPassCount)+1;
		String strUpdatePassCount=String.valueOf(CountPass);
		GoogleDriveAPI.updateContentData(spreadsheetId,rangePassCount,strUpdatePassCount);
		//Update Last Pass Date
		String rangePassDate = strSheetName+"!L"+intRowNo+":L"+intRowNo;
		GoogleDriveAPI.updateContentData(spreadsheetId,rangePassDate,strDate);
		//Update Last Pass Time
		String rangePassTime = strSheetName+"!M"+intRowNo+":M"+intRowNo;
		GoogleDriveAPI.updateContentData(spreadsheetId,rangePassTime,strTime);
		//Update Last Pass Build
		String rangePassBuild = strSheetName+"!N"+intRowNo+":N"+intRowNo;
		GoogleDriveAPI.updateContentData(spreadsheetId,rangePassBuild,strBuildNo);
	}
	else
	{
		//Update Fail Count
		String rangeFailCount = strSheetName+"!O"+intRowNo+":O"+intRowNo;
		String strFailCount=GoogleDriveAPI.fnGetData(spreadsheetId,rangeFailCount);
		int CountFail=Integer.parseInt(strFailCount)+1;
		String strUpdateFailCount=String.valueOf(CountFail);
		GoogleDriveAPI.updateContentData(spreadsheetId,rangeFailCount,strUpdateFailCount);	
		//Update Last Fail Date
		String rangeFailDate = strSheetName+"!P"+intRowNo+":P"+intRowNo;
		GoogleDriveAPI.updateContentData(spreadsheetId,rangeFailDate,strDate);
		//Update Last Fail Time
		String rangeFailTime = strSheetName+"!Q"+intRowNo+":Q"+intRowNo;
		GoogleDriveAPI.updateContentData(spreadsheetId,rangeFailTime,strTime);
		//Update Last Fail Build
		String rangeFailBuild = strSheetName+"!R"+intRowNo+":R"+intRowNo;
		GoogleDriveAPI.updateContentData(spreadsheetId,rangeFailBuild,strBuildNo);
	}
	}
}


}
