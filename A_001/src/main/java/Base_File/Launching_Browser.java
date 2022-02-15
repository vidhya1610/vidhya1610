package Base_File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Launching_Browser {
	Properties pro;
	public WebDriver driver;
	public Launching_Browser() throws IOException {
		FileInputStream File=new FileInputStream("./Config\\Config.properties");
		pro=new Properties();
		pro.load(File);
	
	}
	public void Initialaization() {
		String Launching=pro.getProperty("browser");
		
		switch(Launching)
		{
		case "MSE":
		
			System.setProperty("webdriver.edge.driver","./Drivers/msedgedriver.exe");
			 driver=new EdgeDriver();
			 break;
		
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
			driver= new ChromeDriver();
			break;
		
		default :
			System.out.println("Check Your PropertyFile");	
		}
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to(pro.getProperty("url"));
		}
		
	}


