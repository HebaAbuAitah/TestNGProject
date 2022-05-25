package TestTraingle;


import static TestTraingle.TriangleType.EQUILATERAL;
import static TestTraingle.TriangleType.ISOSCELES;
import static TestTraingle.TriangleType.NotTriangle;
import static TestTraingle.TriangleType.SCALENE;

import org.testng.annotations.Test;
import org.testng.Assert;



public class TraingleTestCases {
	@Test
	public void test1() {
	    final TriangleType type = Traingle.classify(5, 3, 4);
	    Assert.assertEquals(SCALENE, type);
	  }

	  @Test
	  public void test2() {
	    final TriangleType type = Traingle.classify(1, 3, 5);
	    Assert.assertEquals(NotTriangle, type);
	  }

	  @Test
	  public void test3() {
	    final TriangleType type = Traingle.classify(1, 4, 2);
	    Assert.assertEquals(NotTriangle, type);
	  }

	  @Test
	  public void test4() {
	    final TriangleType type = Traingle.classify(4, 1, 2);
	    Assert.assertEquals(NotTriangle, type);

	  }

	  @Test
	  public void test5() {
	    final TriangleType type = Traingle.classify(-2, 2, 2);
	    Assert.assertEquals(NotTriangle, type);
	  }

	  @Test
	  public void test6() {
	    final TriangleType type = Traingle.classify(2, -2, 2);
	    Assert.assertEquals(NotTriangle, type);
	  }

	  @Test
	  public void test7() {
	    final TriangleType type = Traingle.classify(2, 2, -2);
	    Assert.assertEquals(NotTriangle, type);
	  }

	  @Test
	  public void test8() {
	    final TriangleType type = Traingle.classify(1, 1, 1);
	    Assert.assertEquals(EQUILATERAL, type);
	  }

	  @Test
	  public void test9() {
	    final TriangleType type = Traingle.classify(3, 3, 4);
	    Assert.assertEquals(ISOSCELES, type);
	  }

	  @Test
	  public void test10() {
	    final TriangleType type = Traingle.classify(3, 4, 3);
	    Assert.assertEquals(ISOSCELES, type);
	  }

	  @Test
	  public void test11() {
	    final TriangleType type = Traingle.classify(4, 3, 3);
	    Assert.assertEquals(ISOSCELES, type);
	  }
	  @Test
	  public void test12() {
	    final TriangleType type = Traingle.classify(5, 2,2);
	    Assert.assertEquals(NotTriangle, type);
	  }
	  @Test
	  public void test13() {
	    final TriangleType type = Traingle.classify(5, 2,0);
	    Assert.assertEquals(NotTriangle, type);
	  }

}
