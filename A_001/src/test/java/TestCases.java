import java.io.IOException;


import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base_File.Launching_Browser;
import pomOfAutomation.DemoSite_Pom;

public class TestCases extends Launching_Browser {

	public DemoSite_Pom declare;
public TestCases() throws IOException {
		super();	
	}




@BeforeTest
public void launching() throws IOException
{
	Initialaization();
	declare=new DemoSite_Pom();
	PageFactory.initElements(driver,DemoSite_Pom.class);
	
}
@Test
public void edit(){
	DemoSite_Pom.firstname.sendKeys("xxxx");
	DemoSite_Pom.lastname.sendKeys("xxxx");
	DemoSite_Pom.email.sendKeys("zzzz@gmail.com");
}
@Test(dependsOnMethods = "edit")
public void radio() {
DemoSite_Pom.gender.click();	
}
@Test(dependsOnMethods = "radio")
public void checkbox() {
	DemoSite_Pom.hobbies.click();
}
@Test(dependsOnMethods = "checkbox")
public void select() {
	Select s=new Select(DemoSite_Pom.skills);
	s.selectByVisibleText("CSS");
}
@Test(dependsOnMethods = "select")
public void button() throws Exception {

	DemoSite_Pom.submitbtn.click();
}
}



