import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class task2 {
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
		WebElement ele = driver.findElement(By.linkText("Leave"));		
		act.moveToElement(ele).build().perform();
		
		WebElement apply = driver.findElement(By.linkText("Apply"));		
		act.moveToElement(apply).click().perform();
		
		//filling apply page
		Select dd = new Select(driver.findElement(By.xpath("//*[@id=\"applyleave_txtLeaveType\"]")));
		dd.selectByIndex(2);
		
		Select monthdd = new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")));
		monthdd.selectByIndex(3);
		Select yeardd = new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")));
		yeardd.selectByValue("2020");
		
		driver.findElement(By.linkText("10")).click();
		
	}
}
