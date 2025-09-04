package viji;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class project
{
  // 	WebDriver driver =new ChromeDriver();
   
   public static void main(String[] args)
   {
   
	   WebDriver driver;
	   
	   driver=new ChromeDriver();
	   driver.get("https://www.selenium.dev/selenium/web/click_frames.html");
	   
	   driver.switchTo().frame("otherframe");
//   /	public void setup()
//   	{
//   	 driver.get("https://www.selenium.dev/selenium/web/alerts.html");
//   	 driver.findElement(By.xpath("//*[@id=\"alert\"]")).click();
//   	driver.switchTo().alert().accept();
//   	
//   	}
//   	
//   	
//   	public static void main(String[] args)
//   	{
//   		project p=new project();
//   		p.setup();
//   		
//   	}
//  // driver.get("https://www.selenium.dev/selenium/web/alerts.html");
//}/*}
	
}
}