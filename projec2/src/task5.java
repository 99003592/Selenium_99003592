import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


//ICICI BANK PAGE AUTOMATION
public class task5 {
	public static void main(String[] args) throws Exception {
		
		System.out.println("welcome to selenium");
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\extracts\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Actions act = new Actions(driver);
		
		//Select slt = new Select();
		//Page open
		driver.get("https://loan.icicibank.com/asset-portal-all/check-eligibility?loanType=al&WT.mc_id=Desk_OAPN_cms_cl_index_btn_applynow");
		
		//Type of loan
		driver.findElement(By.id("carRelbtn")).click();
		act.moveToElement(driver.findElement(By.linkText("New Car Loan"))).click().perform();
		
		//Mobile number
		driver.findElement(By.id("MOBILENUM")).sendKeys("8328858556");
		
		//Name
		driver.findElement(By.id("CUSTFIRSTNAME")).sendKeys("Abhisar");		
		driver.findElement(By.id("CUSTLASTNAME")).sendKeys("Ekka");
		Thread.sleep(500);
		
		//Location
		WebElement city = driver.findElement(By.id("CUSTCOMMUCITY"));
		city.sendKeys("MYS");
		Thread.sleep(500);
		city.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		city.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		
		
		//Residence type		
		driver.findElement(By.id("residancebtn")).click();
		act.moveToElement(driver.findElement(By.linkText("Owned"))).click().perform();
		
		//Current residence move
		driver.findElement(By.id("yrbtn")).click();
		act.moveToElement(driver.findElement(By.linkText("2020"))).click().perform();
		driver.findElement(By.id("mnthbtn")).click();
		act.moveToElement(driver.findElement(By.linkText("Mar"))).click().perform();
		
		//Birthday selection
		driver.findElement(By.id("DATEOFBIRTH")).sendKeys("05071998");
		
		//Specified dealer product		
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"DLR\"]/div/div[2]/label/span"))).click().perform();
		
		//Car cost calculation	
		WebElement carmod = driver.findElement(By.id("CAR_MODEL_NAME"));
		carmod.sendKeys("HYU");
		Thread.sleep(500);
		carmod.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		carmod.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		
		WebElement citymod = driver.findElement(By.id("CITY_NAME"));
		citymod.sendKeys("BANGALOR");
		Thread.sleep(500);
		citymod.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		citymod.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		
		//Work Information
		driver.findElement(By.id("selSalbtn")).click();
		act.moveToElement(driver.findElement(By.linkText("Salaried"))).click().perform();
		

		WebElement company = driver.findElement(By.id("EMPLOYERNAME"));
		company.sendKeys("LARSEN AND");
		Thread.sleep(500);
		company.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		company.sendKeys(Keys.ENTER);
		
		
		
		driver.findElement(By.xpath("//*[@id='SelfEB']/*[@id='JDCE']/div/*[@class='col-xs-6']/div/*[@id='yrbtn']")).click();
		act.moveToElement(driver.findElement(By.linkText("2020"))).click().perform();		
		
		driver.findElement(By.xpath("//*[@id='SelfEB']/*[@id='JDCE']/div/div[@id='month-div_we']/div/button[@id='mnthbtn']")).click();
		act.moveToElement(driver.findElement(By.linkText("Mar"))).click().perform();		
		
		driver.findElement(By.xpath("//*[@id='TWE']/div/div/div/button[@id='twbtn']")).click();
		act.moveToElement(driver.findElement(By.linkText("2"))).click().perform();
		
		
		driver.findElement(By.id("MONTHLY_NET_HM_SAL")).sendKeys("28000");	
		
		driver.findElement(By.id("GROSS_FIXED_M_SAL")).sendKeys("30000");
				
		//Others
		driver.findElement(By.id("TOTAL_CURR_EMI_PAID")).sendKeys("15000");
				
	}
}
