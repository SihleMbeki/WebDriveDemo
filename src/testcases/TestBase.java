package testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TestBase {
	public ExtentHtmlReporter htmlreporter;
	public ExtentReports extent ;
	public ExtentTest test;
	
	@BeforeTest 
	public void setReport() {
		
		htmlreporter = new ExtentHtmlReporter("./reports/extent.html");
		htmlreporter.config().setEncoding("utf-8");
		htmlreporter.config().setDocumentTitle("test Script");
		htmlreporter.config().setReportName("Report Results");
		htmlreporter.config().setTheme(Theme.STANDARD);
		
		extent =new ExtentReports();
		extent.attachReporter(htmlreporter);
		extent.setSystemInfo("Automation Tester", "Sihle Matanzima");
		
	}
	
	@Test
	public void doLogin() {
		test=extent.createTest("System Login");
		System.out.print("System login");
		
	}
	
	@Test
	public void doRegister() {
		test=extent.createTest("System Register");
		System.out.print("System Register");
		
	}
	
	@AfterTest
	public void endReport(){
		extent.flush();
		
	}
	

}
