package testNG;

import org.testng.annotations.Test;

public class Arguments {
@Test(priority = 1,invocationCount = 3)
public void loginpage() {
	System.out.println("login page has been executed");
}
@Test(priority = 2,dependsOnMethods = {("loginpage")})
public void homepage() {
	System.out.println("home page has been exceuted");
}
@Test(priority = 3,dependsOnMethods = {("loginpage"),("homepage")})
public void ProductPage() {
	System.out.println("product page has been exceuted");
}
@Test(priority = 4,enabled = false)
public void addToPage() {
	System.out.println(" addTopage has been exceuted");
		
	
}
}
