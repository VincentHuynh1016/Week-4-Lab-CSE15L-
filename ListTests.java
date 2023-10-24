import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;

public class ListTests {
    @Test
    public void test1(){
        List<String> input1 = new ArrayList<>();
        input1.add("apple");
        input1.add("dairy");

        List<String> input2 = new ArrayList<>();
        input2.add("cats");
        input2.add("bats");

        List<String> expected = new ArrayList<>();
        expected.add("apple");
        expected.add("bats");
        expected.add("cats");
        expected.add("dairy");

        List<String> output = ListExamples.merge(input1, input2);

        assertEquals(expected, output);

    }
}
