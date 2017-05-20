package test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import library.FunctionLibrary;

public class FirstJunitTest {
	
	private static FunctionLibrary functionLibrary;
	private static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		functionLibrary = new FunctionLibrary(driver);
		driver = functionLibrary.openBrowser();
	}
	
	@Test
	public void test() {
		functionLibrary.navigate("http://www.seleniumhq.org/");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		functionLibrary.closeBrowser();
	}

}
