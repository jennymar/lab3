import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);

    int[] input2 = { 5, 2, 9};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 9, 2, 5 }, input2);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));

    int[] input2 = { 4, 5, 6 };
    assertArrayEquals(new int[]{ 6, 5, 4 }, ArrayExamples.reversed(input2));
  }


  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = { 5.0, 4.0, 3.0, 2.0, 1.0 };
    assertEquals( 3.5, ArrayExamples.averageWithoutLowest(input1), 0.0);

  }
}
