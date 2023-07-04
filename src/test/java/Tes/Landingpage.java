package Tes;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Landingpage {
	public  WebDriver driver;

	public Landingpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(name="q")
	WebElement a;

	@FindBy(name="qaa")
	WebElement aa;
	
	public void fun() {
		a.sendKeys("sandesh", Keys.ENTER);
		aa.click();
	}
}
