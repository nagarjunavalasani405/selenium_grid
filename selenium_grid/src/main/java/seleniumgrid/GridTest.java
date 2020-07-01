package seleniumgrid;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTest {
	
	 static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		 DesiredCapabilities capabilities =new DesiredCapabilities();
		 capabilities.setBrowserName("chrome");
		 capabilities.setPlatform(Platform.WINDOWS);
		 
		// ChromeOptions options = new ChromeOptions(); // we can use chromeoptions also
		 //options.merge(capabilities);
		 
		 String huburl = " http://192.168.43.22:4444/wd/hub";
		  
		 driver = new RemoteWebDriver(new URL(huburl), capabilities);
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 String tittle = driver.getTitle();
		 System.out.println(tittle);
		 
		 //java -jar selenium-server-standalone-3.4.0.jar -role hub.....> command for hub
		 
		 //java -Dwebdriver.chrome.driver=D:chromedriver.exe -jar selenium-server-standalone-3.141.0.jar -role node -hub http://192.168.43.22:4444/grid/register
		 
		 // command for node
		 
		
		
		
		

	}

}
