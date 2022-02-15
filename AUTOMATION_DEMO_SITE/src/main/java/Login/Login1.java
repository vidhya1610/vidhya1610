package Login;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Browser.Base;

public class Login1 extends  Base{

@FindBy(xpath="//input[@id='txtUsername']")
   WebElement username;


@FindBy(xpath="//input[@id='txtPassword']")
WebElement password;


@FindBy(xpath="//input[@id='btnLogin']")
WebElement submitbtn;

	public Login1() throws IOException {
		super();
		PageFactory.initElements(driver,this);	
	}
	public void signin(String st, String str) throws Exception {
		username.sendKeys(st);
		Thread.sleep(3000);
		password.sendKeys(str);
		Thread.sleep(3000);
		submitbtn.click();
		
		
	}
	
	
	

}
