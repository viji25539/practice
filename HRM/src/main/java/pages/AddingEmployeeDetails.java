package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddingEmployeeDetails {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	By clickPim=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a");
	By clickEmp=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a");
	By firstname =By.xpath("//input[@name='firstName']");
	By middlename =By.xpath("//input[@name='middleName']");
	By lastname =By.xpath("//input[@name='lastName']");
	By clickSlider =By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span");
	By inUsername =By.xpath("//*[@id=\\\"app\\\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input");
	By inpassword =By.xpath("//*[@id=\\\"app\\\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input");
	By confirmpassword =By.xpath("//*[@id=\\\"app\\\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input");
	By insaveButton =By.xpath("//button[@type='submit']");
	By nationality1 =By.xpath("//*[@id=\\\"app\\\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div/div[1]");
	By nationality2=By.xpath("//div[@role='option'][contains(.,'Indian')]");
	By marital1 =By.xpath("//*[@id=\\\"app\\\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div");
	By marital2 =By.xpath("//div[@role='option'][contains(.,'Single')]");
	By radio =By.xpath("//*[@id=\\\"app\\\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/label");
	By save =By.xpath("//*[@id=\\\"app\\\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button");
	By logout1 =By.xpath("//*[@id=\\\"app\\\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span");
	By logout2 =By.xpath("//a[@role='menuitem'][contains(.,'Logout')]");
	
	public AddingEmployeeDetails(WebDriver driver)
	{
		this.driver=driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
	}
	public void clickingPim() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickPim));
		driver.findElement(clickPim).click();
	}
	
	public void clickingAddEmp() 
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickEmp));
		driver.findElement(clickEmp).click();
	}
	public void firstName(String firstName)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(firstname));
		driver.findElement(firstname).sendKeys("firstName");
	}
	
	public void middleName(String middleName)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(middlename));
		driver.findElement(middlename).sendKeys("middleName");
	}
	public void lastName(String lastName)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(lastname));
		driver.findElement(lastname).sendKeys("lastName");
	}
	
	public void clickSlidder()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickSlider));
		driver.findElement(clickSlider).click();
	}
	public void inusername(String username)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(inUsername));
		driver.findElement(inUsername).sendKeys("inUsername");
	}
	public void inpassword(String password)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(inpassword));
		driver.findElement(inpassword).sendKeys("inpassword");
	}
	public void confirmpassword(String confirmpasswords)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(confirmpassword));
		driver.findElement(confirmpassword).sendKeys("confirmpassword");
	}
	public void insaveButton ()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(insaveButton));
		driver.findElement(insaveButton).click();
	}
	public void dropDown1()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(nationality1));
		driver.findElement(nationality1).click();
		driver.findElement(nationality2).click();
	}
	public void dropDown2()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(marital1));
		driver.findElement(marital1).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(marital2));
		driver.findElement(marital2).click();
	}
	public void radioButton()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(radio));
		driver.findElement(radio).click();
	}
	public void logout()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(logout1));
		driver.findElement(logout1).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(logout2));
		driver.findElement(logout2).click();
	}
	
	
	

}
