import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FbLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		driver.findElement(By.id("menu-item-7128")).click();
		driver.findElement(By.id("menu-item-7131")).click();
		
		
		
	}

}
