import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class task {

	public static void main(String[] args) throws Exception {
		System.out.println("welcome to selenium");
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\extracts\\firefoxdriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='panel-body']/button[@class='btn btn-default']")).click();
		Thread.sleep(2000);
		
		//Javascript pop up accept
		driver.switchTo().alert().accept();
	}
}

// /html/body/div[2]/div/div[2]/div[1]/div[2]/button