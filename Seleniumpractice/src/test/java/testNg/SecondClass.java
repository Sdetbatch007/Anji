package testNg;

import org.testng.annotations.Test;

public class SecondClass {
	
	@Test(priority = 1)
	public void method4() {
		System.out.println("this is a1 method");
	} 
	@Test(priority = 3)
	public void method2() {
		System.out.println("this is b2 method");
	}
	@Test(priority = 4)
	public void method3() {
		System.out.println("this is c3 method");
	}
	@Test(priority = 4 )
	public void method1() {
		System.out.println("this is d4 method");
	}
}
