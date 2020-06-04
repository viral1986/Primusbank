package bank.cucumbermap;

import java.util.Hashtable;

import bank.methods.HTMLReportGenerator;
import bank.methods.SeleniumOperations;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search 
{



		@When("^user click on branches$")
		public void user_click_on_branches() throws Throwable
		{
			 Object[]input5=new Object[1];
	        input5[0]="//*[@src='images/Branches_but.jpg']";
	        SeleniumOperations.click(input5);
	        
			
			
		}

		@When("^user select \"([^\"]*)\" as a counrty$")
		public void user_select_as_a_counrty(String country) throws Throwable 
		{
			 
	        Object[]input6=new Object[2];
	        input6[0]="//*[@name='lst_countryS']";
	        input6[1]=country;
	   Hashtable<String,Object>input6op=SeleniumOperations.select(input6);
	   HTMLReportGenerator.StepDetails(input6op.get("STATUS").toString(), "^user select \\\"([^\\\"]*)\\\" as a counrty$", input6op.get("MESSAGE").toString());
			
			
		}

		@When("^user select \"([^\"]*)\" as a state$")
		public void user_select_as_a_state(String state) throws Throwable
		{
			Object[]input7=new Object[2];
	        input7[0]="//*[@name='lst_stateS']";
	        input7[1]=state;
	        SeleniumOperations.select(input7);
	        
	        Hashtable<String,Object>input7op=SeleniumOperations.select(input7);
	 	   HTMLReportGenerator.StepDetails(input7op.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as a state$", input7op.get("MESSAGE").toString());
			
			
		}

		@When("^user select \"([^\"]*)\" as a city$")
		public void user_select_as_a_city(String city) throws Throwable 
		{
			Object[]input8=new Object[2];
	        input8[0]="//*[@name='lst_cityS']";
	        input8[1]=city;
	        SeleniumOperations.select(input8);
	        
	           Hashtable<String,Object>input8op=SeleniumOperations.select(input8);
		 	   HTMLReportGenerator.StepDetails(input8op.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as a city$", input8op.get("MESSAGE").toString());
				
			
			
		}

		@When("^user click on Search button$")
		public void user_click_on_Search_button() throws Throwable 
		{
			    Object[]input9=new Object[1];
		        input9[0]="//*[@id='btn_search']";
		     
		        
		           Hashtable<String,Object>input9op=SeleniumOperations.click(input9);
			 	   HTMLReportGenerator.StepDetails(input9op.get("STATUS").toString(), "^user click on Search button$", input9op.get("MESSAGE").toString());   
			
			
		}

		@Then("^Application shows search result for \"([^\"]*)\" city$")
		public void application_shows_search_result_for_city(String city) throws Throwable 
		{
			Object []input10=new Object[2];
			input10[0]="//tr//tr[2]//td[5]";
			input10[1]=city;
		
			
			Hashtable<String,Object>input10op=SeleniumOperations.validation(input10);
		    HTMLReportGenerator.StepDetails(input10op.get("STATUS").toString(), "^Application shows search result for \\\"([^\\\"]*)\\\" city$", input10op.get("MESSAGE").toString());   
		
			
			
		}

		
		
		
		
		
		
		
		
		
		
		
		
		

}


