package Week5.day2;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Week5.day1.BaseClass;

public class CreateLead extends BaseClass {
@Test (dataProvider ="sendData") 
public void runCreateLead(String company,String firstName,String lastName) {
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager"); 
		driver.findElement(By.id("password")).sendKeys("crmsfa"); 
		driver.findElement(By.className("decorativeSubmit")).click(); 
		driver.findElement(By.linkText("CRM/SFA")).click(); 
		driver.findElement(By.linkText("Leads")).click(); 
		driver.findElement(By.linkText("Create Lead")).click(); 
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Company"); 
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("firstname"); 
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("lastname"); 
		driver.findElement(By.name("submitButton")).click(); 
}
@DataProvider
public String[][] sendData() {
	String[][] data=new String[2][3];
	data[0][0]="Testleaf";
	data[0][1]="Latha";
	data[0][2]="SH";
	
	data[1][0]="Qeagle";
	data[1][2]="Latha";
	data[1][3]="SH";
	return data;
}
}


