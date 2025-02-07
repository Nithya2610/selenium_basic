package selenium_practises_regular;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods {

	public static void main(String[] args) {
	//to launch empty browser 
		WebDriver driver= new ChromeDriver();
		//to navigate to particular url
		driver.get("https://www.amazon.com/");
		
		//to fetch the url of application inthe console
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//****to get the source of application launched
		//String pagesource = driver.getPageSource();
//System.out.println(pagesource);
 driver.manage().window().maximize();
//driver.manage().window().minimize();
//driver.manage().window().fullscreen();
//Dimension size1 = driver.manage().window().getSize();
//System.out.println(size1);
//System.out.println(size1.getHeight());
//System.out.println(size1.getWidth());
// Dimension size2 = new Dimension(800, 800);
// driver.manage().window().setSize(size2);
//driver.manage().window().setPosition(new Point (600 ,500));

 //**************to fetch the position of browser launched***********-----------------
//Point post = driver.manage().window().getPosition();
//System.out.println(post.getX());
//System.out.println(post.getY());

driver.close();
 driver.quit();
	}

}
