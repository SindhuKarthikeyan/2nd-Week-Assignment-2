package week2.day1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;



public class BondWithButtons {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe") ;
		ChromeDriver drivers = new ChromeDriver();
		drivers.get("http://leafground.com/pages/Button.html");
		drivers.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		drivers.manage().window().maximize();
		 drivers.findElementById("home").click();
		 System.out.println("Title is:" +drivers.getTitle());
	     drivers.findElementByXPath("(//img[@class='wp-categories-icon svg-image'])[2]").click();
		System.out.println(drivers.findElementById("position").getLocation());
		System.out.println(drivers.findElementById("color").getCssValue("background-color"));
		System.out.println(drivers.findElementById("size").getSize());
		
		
		
		
		
		
		
	}

}
