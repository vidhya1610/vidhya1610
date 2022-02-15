package pomOfAutomation;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import Base_File.Launching_Browser;

public class DemoSite_Pom extends Launching_Browser {

	public DemoSite_Pom() throws IOException {
		super();
		
	}

	@FindBy(xpath=("//input[@placeholder='First Name']"))
	public static WebElement firstname;
	
	@FindBy(xpath=("//input[@placeholder='Last Name']"))
    public static WebElement lastname;
	
	@FindBy(xpath=("//input[@type='email']"))
    public static  WebElement email;
	
	@FindBy(xpath=("//input[@value='FeMale']"))
    public static WebElement gender;
	

	@FindBy(xpath=("//input[@id='checkbox2']"))
    public static WebElement hobbies;
	
	@FindBy(xpath=("//select[@id='Skills']"))
    public static WebElement skills;
	
	@FindBy(xpath=("//button[@id='submitbtn']"))
    public static WebElement submitbtn;

	
	}