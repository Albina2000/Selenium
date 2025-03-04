import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AssignmentWindowHandles1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		
		String parentId = it.next();
		String childId = it.next();
		
		driver.switchTo().window(childId);
		
		String childText = driver.findElement(By.xpath("//div/h3")).getText();
		System.out.println(childText);
		
		driver.switchTo().window(parentId);
		
		String parentText = driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText();
		System.out.println(parentText);
		
		driver.quit();
		

	}

}
