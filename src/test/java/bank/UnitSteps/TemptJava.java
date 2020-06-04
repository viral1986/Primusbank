package bank.UnitSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TemptJava implements TemptData
{

	public static void main(String[] args) 
	{

     System.setProperty("webdriver.gecko.driver", "E:\\BANK PROJECT MAVEN\\Primusbank\\src\\test\\resources\\DRIVERS\\geckodriver.exe");
	
    
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");
		driver.findElement(By.xpath("//*[@name='txtuId']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='txtPword']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='login']")).click();
		
		driver.findElement(By.xpath("//*[@src='images/Branches_but.jpg']")).click();
		Select sel=new Select(driver.findElement(By.xpath("//*[@id='lst_countryS']")));
		  sel.selectByVisibleText(country);
		
		  Select sel1=new Select(driver.findElement(By.xpath("//*[@id='lst_stateS']")));
		  sel1.selectByVisibleText(state);
		
		  Select sel2=new Select(driver.findElement(By.xpath("//*[@id='lst_cityS']")));
		  sel2.selectByVisibleText(city);
		
		
		driver.findElement(By.xpath("//*[@id='btn_search']")).click();
		
		

	}

}
