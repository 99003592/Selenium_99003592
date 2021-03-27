import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//   /html/body/div[1]/div[3]/div[1]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/input
//Facebook automation
public class Basic6 {
	public static void main(String[] args) throws Exception {
		System.out.println("welcome to selenium");
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\extracts\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/campaign/landing.php?&campaign_id=973072061&extra_1=s%7Cc%7C231348943369%7Ce%7Cfacebook%7C&placement=&creative=231348943369&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D973072061%26adgroupid%3D54006406691%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-297690534863%26loc_physical_ms%3D1007773%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIvavltZnQ7wIVVaaWCh2s1wUeEAAYASAAEgLY5_D_BwE");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/div[1]/input")).sendKeys("Abhi");
		Thread.sleep(100);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/input")).sendKeys("Ekka");
		Thread.sleep(100);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input")).sendKeys("Abhi@ltts.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div[2]/div/div/div[1]/form/div[1]/div[3]/div/div/div[1]/input")).sendKeys("Abhi@ltts.com");
		Thread.sleep(100);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div[2]/div/div/div[1]/form/div[1]/div[4]/div/div[1]/input")).sendKeys("helloworld");
		Thread.sleep(100);
		
		Select d= new Select(driver.findElement(By.id("day")));		
		d.selectByValue("5");
		
		Select m= new Select(driver.findElement(By.id("month")));
		m.selectByValue("7");
		
		Select y= new Select(driver.findElement(By.id("year")));
		y.selectByValue("1998");	
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input")).click();
		
	}
}

