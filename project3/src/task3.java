import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class task3 {
	public static void main(String[] args) throws Exception {
		System.out.println("Welcome to selenium");
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\extracts\\firefoxdriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		Thread.sleep(500);
		
		//Entering into Larger frame
		WebElement fr1 = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		driver.switchTo().frame(fr1);
		
		//Entering into inner frame
		WebElement fr2 = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(fr2);
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Abhi");;
		
	}
}
