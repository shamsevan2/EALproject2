package AmazonTestNG1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class basic {
	
  @Test
  public void f() {
	  System.out.println("This is test method annotation");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is BeforeMethod annotation");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is AfterMethod annotation");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is BeforeClass annotation");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is AfterClass annotation");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is BeforeTest annotation");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is AfterTest annotation");
  }
  
  @Test
  public void Test2() {
	  System.out.println("This is my Test2");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is Beforesuit annotation");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is AfterSuit annotation");
  }
  
  public void shams() {
	  System.out.println("This is normal method without any annotation");
	  
  }

}
