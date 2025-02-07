package selenium_practises_regular;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		//to navigate to url /launch browser
		//driver.get("https://www.amazon.com/");
		driver.navigate().to("https://www.amazon.in");
		driver.manage().window().maximize();
		// to navidate to new URL 
		driver.navigate().to(new URL("https://www.flipkart.com/"));
		Thread.sleep(2000);
		//driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		driver.navigate().back();
	System.out.println("hi");
	Thread.sleep(2000);
	driver.navigate().forward();
	
	Thread.sleep(2000);
	driver.navigate().refresh();
		
		
	}

}
