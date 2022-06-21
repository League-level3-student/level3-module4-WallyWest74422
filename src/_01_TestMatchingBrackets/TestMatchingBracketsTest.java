package _01_TestMatchingBrackets;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class TestMatchingBracketsTest {

    @Test
    public void testMatchingBrackets() {
        assertTrue(TestMatchingBrackets.doBracketsMatch("{}"));
        assertTrue(TestMatchingBrackets.doBracketsMatch("{{}}"));
        assertTrue(TestMatchingBrackets.doBracketsMatch("{}{}{{}}"));
        assertFalse(TestMatchingBrackets.doBracketsMatch("{{}"));
        assertFalse(TestMatchingBrackets.doBracketsMatch("}{"));
    }
}