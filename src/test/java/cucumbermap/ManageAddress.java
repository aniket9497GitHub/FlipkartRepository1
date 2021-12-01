package cucumbermap;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class ManageAddress 
{
	@When("user click on Manage Address button")
	public void user_click_on_manage_address_button() 
	{
		Object[] input1=new Object[1];
	    input1[0]="//*[text()='Manage Addresses']";
	    Hashtable <String,Object> output1=SeleniumOperations.clickOnElement(input1);
	    HTMLReportGenerator.StepDetails(output1.get("STATUS").toString(), "user click on Manage Address button", output1.get("MESSAGE").toString());
	}

	@When("user click on Add New Address button")
	public void user_click_on_add_new_address_button() 
	{
		 Object[] input2=new Object[1];
	     input2[0]="//*[@class='_1QhEVk']";
	     Hashtable <String,Object> output2=SeleniumOperations.clickOnElement(input2);
	     HTMLReportGenerator.StepDetails(output2.get("STATUS").toString(), "user click on Add New Address button", output2.get("MESSAGE").toString());
	}

	@When("user enter {string} as name")
	public void user_enter_as_name(String name) 
	{
		Object[] input3=new Object[2];
	    input3[0]="//*[@name='name']";
	    input3[1]=name;
	    Hashtable <String,Object> output3=SeleniumOperations.sendKeys(input3);
	    HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(), "user enter {string} as name", output3.get("MESSAGE").toString());
	       
	}

	@When("user enter {string} as mobile number")
	public void user_enter_as_mobile_number(String number) 
	{
		Object[] input4=new Object[2];
	    input4[0]="//*[@name='phone']";
	    input4[1]=number;
	    Hashtable <String,Object> output4=SeleniumOperations.sendKeys(input4); 
	    HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "user enter {string} as mobile number", output4.get("MESSAGE").toString());
	}

	@When("user enter {string} as pincode")
	public void user_enter_as_pincode(String pincode) 
	{
		 Object[] input5=new Object[2];
	     input5[0]="//*[@name='pincode']";
	     input5[1]=pincode;
	     Hashtable <String,Object> output5=SeleniumOperations.sendKeys(input5); 
	     HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "user enter {string} as pincode", output5.get("MESSAGE").toString());
	}

	@When("user enter {string} as locality")
	public void user_enter_as_locality(String locality) 
	{
		Object[] input6=new Object[2];
	    input6[0]="//*[@name='addressLine2']";
	    input6[1]=locality;
	    Hashtable <String,Object> output6=SeleniumOperations.sendKeys(input6); 
	    HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "user enter {string} as locality", output6.get("MESSAGE").toString());
	}

	@When("user enter {string} as address")
	public void user_enter_as_address(String address) 
	{
		Object[] input7=new Object[2];
	    input7[0]="//*[@name='addressLine1']";
	    input7[1]=address;
	    Hashtable <String,Object> output7=SeleniumOperations.sendKeys(input7);
	    HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "user enter {string} as address", output7.get("MESSAGE").toString());
	}

	@When("user select Home as address type")
	public void user_select_home_as_address_type() 
	{
		Object[] input8=new Object[1];
	    input8[0]="(//*[@class='_1XFPmK'])[1]";
	    Hashtable <String,Object> output8=SeleniumOperations.clickOnElement(input8);
	    HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "user select Home as address type", output8.get("MESSAGE").toString());
	}

	@When("user click on Save button")
	public void user_click_on_save_button() 
	{
		 Object[] input9=new Object[1];
	     input9[0]="//*[@tabindex='10']";
	     Hashtable <String,Object> output9=SeleniumOperations.clickOnElement(input9); 
	     HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(), "user click on Save button", output9.get("MESSAGE").toString());
	}

	@Then("application shows new address on profile page")
	public void application_shows_new_address_on_profile_page() 
	{
		 Object[] input10=new Object[2];
	     input10[0]="9890935583";
	     input10[1]="//*[text()='9890935583']";
	     Hashtable <String,Object> output10=SeleniumOperations.validationLogin(input10);
	     HTMLReportGenerator.StepDetails(output10.get("STATUS").toString(), "application shows new address on profile page", output10.get("MESSAGE").toString());
	}
	
	
	
	
	
	
	
	
}
