package testNG;

import org.testng.annotations.Test;

public class Group1 {
@Test(groups = {"integration","adhoc"})
public void a() {
	System.out.println("A belongs to Integration and adhoc");
}
@Test(groups = {"functional"})
public void b() {
	System.out.println("B belongs to functional");
}
@Test(groups = {"smoke"})
public void c() {
	System.out.println("c belongs to smoke");
}
}
