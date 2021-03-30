import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Working with iframes
public class task2 {
	public static void main(String[] args) {
		System.out.println("Welcome to selenium");
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\extracts\\firefoxdriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.switchTo().frame("singleframe");
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Abhisar");		
	}
}

