import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.*;



class Checker implements StringChecker {
    public boolean checkString(String s) {
        return s.length() >= 5;
    }
}



public class ListTests {
    

    @Test 
    public void testFilter() {
        List<String> list = Arrays.asList("hi", "hello", "world", "!");
        List<String> expected = Arrays.asList("hello", "world");
        assertEquals(expected, ListExamples.filter(list, new Checker()));
    }


    @Test
    public void testMerge() {
        List<String> list1 = Arrays.asList("a", "b", "d");
        List<String> list2 = Arrays.asList("ab,","c", "e");
        List<String> expected = Arrays.asList("a", "ab","b", "c", "d","e");

        assertEquals(expected, ListExamples.merge(list1, list2));

    }
}
