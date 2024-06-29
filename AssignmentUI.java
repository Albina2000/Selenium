import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//entering name
		driver.findElement(By.name("name")).sendKeys("Albina");
		//email
		driver.findElement(By.name("email")).sendKeys("albina.zamirbekova2000@gmail.com");
		//password
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("albina2000");
		//click checkbox
		driver.findElement(By.id("exampleCheck1")).click();
		
		// dropdown by select
		WebElement w = driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']"));
		
		Select dropdown = new Select(w);
		
		dropdown.selectByIndex(1);
		
		
		//click the radio button
		driver.findElement(By.id("inlineRadio1")).click();
		
		//date
		driver.findElement(By.name("bday")).click();
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("12302000");
		
		//submit
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		
		//Alert success
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
		
		
	}

}
