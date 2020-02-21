package rocks.zipcode;

import org.junit.Test;

import java.util.*;
import java.util.logging.Logger;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOGGER = Logger.getLogger(AppTest.class.getName());
    /**
     * Rigorous Test.
     */
    @Test
    public void testApp() {
        assertTrue(true);
    }

    @Test
    public void testHashSet(){
        HashSet<Integer> test = new HashSet<>();
        assertTrue(test.isEmpty());
        test.add(5);
        assertTrue(test.contains(5));
        assertFalse(test.add(5));
    }

    @Test
    public void testArrayList(){
        ArrayList<Integer> test = new ArrayList<>();
        assertEquals(0, test.size());
        test.add(1);
        test.add(2);
        test.add(1);
        test.add(3);
        assertEquals(2, test.lastIndexOf(1));
        test.remove(3);
        assertFalse(test.contains(3));
    }

    @Test
    public void testHashMap(){
        HashMap<Character, Integer> test = new HashMap<>();
        assertTrue(test.isEmpty());
        Integer a = 1;
        Integer b = 2;
        test.put('A', a);
        assertEquals(a, test.get('A'));
        assertTrue(test.containsKey('A'));
        assertTrue(test.containsValue(a));
        assertEquals(1, test.size());
        test.put('A', b);
        assertFalse(test.containsValue(a));
    }

    @Test
    public void testLinkedList(){
        LinkedList<Integer> testLL = new LinkedList<>();
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 4;
        testLL.add(a);
        testLL.add(b);
        testLL.add(c);
        testLL.add(2, d);
        assertEquals(c, testLL.get(3));
        assertEquals(a, testLL.pop());
    }

    @Test
    public void testArrayDeque(){
        ArrayDeque<Integer> testAD = new ArrayDeque<>();
        assertTrue(testAD.isEmpty());
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        testAD.add(a);
        assertTrue(testAD.contains(a));
        testAD.add(b);
        testAD.add(c);
        assertEquals(3, testAD.size());
        assertEquals(a, testAD.pop());
    }

    @Test
    public void testVector(){
        Vector<Integer> vector = new Vector<>();
        assertTrue(vector.isEmpty());
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        vector.add(a);
        assertEquals(a, vector.get(0));
        vector.add(b);
        vector.add(c);
        assertEquals(10, vector.capacity());
    }

    @Test
    public void testTreeMap(){
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "val");
        map.put(2, "val");
        map.put(1, "val");
        map.put(5, "val");
        map.put(4, "val");

        assertEquals("[1, 2, 3, 4, 5]", map.keySet().toString());
    }

    @Test
    public void testIteratorAndTreeSet(){
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("First");
        treeSet.add("Second");
        treeSet.add("Third");
        Iterator<String> itr = treeSet.iterator();
        while (itr.hasNext()) {
            LOGGER.info("\n" + itr.next());
        }
    }

    @Test
    public void testPriorityQueue(){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(20);
        priorityQueue.add(15);
        priorityQueue.add(10);
        Integer a = 10;
        Integer b = 15;
        Integer c = 20;

        assertEquals(a, priorityQueue.poll());
        assertEquals(b, priorityQueue.poll());
        assertEquals(c, priorityQueue.poll());
    }

    @Test
    public void testComparable(){
        Person steve = new Person("Steve", 1992);
        Person bob = new Person("Bob", 1990);
        Person chris = new Person("Chris", 1989);
        Person giles = new Person("Giles", 1988);

        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(steve);
        personArrayList.add(chris);
        personArrayList.add(giles);
        personArrayList.add(bob);

        Collections.sort(personArrayList);

        assertEquals(giles, personArrayList.get(0));
        assertEquals(chris, personArrayList.get(1));
        assertEquals(bob, personArrayList.get(2));
        assertEquals(steve, personArrayList.get(3));
    }
}
