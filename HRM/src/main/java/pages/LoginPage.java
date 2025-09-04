package pages;
 
import java.time.Duration;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class LoginPage {
	WebDriver driver;
	WebDriverWait wait;
	
	By userName=By.xpath("//input[@name='username']");
	By passWord=By.xpath("//input[@type='password']");
	By loginSubmit=By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");

	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	}
	public void enterUserName(String username) {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(userName));
		driver.findElement(userName).sendKeys(username);
	}
	public void enterpassword(String password) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(passWord));
		driver.findElement(passWord).sendKeys(password);
	}
	public void SubmitButton() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(loginSubmit));
		driver.findElement(loginSubmit).click();
	}
}