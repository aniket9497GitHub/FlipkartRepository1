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
       
       //click on manage address button
       Object[] input9=new Object[1];
       
       input9[0]="//*[text()='Manage Addresses']";
       SeleniumOperations.clickOnElement(input9);
       
       //click on add new address
       Object[] input10=new Object[1];
       
       input10[0]="//*[@class='_1QhEVk']";
       SeleniumOperations.clickOnElement(input10);
       
       //enter name
       Object[] input11=new Object[2];
	     
       input11[0]="//*[@name='name']";
       input11[1]="Aniket Deshmukh";
       SeleniumOperations.sendKeys(input11);
       
       //enter number
       Object[] input12=new Object[2];
	     
       input12[0]="//*[@name='phone']";
       input12[1]="9890935583";
       SeleniumOperations.sendKeys(input12); 
       
       //enter pin code
       Object[] input13=new Object[2];
	     
       input13[0]="//*[@name='pincode']";
       input13[1]="422003";
       SeleniumOperations.sendKeys(input13); 
       
       //enter locality
       Object[] input14=new Object[2];
	     
       input14[0]="//*[@name='addressLine2']";
       input14[1]="Panchavati";
       SeleniumOperations.sendKeys(input14); 
       
       //enter address
       Object[] input15=new Object[2];
	     
       input15[0]="//*[@name='addressLine1']";
       input15[1]="Flat No=5, Shree Samartha Appt, Damodar Nagar,Opposite Rajlaxmi Bank, Hirawadi Road";
       SeleniumOperations.sendKeys(input15); 
       
       //select home as address type
       Object[] input16=new Object[1];
       
       input16[0]="(//*[@class='_1XFPmK'])[1]";
       SeleniumOperations.clickOnElement(input16);
       
       //click on save
       Object[] input17=new Object[1];
       
       input17[0]="//*[@tabindex='10']";
       SeleniumOperations.clickOnElement(input17); 
       
       //validate manage address
       Object[] input18=new Object[2];
	     
       input18[0]="9890935583";
       input18[1]="//*[text()='9890935583']";
       SeleniumOperations.validationLogin(input18);
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       

   }
	
}
