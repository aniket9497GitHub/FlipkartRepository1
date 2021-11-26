package utility;

import java.time.Duration;
import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations 
{
    public static WebDriver driver=null;
    
    public static Hashtable <String,Object> outputParameters=new Hashtable<String,Object>();
	
    //browserLaunch
	public static Hashtable <String,Object> browserLaunch(Object[]inputParameters)
	{
		try {
		String strBrowserName=(String) inputParameters[0];
		String webDriverExe=(String) inputParameters[1];
		
		if(strBrowserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", webDriverExe);
			driver=new ChromeDriver(); 
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		}else if(strBrowserName.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", webDriverExe);
			driver=new ChromeDriver(); 
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		}
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodName:browserLaunch, Input_Data : " + inputParameters[1].toString());
		
		}catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodName:browserLaunch, Input_Data : " + inputParameters[1].toString());
		}
		return outputParameters;
	}
	
	//openApplication
	public static Hashtable <String,Object> openApplication(Object[]inputParameters)
	{
		try {
		String strURL=(String) inputParameters[0];
		driver.get(strURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodName:openApplication, Input_Data : " + inputParameters[0].toString());
		
		}catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodName:openApplication, Input_Data : " + inputParameters[0].toString());
		}
		return outputParameters;
	}
	
	//clickOnElement
	public static Hashtable <String,Object> clickOnElement(Object[]inputParameters)
	{
		try {
		String xpath=(String) inputParameters[0];
		driver.findElement(By.xpath(xpath)).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodName:clickOnElement, Input_Data : " + inputParameters[0].toString());
		
		}catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodName:clickOnElement, Input_Data : " + inputParameters[0].toString());
		}
		return outputParameters;
	}
	
	//moveToElement
	public static Hashtable <String,Object> moveToElement(Object[]inputParameters)
	{
		try {
		String xpath=(String) inputParameters[0];
		Actions act=new Actions(driver);
		WebElement element=driver.findElement(By.xpath(xpath));
		act.moveToElement(element).build().perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodName:moveToElement, Input_Data : " + inputParameters[0].toString());
		
		}catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodName:moveToElement, Input_Data : " + inputParameters[0].toString());
		}
		return outputParameters;
	}
	
	//sendKeys
	public static Hashtable <String,Object> sendKeys(Object[]inputParameters)
	{
		try {
		String xpath=(String) inputParameters[0];
		String strValue=(String) inputParameters[1];
		driver.findElement(By.xpath(xpath)).sendKeys(strValue);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodName:sendKeys, Input_Data : " + inputParameters[1].toString());
		
		}catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodName:sendKeys, Input_Data : " + inputParameters[1].toString());
		}
		return outputParameters;
	}
	
	//validationLogin
	public static Hashtable <String,Object> validationLogin(Object[]inputParameters)
	{
		try {
		String givenText=(String) inputParameters[0];
		String xpath=(String) inputParameters[1];
		
		String text=driver.findElement(By.xpath(xpath)).getText();
		if(givenText.equalsIgnoreCase(text))
		{
			System.out.println("Test Case Pass");
		}else
		{
			System.out.println("Test Case Fail");
		}
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodName:validationLogin, Input_Data : " + inputParameters[0].toString());
		
	    }catch(Exception e)
		{
		   outputParameters.put("STATUS", "FAIL");
		   outputParameters.put("MESSAGE", "methodName:validationLogin, Input_Data : " + inputParameters[0].toString());
		}
		return outputParameters;
	
	}
	
}