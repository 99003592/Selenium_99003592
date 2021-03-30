import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class task2 {
	WebDriver driver;
	
	@Test(priority = 1,description = "launching page", alwaysRun = true)
	public void launch() throws Exception {
		System.out.println("Welcome to Selenium launch");
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\extracts\\firefoxdriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(200);
	}
	
	@Test(priority = 2,description = "performing login", enabled = true, dependsOnMethods = "launch")
	public void login() {	
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");	
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	}
	
	@Test(priority = 3,description = "logging out", enabled = true, dependsOnMethods = "login")
	public void logout() throws Exception {
//		driver.findElement(By.xpath("//*[@id=\"welcome\"]")).click();
//		Thread.sleep(100);
		driver.findElement(By.linkText("Welcome")).click();
		Thread.sleep(200);
		driver.findElement(By.linkText("Logout")).click();
	}
}
