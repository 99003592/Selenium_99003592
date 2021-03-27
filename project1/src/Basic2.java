import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic2 {
	public static void main(String[] args) throws Exception {
		System.out.println("welcome to selenium");
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\extracts\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		Thread.sleep(2000);
		
		//maximize window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//fullscreen window
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		
		driver.close();
	}
}

//Maximize and fullscreen operation