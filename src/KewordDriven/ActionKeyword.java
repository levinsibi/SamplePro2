package KewordDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKeyword {

	WebDriver driver;
	
	public void Launch()
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\jars\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
	}
	public void enterUname()
	{
		driver.findElement(By.name("userName")).sendKeys("levis");
	}
	public void enterPwd()
	{
		driver.findElement(By.name("password")).sendKeys("levis");
	}
	public void clicklogin()
	{
		driver.findElement(By.name("login")).click();
	}
	public void Close()
	{
		driver.quit();
	}
}
