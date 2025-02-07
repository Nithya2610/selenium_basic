package selenium_practises_regular;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//we have taken xpath text function 
//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//driver.switchTo().alert().accept();
	
//driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//driver.switchTo().alert().accept();

driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
driver.switchTo().alert().accept();
	}
	

}
