package week2.day1;

import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe") ;
		ChromeDriver drivers = new ChromeDriver();
		drivers.get("http://leafground.com/pages/Link.html");
		drivers.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		drivers.manage().window().maximize();
		//1.Goto Home Page
		drivers.findElementByXPath("(//a[@link='blue'])[1]").click();
		System.out.println("Title is:" +drivers.getTitle());
		drivers.findElementByXPath("(//img[@class='wp-categories-icon svg-image'])[3]").click();
		
	 System.out.println(drivers.findElementByLinkText("Find where am supposed to go without clicking me?").getAttribute("href"));
	 drivers.findElementByXPath("(//img[@class='wp-categories-icon svg-image'])[3]").click();
	//2.Find where am supposed to go without clicking me?
System.out.println(drivers.findElementByLinkText("How many links are available in this page?").getAttribute("href") );
String link = drivers.findElementByLinkText("Verify am I broken?").getAttribute("href");
		     String errorlink = " http://leafground.com/pages/error.html";
		     if(errorlink.equals(link))
		     {
		    	 System.out.println("link is broken");
		     }
		     else System.out.println("link is not broken");
		     drivers.findElementByXPath("(//a[text()='Go to Home Page'])[2]").click();
		     System.out.println(" button 2 and Title is:" +drivers.getTitle());
		 
		

	}

}
