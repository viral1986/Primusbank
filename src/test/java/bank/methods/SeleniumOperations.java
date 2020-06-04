package bank.methods;


import java.util.Hashtable;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class SeleniumOperations
{
 
	public static Hashtable<String,Object> outputparameters=new Hashtable<String,Object>();
	
	public static WebDriver driver=null;
	
	
	//Browser Launch
	
	public static  Hashtable<String,Object>  browserLaunch (Object[] inputparameters)
{
		
   try {
		String openbrowser=(String) inputparameters[0];
		String webdriverxpath=(String) inputparameters[1];
		
		if(openbrowser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",webdriverxpath);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		}
		
		else if(openbrowser.equalsIgnoreCase("ff"))
		{
			System.setProperty("webdriver.gecko.driver",webdriverxpath);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		}	
		
		outputparameters.put("STATUS", "PASS");
		outputparameters.put("MESSAGE", "Action:Browser Launch, Input Given"+inputparameters[0].toString());
      }
		
		catch (Exception e)
		{
			outputparameters.put("STATUS", "FAIL");
			outputparameters.put("MESSAGE", "Action:Browser Launch, Input Given"+inputparameters[0].toString());
			
		}
   return outputparameters;
   
 }

	 //Application Launch
	public static  Hashtable<String,Object>  applicationLaunch(Object[]inputparameters)
{
		
	try
	{
		String URL=(String) inputparameters[0];
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		outputparameters.put("STATUS", "PASS");
		outputparameters.put("MESSAGE", "Action: Application Launch, Input Given"+inputparameters[0].toString());
	}
	
	catch(Exception e)
	{
		outputparameters.put("STATUS", "FAIL");
		outputparameters.put("MESSAGE", "Action:Application Launch, Input Given"+inputparameters[0].toString());
		
	}
	return outputparameters;
}
	
	
	//Send key
	public static  Hashtable<String,Object>  sendKeys(Object[]inputparameters)
{
		
	try {	
		String xpath=(String) inputparameters[0];
		String value=(String) inputparameters[1];
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement obj=driver.findElement(By.xpath(xpath));
		           obj.clear();
		           obj.sendKeys(value);
		           
		       	outputparameters.put("STATUS", "PASS");
				outputparameters.put("MESSAGE", "Action: Send key, Input Given"+inputparameters[1].toString());         
		           
	}
	
	catch(Exception e)
	{
		outputparameters.put("STATUS", "FAIL");
		outputparameters.put("MESSAGE", "Action:Send key, Input Given"+inputparameters[1].toString());
		
	}
	return outputparameters;
}
	
	// Clcik
	
	public static  Hashtable<String,Object>  click(Object[]inputparameters)
{
	
	try {
		
	
		String xpath=(String) inputparameters[0];
		
		WebElement click=driver.findElement(By.xpath(xpath));
		           click.click();
		           
		       	outputparameters.put("STATUS", "PASS");
				outputparameters.put("MESSAGE", "Action: Click, Input Given"+inputparameters[0].toString());         
	}
	
	 catch(Exception e)
	{
			outputparameters.put("STATUS", "FAIL");
			outputparameters.put("MESSAGE", "Action: Click, Input Given"+inputparameters[0].toString());
		 
	}
	
	return outputparameters;
		
}
	
	// DropDown //  Select class
	
		public static  Hashtable<String,Object>  select(Object[]inputparameters)
{
			
		try 
		{	
			String xpath=(String) inputparameters[0];
			String value=(String) inputparameters[1];
			
			Select sel=new Select(driver.findElement(By.xpath(xpath)));
			     sel.selectByVisibleText(value);
			     
			 	outputparameters.put("STATUS", "PASS");
				outputparameters.put("MESSAGE", "Action:Click, Input Given"+inputparameters[1].toString());
		}
		
			catch(Exception e)
		{
				outputparameters.put("STATUS", "FAIL");
				outputparameters.put("MESSAGE", "Action:Click, Input Given"+inputparameters[1].toString());
				
		}
		
		return outputparameters;
}
	
	//Alert POP UP
	
	public static  Hashtable<String,Object>  alertPopup(Object[]inputparameters)
{
	
  try {	
	      Alert alt=driver.switchTo().alert();	
		  System.out.println("POP UP WINDOW MSG"  +alt.getText());
		  alt.accept();
		  
		  
			outputparameters.put("STATUS", "PASS");
			outputparameters.put("MESSAGE", "Action:Alert pop up, Input Given");
	  }	
       
		catch(Exception e)
      {
			outputparameters.put("STATUS", "FAIL");
			outputparameters.put("MESSAGE", "Action: Alert pop up, Input Given");
			
      }
       
        return outputparameters;
}
	
	// Get text message
	
	public static  Hashtable<String,Object>  getTextmasg(Object[] inputparameters)
	{
		
	try {
		    String xpath=(String) inputparameters[0];
		    WebElement msg=driver.findElement(By.xpath(xpath));
		    System.out.println("Welcome to " +msg.getText());
		    
			outputparameters.put("STATUS", "PASS");
			outputparameters.put("MESSAGE", "Action: Gettext message, Input Given"+inputparameters[0].toString());
	    }
	
	catch(Exception e)
	{
		outputparameters.put("STATUS", "FAIL");
		outputparameters.put("MESSAGE", "Action: Get text message, Input Given"+inputparameters[0].toString());
	}
	
	return outputparameters;	
}
	
	  // Validation
	
	public static  Hashtable<String,Object>  validation(Object[] inputparameters)
{
		
	try {	
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		String xapth= (String) inputparameters[0];
		String String1=(String) inputparameters[1];
		
		
		
		WebElement web=driver.findElement(By.xpath(xapth));
		String String2=web.getText();
		
		if (String1.equalsIgnoreCase(String2))
		{
			System.out.println("Test Case Pass");
			
		}
		
		else 
		{
			
			System.out.println("Test Case Fail");
		}
		     outputparameters.put("STATUS", "PASS");
		     outputparameters.put("MESSAGE", "Action: Validation, Input Given"+inputparameters[1].toString());
	    }
	     catch(Exception e)
	
	   {
	    		outputparameters.put("STATUS", "FAIL");
	    		outputparameters.put("MESSAGE", "Action: Validation, Input Given"+inputparameters[1].toString());
		
	   }
	
	return outputparameters;
}
		//MOUSE MOVE OVER
		
		public static  Hashtable<String,Object>  mouseMoveOver(Object[]inputparameters)
		{
			
		try {	
			
			Actions act=new Actions(driver);
			String xpath=(String) inputparameters[0];
			WebElement move=driver.findElement(By.xpath(xpath));
			act.moveToElement(move).build().perform();
			
			outputparameters.put("STATUS", "PASS");
			outputparameters.put("MESSAGE", "Action: Mouse Move Over, Input Given:" +inputparameters[0].toString());
			
		   }
		   
		  catch(Exception e)
		
		  {
				outputparameters.put("STATUS", "FAIL");
				outputparameters.put("MESSAGE", "Action: Mouse Move Over, Input Given:" +inputparameters[0].toString());  
			   
		  }
		
		    return outputparameters;
		
		}
		
		
		//MOUSE DOUBLE CLICK
		
	   public static  Hashtable<String,Object>  mouseDoubleClick(Object[]inputparameters)
	   {
		   
	  try {
		   
		    Actions act=new Actions(driver);
			String xpath=(String) inputparameters[0];
			WebElement move=driver.findElement(By.xpath(xpath));
			act.moveToElement(move).doubleClick().build().perform();
			
			outputparameters.put("STATUS", "PASS");
			outputparameters.put("MESSAGE", "Action: Mouse Double CLick, Input Given:"+inputparameters[0].toString());
			
	      }	
	        catch(Exception e)
	        {
	        	outputparameters.put("STATUS", "FAIL");
	    		outputparameters.put("MESSAGE", "Action: Mouse Double Click, Input Given:"+inputparameters[0].toString());
	        }
			
	       return outputparameters;
	   }
	
	    
	   //MOUSE RIGHT CLICK
	
	   public static  Hashtable<String,Object>  mouseRightCLick(Object[]inputparameters)
	   {
		   
		 try {  
		    Actions act=new Actions(driver);
			String xpath=(String) inputparameters[0];
			WebElement move=driver.findElement(By.xpath(xpath));
			act.moveToElement(move).contextClick().build().perform();
	   
			outputparameters.put("STATUS", "PASS");
			outputparameters.put("MESSAGE", "Action: Mouse Right Click, Input Given:"+inputparameters[0].toString());
			
		    }
		   
		 catch(Exception e)
		 {
				outputparameters.put("STATUS", "FAIL");
				outputparameters.put("MESSAGE", "Action: Mouse Right Click, Input Given:"+inputparameters[0].toString());
		 }
		 
		 return outputparameters;
	   }
	
	       
	   
	   // Validation for wrong uname password
	   
	   public static  Hashtable<String,Object>  validationfail (Object[] inputparameters)
	   
 {
		   
	try {
		   Alert alt=driver.switchTo().alert();
		   
		   String erromsg=alt.getText();
		   alt.dismiss();
		   
		   if(erromsg.equals(alt))
		   {
			   System.out.println("Test case fail");
		   }
		   
		   else
		   {
			 System.out.println("Test case pass");  
			   
		   }
		   
			outputparameters.put("STATUS", "PASS");
	        outputparameters.put("MESSAGE", "Action: Validationfail, Input Given:" +inputparameters[0].toString());
	   }
	
	   catch(Exception e)   
	   {
			outputparameters.put("STATUS", "FAIL");
			outputparameters.put("MESSAGE", "Action: Validationfail, Input Given:" +inputparameters[0].toString());
	   }
	
	return outputparameters;
 }	   
		   
		   // Drag and Drop 
		 
		   public static  Hashtable<String,Object>  dragAndDropIframe(Object[]inputparameters)
		   {
			   
		 try {
			   
			 String xpath=(String) inputparameters[0];
			 WebElement frame=driver.findElement(By.xpath(xpath));
			 driver.switchTo().frame(frame);
			 
			 Actions act=new Actions(driver);
			 
			 String xpath1=(String) inputparameters[1];
			 String xpath2=(String) inputparameters[2];
			 WebElement drag=driver.findElement(By.xpath(xpath1));
			 WebElement drop=driver.findElement(By.xpath(xpath2));
			 act.moveToElement(drag).dragAndDrop(drag, drop).build().perform();
			 
				outputparameters.put("STATUS", "PASS");
				outputparameters.put("MESSAGE", "Action: Draganddrop, Input Given:"+inputparameters[2].toString());
			 
		 }   
			catch(Exception e)
		     {
				outputparameters.put("STATUS", "FAIL");
				outputparameters.put("MESSAGE", "Action: Draganddrop, Input Given:"+inputparameters[2].toString());
			 }
		 
		      return outputparameters;
		   }
		   
}	    
		






	
   
   
   

	
	
	
	
	
	

