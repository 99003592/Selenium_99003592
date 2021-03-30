import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class task1 {
	
	@Test
	public void task1() throws Exception {
		System.out.println("Welcome to Selenium task1 ");
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\extracts\\firefoxdriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		driver.findElement(By.xpath("//div[@class='col-md-6 text-left']/div[1]/div[@class='panel-body']/button")).click();
		Thread.sleep(1000);	
		driver.switchTo().alert().accept();

	}
	
	@Test
	public void task2() throws Exception {
		System.out.println("Welcome to Selenium task2 ");
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\extracts\\firefoxdriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		driver.findElement(By.xpath("//div[@class='col-md-6 text-left']/div[2]/div[@class='panel-body']/button")).click();
		Thread.sleep(1000);	
		driver.switchTo().alert().accept();
		
	}
	
	@Test
	public void task3() throws Exception {
		System.out.println("Welcome to selenium task3");
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\extracts\\firefoxdriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		//Scrolling effect
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		driver.findElement(By.xpath("//div[@class=\"col-md-6 text-left\"]/div[3]/div[@class=\"panel-body\"]/button")).click();	
		Thread.sleep(2000);

		driver.switchTo().alert().sendKeys("Abhisar");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
	}		 
}
