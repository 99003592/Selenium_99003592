import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class task3 {

	public static void main(String[] args) throws Exception {
		System.out.println("welcome to selenium");
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\extracts\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Actions act = new Actions(driver);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//Login 
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
		Thread.sleep(500);

		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		Thread.sleep(2000);
		
		//interfacing through dashboard	
		act.moveToElement(driver.findElement(By.linkText("Leave"))).build().perform();
		Thread.sleep(500);
				
		act.moveToElement(driver.findElement(By.linkText("Entitlements"))).perform();
		Thread.sleep(500);
		
		act.moveToElement(driver.findElement(By.linkText("My Entitlements"))).click().perform();
		Thread.sleep(500);
		
	}

}
