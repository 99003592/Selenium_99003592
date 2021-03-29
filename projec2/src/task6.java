import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class task6 {
	public static void main(String[] args) {
		System.out.println("welcome to selenium");
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\extracts\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Actions act = new Actions(driver);
		
		driver.get("https://emicalculator.net/");
		
		//Home loan amount
		act.dragAndDropBy(driver.findElement(By.xpath("/html/body/div/div/main/article/div[3]/div/div[1]/div[1]/div[2]/form/div/div[2]")), 200, 0).perform();
			
		//Interest Rate
		act.dragAndDropBy(driver.findElement(By.xpath("/html/body/div[1]/div/main/article/div[3]/div/div[1]/div[1]/div[2]/form/div/div[5]")), 150, 0).perform();
		
		//Loan tenure
		act.dragAndDropBy(driver.findElement(By.xpath("/html/body/div[1]/div/main/article/div[3]/div/div[1]/div[1]/div[2]/form/div/div[8]")), 50, 0).perform();
	}
}
