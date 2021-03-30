import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class task1 {
	public static void main(String[] args) throws Exception {
		System.out.println("Welcome to selenium");
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
	}
}

