package Tes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class b {
	Landingpage l;

public WebDriver install() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\FDC\\Documents\\New folder\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
	 driver.get("https://www.google.com");

		 l=new Landingpage(driver);
		return driver;


	 
	
}
}