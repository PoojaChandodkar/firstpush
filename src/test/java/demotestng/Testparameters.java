package demotestng;

import org.testng.annotations.Test;

public class Testparameters {
	@Test(enabled=false)
public void m1() {
	System.out.println("I am not enabled");
}
	@Test
public void m2() {
	System.out.println("I am enabled");
}
}
