package testNG;

import org.testng.annotations.Test;

public class Group3 {
@Test(groups = {"smoke"})
public void h() {
	System.out.println("g belongs to smoke");
}
@Test(groups = {"funtional"})
public void i() {
	System.out.println("i belongs to funtional");
}
@Test(groups = {"integration"})
public void j() {
	System.out.println("j belongs to integration");
}
}
