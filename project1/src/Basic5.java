import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Basic5 {
	public static void main(String[] args) throws Exception {
		System.out.println("welcome to selenium");
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\extracts\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Select dd= new Select(driver.findElement(By.id("select-demo")));
		dd.selectByVisibleText("Sunday");
		Thread.sleep(2000);
		dd.selectByValue("Friday");
		Thread.sleep(2000);
		dd.selectByIndex(3);
		
	}
}

//Dropdown selection operation
