package Replace;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;

public class ReplaseSequenceTestGN {
   private ReplaceSeq ReplaceSeq;
  @BeforeMethod
  
	  void setUp() throws Exception {
			this.ReplaceSeq = new ReplaceSeq();
		}
  @Test
	void test1() {
	  Assert.assertEquals("My Name is Heba", this.ReplaceSeq.collapseWhitespace("My Name is  Heba"));
	}
	@Test
	void test2() {
		Assert.assertEquals("My Name is Heba",this.ReplaceSeq.collapseWhitespace("My  Name is    Heba"));
	}
	@Test
	void test3() {
		Assert.assertEquals("My Name is Heba",this.ReplaceSeq.collapseWhitespace("My Name is  Heba"));
	}
	@Test
	void test4() {
		Assert.assertEquals("", this.ReplaceSeq.collapseWhitespace(""));
	}
	@Test
	void test5() {
		Assert.assertEquals("My Name is Heba", this.ReplaceSeq.collapseWhitespace("My Name is Heba"));
	}
	@Test
	void test6() {
		Assert.assertEquals(" Heba", this.ReplaceSeq.collapseWhitespace("  Heba"));
	}
	@Test
	void test7() {
		Assert.assertEquals(" My Name is Heba ", this.ReplaceSeq.collapseWhitespace("  My Name is  Heba   "));
	}
	@Test
	void test8() {
		Assert.assertEquals(" ", this.ReplaceSeq.collapseWhitespace("  "));
	}
  }

