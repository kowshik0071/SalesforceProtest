package Test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A {
	WebDriver driver;
		
	  @BeforeSuite
	  public void f() {
		  	  System.setProperty("webdriver.chrome.driver","C:\\Users\\kowshik\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe"); 
		  	 WebDriver driver=new ChromeDriver();
		  	  driver.manage().window().maximize();	 
		  		}
		    @Test
		    public void T() throws InterruptedException{
		    	 driver.get("http://www.google.com/");
		    	 String title = driver.getTitle();	
		    	 System.out.println(title);
		    }
		    @AfterSuite
		    public void close() {
		    	 driver.close();
		    }
	}

