package Browser;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public  static WebDriver driver;
	public  static Properties pro;
	public Base() throws IOException{
		pro= new Properties();
		FileInputStream fis=new FileInputStream("./Configuration//Config.properties");
		pro.load(fis);
		
		
			}
	public static void initialisation(){
			String Launching=pro.getProperty("browserName");
			
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
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.navigate().to(pro.getProperty("url"));
			}
	}
