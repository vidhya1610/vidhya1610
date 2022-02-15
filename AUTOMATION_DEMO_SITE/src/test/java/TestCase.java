import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Browser.Base;
import Login.Login1;


public class TestCase extends Base {
	public Login1 lp;

	public TestCase() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
@BeforeMethod
public void SetUp() throws IOException {
	
	initialisation();
	
	lp=new Login1();	
}
	@Test
	public void Test() throws Exception {
		lp.signin("Admin","admin123");	
	}
	
}
