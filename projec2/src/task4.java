import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class task4 {
	public static void main(String[] args) {
		System.out.println("welcome to selenium");
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\extracts\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Actions act = new Actions(driver);
		
		driver.get("https://www.seleniumeasy.com/test/drag-drop-range-sliders-demo.html");
		
		act.dragAndDropBy(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/section/div[1]/div[1]/div/input")), 70, 0).perform();
	}
}
