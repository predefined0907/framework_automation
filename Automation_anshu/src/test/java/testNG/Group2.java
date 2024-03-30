package testNG;

import org.testng.annotations.Test;

public class Group2 {
@Test(groups = {"funtional"})
public void e() {
	System.out.println("e belongs to funtional");
}
@Test(groups = {"smoke"})
public void f() {
	System.out.println("f belongs to smoke");
}
@Test(groups = {"integration"})
public void g() {
	System.out.println("g belongs to integration");
}
}
