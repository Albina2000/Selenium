import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class SelIntroduction {

	public static void main(String[] args) {
		
		// We need to invoke the browser
		//Chrome Browsers --> Chrome Driver --> Methods ()
		// Firefox Browsers --> Firefox Driver --> methods()
		/// Firefox, Safari, Chrome browsers
		//          implements the WebDriver Interface!
		
		
		// chromeDriver.exe --> ChromeBrowser()
		// step to invoke the chrome driver
		// selenium Manager
		
		//System.setProperty("webdriver.chrome.driver", "/Users/albina/Documents/chromedriver");
		//WebDriver driver = new ChromeDriver();
		
		// Firefox launch
		//WebDriver driver = new FirefoxDriver();
		
		//Microsoft Edge
		WebDriver driver = new EdgeDriver();
		
		
		
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		//driver.quit();
		
		
		
		

	}

}
