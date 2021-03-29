import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class task7 {
	public static void main(String[] args) {
		System.out.println("welcome to selenium");
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\extracts\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Actions act = new Actions(driver);
		
		driver.get("https://www.seleniumeasy.com/test/table-pagination-demo.html");
		
		WebElement data = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[5]/td[1]"));
		String txt= data.getText();
		System.out.println(txt);
	}
}
