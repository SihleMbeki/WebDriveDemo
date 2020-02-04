package testcases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(value=customListener.Listener.class)
public class TestCase1 {

	@Test
	public void doLogin() {
		System.out.println("user login");
	}
}
