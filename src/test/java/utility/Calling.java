package utility;

public class Calling 
{
   public static void main(String[]args)
   {
	   //bLaunch
	   Object[] input=new Object[2];
	     
       input[0]="Chrome";
       input[1]="D:\\PerfectLearn\\Automation Support\\chromedriver.exe";
       SeleniumOperations.browserLaunch(input);
	   
       //openApp
       Object[] input1=new Object[1];
       
       input1[0]="https://www.flipkart.com/";
       SeleniumOperations.openApplication(input1);
	   
       //click on cancel
       Object[] input2=new Object[1];
       
       input2[0]="//*[@class='_2KpZ6l _2doB4z']";
       SeleniumOperations.clickOnElement(input2);
       
       //move to login
       Object[] input3=new Object[1];
       
       input3[0]="//*[@class='_28p97w']";
       SeleniumOperations.moveToElement(input3);
       
       //click on My Profile
       Object[] input4=new Object[1];
       
       input4[0]="//*[text()='My Profile']";
       SeleniumOperations.clickOnElement(input4);
       
       //enter username
       Object[] input5=new Object[2];
	     
       input5[0]="(//*[@autocomplete='off'])[2]";
       input5[1]="aniket9497@gmail.com";
       SeleniumOperations.sendKeys(input5);
       
       //enter password
       Object[] input6=new Object[2];
	     
       input6[0]="//*[@type='password']";
       input6[1]="aniket97";
       SeleniumOperations.sendKeys(input6);
       
       //click on login
       Object[] input7=new Object[1];
       
       input7[0]="(//*[@type='submit'])[2]";
       SeleniumOperations.clickOnElement(input7);
       
       //validate Login
       Object[] input8=new Object[2];
	     
       input8[0]="Aniket Deshmukh";
       input8[1]="//*[text()='Aniket Deshmukh']";
       SeleniumOperations.validationLogin(input8);

   }
	
}
