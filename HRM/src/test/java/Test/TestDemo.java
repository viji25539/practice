package Test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestDemo {
	
	@BeforeClass
	public void setup()
	{
		System.out.println("browser opened");
	}
	@Test
	public void verifyTitle()
	{
		System.out.println("testing testCase1");
		Assert.assertEquals("ActualTitle", "ActualTitle");
	}
	@Test(dependsOnMethods="verifyTitle",invocationCount=2)
	public void verifyPage()
	{
		System.out.println("testing testCase2");
		Assert.assertTrue("testing".equals("testing"));
	}
	
	
	@AfterClass
	public void tearDown()
	{
		System.out.println("browser closed");
	}

}
//beforemethod,aftermethod
//beforeClass,AfterClass
//priority,low=high priority
//dependsOnMethods="---- "-->to check the previous method before coming to this method,using this ifthe previous method fails then this method being depended on that method then his method will skipped,we can also have muliple depends by using curly braces
//without assert then it is not validating,with assert only acctual testing happens
//boolean,always true -assertTrue
//assertEquals-comparing
//invocationCount -looping the same testCase 
//not to execute a testCase-->enabled(it is a boolean value)