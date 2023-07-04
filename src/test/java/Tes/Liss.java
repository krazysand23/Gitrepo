package Tes;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.qameta.allure.Attachment;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Liss extends b  {


@Test
public  void carry() throws Exception{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\FDC\\Documents\\New folder\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://einvoice1.gst.gov.in/");
	driver.findElement(By.id("btnLogin")).click();
	driver.findElement(By.id("txtUserName")).sendKeys("FDCPUNJAB");
	driver.findElement(By.id("txt_password")).sendKeys("Fdcpn@123");
	Thread.sleep(6000);
	driver.findElement(By.xpath("//button[@name='LoginButton']")).click();
	driver.findElement(By.linkText("OK")).click();
Thread.sleep(5000);

	
driver.findElement(By.xpath("(//span[@class='text-danger'])[1]")).click();

driver.findElement(By.cssSelector("li[class='panel panel-default active mb-0']:nth-child(9)")).click();
Thread.sleep(5000);	
JavascriptExecutor js = (JavascriptExecutor)driver;
WebElement a=driver.findElement(By.cssSelector("div[id='collapseNine'] li:nth-of-type(3)"));
js.executeScript("arguments[0].scrollIntoView();",a);
a.click();

	
}

	

}


