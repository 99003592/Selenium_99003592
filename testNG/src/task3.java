import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class task3 {
	
	@BeforeClass
	public void m() {
		System.out.println("This is the beginning.");
	}
	
	@AfterClass
	public void n() {
		System.out.println("This is the end.");
	}
	
	@BeforeMethod
	public void x() {
		System.out.println("This is a pre stop");
	}
	
	@AfterMethod
	public void y() {
		System.out.println("This is a post stop");
	}
	
	@Test
	public void a() {
		System.out.println("A");
	}
	
	@Test
	public void b() {
		System.out.println("B");
	}
	
	@Test
	public void c() {
		System.out.println("C");
	}
}
