package resultTestNG;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;



public class Result_TestNG {
	private ResultClass ResultClass ;
	@BeforeMethod
	void setUp() throws Exception {
		this.ResultClass = new ResultClass();
	}
	@Test
	void test1() {
		Assert.assertEquals("Positive Result", this.ResultClass.TestResult(5, 3, 2));
	}
	@Test
	void test2() {
		Assert.assertEquals("Negative Result", this.ResultClass.TestResult(-2, 3, 1));
	}
	@Test
	void test3() {
		Assert.assertEquals("Negative Result", this.ResultClass.TestResult(7, 1, 3));
	}
	@Test
	void test4() {
		Assert.assertEquals("Positive Result", this.ResultClass.TestResult(-2, 1, 3));
	}
	@Test
	void test5() {
		Assert.assertEquals("0", this.ResultClass.TestResult(0, 3, 2));
	}
	@Test
	void test6() {
		Assert.assertEquals("0", this.ResultClass.TestResult(5, 3, 3));
	}
	void test7() {
		Assert.assertEquals("0", this.ResultClass.TestResult(-5, 3, 3));
	}
	
}
