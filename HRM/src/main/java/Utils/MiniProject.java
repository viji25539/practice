package Utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MiniProject {
	static WebDriver driver;
    static Properties prop = new Properties();
   static  DriverSetup d = new DriverSetup();
   public static WebDriverWait wait;
    
  
    public WebDriver createDriver() throws IOException {
        FileInputStream fis = new FileInputStream("./src/main/resources/config.properties");
        prop.load(fis); // use class-level prop
        DriverSetup d = new DriverSetup();
        driver = d.getSetup(prop.getProperty("browser"));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        return driver;
    }
    public void FirtsLogin(String username,String password)
	 {	  
		 WebElement e1,e2,e3;
//		 try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='username']")));
		e1=driver.findElement(By.xpath("//input[@name='username']"));
		e1.sendKeys(username);
		
		  e2=driver.findElement(By.xpath("//input[@type='password']"));
		  e2.sendKeys(password);
		 
		  e3=driver.findElement(By.xpath("//button[@type='submit']"));
		  e3. click();
		 // driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
			// driver.findElement(By.linkText("Add Employee")).click();
		  
	    }
	 public void pimAndaddEmployee()
{
//		 try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		 WebElement e1,e2;
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")));
		e1= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a"));
		e1.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		e2= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a"));
		e2.click();
}
	 
	 public void addEmployee(String firstName,String middleName,String lastName)
	 {
		 WebElement e1,e2,e3,e4,e5;
//		 try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='firstName']")));
		e1= driver.findElement(By.xpath("//input[@name='firstName']"));
		e1.sendKeys(firstName);
		e1.click();
		
		e2= driver.findElement(By.xpath("//input[@name='middleName']"));
		e2.sendKeys(middleName);
		e2.click();
		
		e3= driver.findElement(By.xpath("//input[@name='lastName']"));
		e3.sendKeys(lastName);
		e3.click();
		
		e4=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span"));
		e4.click();

       Random random = new Random();
       int id = 1000 + random.nextInt(9000); 
       String idStr = String.valueOf(id);    

		
		try {
		if(driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active oxd-input--error']")).getText().contains("already exists")) {
			driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active oxd-input--error']")).sendKeys(idStr);
		}
		}
		catch(Exception e){
			
			
		}
		
	 }
	 
	 public void loginDetails(String inUsername,String password,String password2)
	 {
		 WebElement e1,e2,e3,e4;
		 
//		 try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		 e1=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input"));
		 e1.sendKeys(inUsername);
		 
		 e2=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input"));
		 e2.sendKeys(password);
		 
		 e3=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input"));
		 e3.sendKeys(password2);
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		 e4=driver.findElement(By.xpath("//button[@type='submit']"));
		 e4.click();
	 }
	 
	 public void checkox()
	 {
//		 try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		
		WebElement e1,e2,e3;
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div/div[1]")));
		  e1=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div/div[1]"));
		 e1.click();
		 //e1=driver.findElement(By.xpath("//div[@role='option'][contains(.,'Indian')]"));
		// e1.click();
	     e2=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div"));
	     e2.click();
        
         e3=driver.findElement(By.xpath("//div[@role='option'][contains(.,'Single')]"));
         e3.click();
	 }
	 
	 public void radioButton()
	 {
//		 try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		 WebElement radio = driver.findElement(By.xpath("//input[@value='2']"));
//	      JavascriptExecutor js = (JavascriptExecutor) driver;
//	      js.executeScript("arguments[0].click();", radio);
		 
		 WebElement e1;
		 e1=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/label"));
		 e1.click();

	 }
	 public void save()
	 {
//		 try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button")).click();
		 
	 }
	 
	 public void logout()
	 {
		 WebElement e1,e2;
//		 try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		 e1=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span"));
		 e1.click();
		 
		 
		 e2=driver.findElement(By.xpath("//a[@role='menuitem'][contains(.,'Logout')]"));
		 e2.click();
	 }
	 


    public static void main(String[] args) throws IOException {
        
    	MiniProject g=new MiniProject();
    	
    	
       g.createDriver();
      
       
	g.FirtsLogin(prop.getProperty("username"), prop.getProperty("password"));
       g.pimAndaddEmployee();
       g.addEmployee(prop.getProperty("firstName"), prop.getProperty("middleName"),prop.getProperty("lastName"));
        
        g.loginDetails(prop.getProperty("inUsername"), prop.getProperty("inPassword"),prop.getProperty("confirmpassword"));
        g.checkox();
        g.radioButton();
        g.save();
       g.logout();
     
        



}
	
		
	}
