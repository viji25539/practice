package Utils;


import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverSetup {
	static WebDriver driver;
	//static WebDriverWait wait;
	//static Properties prop = new Properties();
	
	  public WebDriver getSetup(String browser)
	  {
		  if(browser.equals("chrome"))
		  {
			  
			  driver = new ChromeDriver();
		  }
		  else if(browser.equals("edge"))
			  
		  {
			  System.setProperty("webdriver.edge.driver", "C:\\Users\\2425659\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
			  driver = new EdgeDriver();
		  }
		 
		  return driver;
	  }
	  
	

	 }

