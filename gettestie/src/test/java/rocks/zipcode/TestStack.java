package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;
import java.util.logging.Logger;

public class TestStack {

    private static final Logger LOGGER = Logger.getLogger(TestStack.class.getName());

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....

    @Test
    public void stackTest(){
        Stack<Character> stack = new Stack<>();
        Character end = 'a';
        Character middle = 'b';
        Character first = 'c';
        stack.push(end);
        stack.push(middle);
        stack.push(first);
        assertEquals(first, stack.peek());
        assertEquals(first, stack.pop());
        assertEquals(middle, stack.peek());
        assertEquals(middle, stack.pop());
        assertEquals(end, stack.peek());
        assertEquals(end, stack.pop());
    }
}
