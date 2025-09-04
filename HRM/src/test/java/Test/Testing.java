package Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Utils.DriverSetup;
import pages.AddingEmployeeDetails;
import pages.LoginPage;

public class Testing {
	
	
		WebDriver driver;
		Properties prop=new Properties();
		LoginPage loginpage;
		AddingEmployeeDetails empdetails;
		
		@BeforeClass 
		//each method time will open browser so once open browser 
		public void setup() throws IOException {
			 FileInputStream fis = new FileInputStream("./src/main/resources/config.properties");
		        prop.load(fis); // use class-level pro
		        DriverSetup setup=new DriverSetup();
		       driver=setup.getSetup(prop.getProperty("browser"));
		       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}
	//	@Test(priority=1)
//		public void testCase1() throws IOException
//		{
//			 FileInputStream fis = new FileInputStream("./src/main/resources/config.properties");
//		        prop.load(fis); // use class-level pro
//		        DriverSetup setup=new DriverSetup();
//		       driver=setup.getSetup(prop.getProperty("browser"));
//		       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		      
		@Test(priority=1)
	
		public void Login() {
			loginpage=new LoginPage(driver);
			loginpage.enterUserName(prop.getProperty("username"));
			loginpage.enterpassword(prop.getProperty("password"));
			loginpage.SubmitButton();
			
											
		}
		@Test(priority=2)
		public void addEmployeeDetails() {
			empdetails=new AddingEmployeeDetails(driver);
			empdetails.clickingPim();
			empdetails.clickingAddEmp();
			empdetails.firstName(prop.getProperty("firstName"));
			empdetails.middleName(prop.getProperty("middleName"));
			empdetails.lastName(prop.getProperty("lastName"));
			empdetails.clickSlidder();
			empdetails.inusername(prop.getProperty("inUsername"));
			empdetails.inpassword(prop.getProperty("inPassword"));
			empdetails.confirmpassword(prop.getProperty("confirmpassword"));
			empdetails.insaveButton();
			empdetails.dropDown1();
			empdetails.dropDown2();
			empdetails.radioButton();
			empdetails.logout();
			
			WebElement dropdown=driver.findElement(By.id(""));	
			Select s=new Select(dropdown);
			s.selectByVisibleText("");
			
			
		}
		@Test(priority=3)
		public void close() {
			
			driver.quit();
			
		}

}
