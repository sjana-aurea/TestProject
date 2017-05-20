package library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionLibrary {
	
	private WebDriver driver;
	
	public FunctionLibrary(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebDriver openBrowser() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
	
	public void navigate(String url){
		driver.navigate().to(url);
	}
	
	public void closeBrowser(){
		driver.quit();
	}
	
	public String getTitle(){
		return driver.getTitle();
	}

}
