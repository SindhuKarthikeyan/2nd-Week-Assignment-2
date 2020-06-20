package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
	     driver.get("http://leafground.com/pages/radio.html");
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     
	    //CLICK on buton
	     driver.findElementByXPath("//div[@id='first']//label[1]").click();
	     
	     
	     System.out.println("selected yes :" +driver.findElementByXPath("//div[@id='first']//label[1]").isSelected());
	     
	     //default selected button
	     
	     boolean button1 = driver.findElementByXPath("//label[@for='Unchecked']").isSelected();
	     if(button1==true)
	     {
	     System.out.println("Button1 is selected" );
	     }
	     else 
	    	 System.out.println("Button2 is selected"); 
	     
	     
	     
	     if(driver.findElementByXPath("(//input[@class='myradio'])[4]").isSelected()) {
	    	 
	    	 System.out.println(" selected age is : 20- 40yrs " );
	    	 
	     }
	     else {
	    	 driver.findElementByXPath("(//input[@class='myradio'])[4]").click();
	    	 System.out.println("selected using click");
	    	} 
	    
	}

}
