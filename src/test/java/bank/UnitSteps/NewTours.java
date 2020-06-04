package bank.UnitSteps;

import bank.methods.SeleniumOperations;

public class NewTours {

	public static void main(String[] args) 
{
		    Object []input= new Object[2];
	        input[0]="chrome";
	        input[1]="F:\\DRIVERS AUTOMATIONS\\ChromeDriver.exe";
	        SeleniumOperations.browserLaunch(input);
		
	        Object[] input1=new Object[1];
	        input1[0]="http://newtours.demoaut.com/";
	        SeleniumOperations.applicationLaunch(input1);
		  
	        Object[]input2=new Object[1];
	        input2[0]="//*[contains(text(),'Home')]";
	        SeleniumOperations.mouseMoveOver(input2);
	        
	        Object[]input3=new Object[1];
	        input3[0]="//*[contains(text(),'Car Rentals')]";
	        SeleniumOperations.mouseDoubleClick(input3);
		
	        Object[]input4=new Object[1];
	        input4[0]="//*[contains(text(),'Car Rentals')]";
	        SeleniumOperations.mouseRightCLick(input4);
	        
	        Object []input5= new Object[2];
	        input5[0]="chrome";
	        input5[1]="F:\\DRIVERS AUTOMATIONS\\ChromeDriver.exe";
	        SeleniumOperations.browserLaunch(input5);
	        
	        
		
	        Object[] input6=new Object[1];
	        input6[0]="https://jqueryui.com/droppable/";
	        SeleniumOperations.applicationLaunch(input6);
	        
	        
	        //drag and drop
	        Object[]input7=new Object[3];
	        input7[0]="//*[@class='demo-frame']";
	        input7[1]="//div[@id='draggable']";
	        input7[2]="//div[@id='droppable']";
	        SeleniumOperations.dragAndDropIframe(input7);
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
		

}

}
