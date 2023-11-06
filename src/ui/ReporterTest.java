package ui;

import org.testng.Reporter;
import org.testng.annotations.Test;
@Test
public class ReporterTest {

	public void reporterTest1() {
		Reporter.log("this is test1",true);
	}
	public void reporterTest2() {
		Reporter.log("this is test2",true);
	}
	public void reporterTest3() {
		Reporter.log("this is test3",true);
	}
	public void reporterTest4() {
		Reporter.log("this is test4",true);
	}
}
