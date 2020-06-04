package bank.UnitSteps;

import bank.methods.SeleniumOperations;

public class StepExecutor {

	public static void main(String[] args) throws InterruptedException
	{
	
        Object []input= new Object[2];
        input[0]="chrome";
        input[1]="F:\\DRIVERS AUTOMATIONS\\ChromeDriver.exe";
        SeleniumOperations.browserLaunch(input);
        
        
        Object[] input1=new Object[1];
        input1[0]="http://primusbank.qedgetech.com/";
        SeleniumOperations.applicationLaunch(input1);
        
        Object []input2=new Object[2];
        input2[0]="//*[@id='txtuId']";
        input2[1]="Admin";
        SeleniumOperations.sendKeys(input2);
        
        Object []input3=new Object[2];
        input3[0]="//*[@id='txtPword']";
        input3[1]="Admin";
        SeleniumOperations.sendKeys(input3);
        
        Object[]input4=new Object[1];
        input4[0]="//*[@id='login']";
        SeleniumOperations.click(input4);
        

        Object[]input5=new Object[1];
        input5[0]="//*[@src='images/Branches_but.jpg']";
        SeleniumOperations.click(input5);
        
        Object[]input6=new Object[2];
        input6[0]="//*[@name='lst_countryS']";
        input6[1]="UK";
        SeleniumOperations.select(input6);
        
        Object[]input7=new Object[2];
        input7[0]="//*[@name='lst_stateS']";
        input7[1]="England";
        SeleniumOperations.select(input7);
        
        Object[]input8=new Object[2];
        input8[0]="//*[@name='lst_cityS']";
        input8[1]="LONDON";
        SeleniumOperations.select(input8);
        
        Object[]input9=new Object[1];
        input9[0]="//*[@id='btn_search']";
        SeleniumOperations.click(input9);
        
        
        Object[]input10=new Object[1];
        input10[0]="//*[@src='images/Roles_but.jpg']";
        SeleniumOperations.click(input10);
        
        Object[]input11=new Object[1];
        input11[0]="    //*[@id='btnRoles']";
        SeleniumOperations.click(input11);
      
        Object []input12=new Object[2];
        input12[0]="//*[@id='txtRname']";
        input12[1]="MANAGER";
        SeleniumOperations.sendKeys(input12);
        
        Object []input13=new Object[2];
        input13[0]="//*[@id='txtRDesc']";
        input13[1]="INTERNATIONAL";
        SeleniumOperations.sendKeys(input13);
        
        Object[]input14=new Object[2];
        input14[0]="//*[@id='lstRtypeN']";
        input14[1]="C";
        SeleniumOperations.select(input14);
        
        Object[]input15=new Object[1];
        input15[0]="//*[@id='btninsert']";
        SeleniumOperations.click(input15);

        SeleniumOperations.alertPopup(input15);
        
        Object[] input16=new Object[1];
        input16[0]="//*[@src='images/admin_but_01.jpg']";
        SeleniumOperations.mouseMoveOver(input16);
        
      
        
        
        
        
		
	}

}
