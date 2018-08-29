package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	@BeforeTest
	public void before()
	{
		System.out.println("before test");
	}
  @Test
  public void f() {
	  
	  System.out.println("testing");
  }
}
