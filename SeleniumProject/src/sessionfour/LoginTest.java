package sessionfour;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class LoginTest {
	
	@BeforeClass
	public static void initTestConfig(){
		System.out.println("inital properties");
	}
	
	@AfterClass
	public static void closeTestConnections(){
		System.out.println("Closing test connections");
	}
	@Before
	public void openBrowser(){
		System.out.println("openBrowser");
	}
	
	@After
	public void closeBrowser(){
		System.out.println("openBrowser");
	}
	
	@Ignore
	@Test
	public void testLoginScreen(){
		System.out.println("Testing login screen");
	}
	
	@Test
	public void testPassword(){
		System.out.println("Testing password");
	}

}
