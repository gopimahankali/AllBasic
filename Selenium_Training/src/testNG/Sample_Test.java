package testNG;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class Sample_Test {
	@Test(invocationCount = 3, threadPoolSize = 3)
	public void sampleTest() {
		System.out.println("This is a sample test method.");
	}
	@Test
	public void anotherTest() {
		Reporter.log("This is another test method.");
	}

}
