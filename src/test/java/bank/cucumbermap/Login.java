package bank.cucumbermap;

import java.util.Hashtable;

import org.openqa.selenium.WebDriver;

import bank.methods.HTMLReportGenerator;
import bank.methods.SeleniumOperations;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Login
{

	
	WebDriver driver;
	//private static final String  = null;

	@When("^user opens the \"([^\"]*)\" browser and exe \"([^\"]*)\"$")
	public void user_opens_the_browser_and_exe(String browser, String exepath) throws Throwable
	{
		    Object []input= new Object[2];
	        input[0]=browser;
	        input[1]=exepath;
	        SeleniumOperations.browserLaunch(input);
	        
	}

	@When("^user enters the url \"([^\"]*)\"$")
	public void user_enters_the_url(String Url) throws Throwable 
	{
		    Object[] input1=new Object[1];
	        input1[0]=Url;
	        SeleniumOperations.applicationLaunch(input1);
		
	}

	@When("^user enters \"([^\"]*)\" as a username$")
	public void user_enters_as_a_username(String uname) throws Throwable
	{
		Object []input2=new Object[2];
        input2[0]="//*[@id='txtuId']";
        input2[1]=uname;
     Hashtable<String,Object>input2op=SeleniumOperations.sendKeys(input2);
     HTMLReportGenerator.StepDetails(input2op.get("STATUS").toString(),"^user enters \\\"([^\\\"]*)\\\" as a username",input2op.get("MESSAGE").toString());
   
		
	}

	@When("^user enters \"([^\"]*)\" as a password$")
	public void user_enters_as_a_password(String password) throws Throwable 
	{
		    Object []input3=new Object[2];
		    input3[0]="//*[@id='txtPword']";
	        input3[1]=password;
	       
	        Hashtable<String,Object>input3op=SeleniumOperations.sendKeys(input3);
	        HTMLReportGenerator.StepDetails(input3op.get("STATUS").toString(),"^user enters \\\"([^\\\"]*)\\\" as a password$",input3op.get("MESSAGE").toString());
	      
	}

	@When("^user click on Login button$")
	public void user_click_on_Login_button() throws Throwable 
	{
		    Object[]input4=new Object[1];
	        input4[0]="//*[@id='login']";
	        
	        Hashtable<String,Object>input4op=SeleniumOperations.click(input4);
	        HTMLReportGenerator.StepDetails(input4op.get("STATUS").toString(),"^user click on Login button$",input4op.get("MESSAGE").toString());
	      
		
		
	}

	@Then("^user is on \"([^\"]*)\" main page and get masg welcome to Admin$")
	public void user_is_on_main_page_and_get_masg_welcome_to_Admin(String title) throws Throwable 
	{
	    
		    Object[]input5=new Object[2];
	        input5[0]="//*[contains(text(),'Admin')][@face='Verdana']";
	        input5[1]=title;
	     
	        Hashtable<String,Object>input5op=SeleniumOperations.validation(input5);
	        HTMLReportGenerator.StepDetails(input5op.get("STATUS").toString(),"^user is on \\\"([^\\\"]*)\\\" main page and get masg welcome to Admin$",input5op.get("MESSAGE").toString());
	      
    }
		
	@Then("^user gets error msg$")
	public void user_gets_error_msg() throws Throwable 
	{
	 
	Object[] popup=new Object[0];
	Hashtable<String,Object>popup01=SeleniumOperations.validationfail(popup);
    HTMLReportGenerator.StepDetails(popup01.get("STATUS").toString(),"^user gets error msg$",popup01.get("MESSAGE").toString());
  
		
		
		
		
	}
		
   }

	
	
	
	
	
	
	

	
		
	


