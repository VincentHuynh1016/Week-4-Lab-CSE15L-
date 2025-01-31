import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverse(){
    int[] input1 = {1,2,3,4};
    int[] expected = {4,3,2,1};

    assertArrayEquals(expected, ArrayExamples.reversed(input1));
  }

  @Test
  public void testingReverse(){
    int[] input1 = {5,6,7,8};
    int[] expected = {8,7,6,5};

    assertArrayEquals(expected, ArrayExamples.reversed(input1));

  }

  @Test
  public void test(){
    double[] input1 = {1};
    double expected = 0;
    assertEquals(expected, ArrayExamples.averageWithoutLowest(input1), 0.0001);
  }

  @Test
  public void testaverageWithoutLowest4() {
    double[] input1 = { 1,1,2,3,4 };
    double output = 3;
    assertEquals(output, ArrayExamples.averageWithoutLowest(input1), 0.0001);
  }
 


}
