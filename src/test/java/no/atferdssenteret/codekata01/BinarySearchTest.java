package no.atferdssenteret.codekata01;

import org.junit.*;
import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void testIterativeChop() {
	testChop(new IterativeBinarySearch());
    }

    @Test
    public void testRecursiveChop() {
	testChop(new RecursiveBinarySearch());
    }

    private void testChop(BinarySearch binarySearch) {
	int[] a = { 1 };
	int[] b = { 1, 3, 5 };
	int[] c = { 1, 3, 5, 7 };

	assertEquals(-1, binarySearch.chop(3, new int[0]));
	assertEquals(-1, binarySearch.chop(3, a));
	assertEquals(0, binarySearch.chop(1, a));

	assertEquals(0, binarySearch.chop(1, b));
	assertEquals(1, binarySearch.chop(3, b));
	assertEquals(2, binarySearch.chop(5, b));
	assertEquals(-1, binarySearch.chop(0, b));
	assertEquals(-1, binarySearch.chop(2, b));
	assertEquals(-1, binarySearch.chop(4, b));
	assertEquals(-1, binarySearch.chop(6, b));

	assertEquals(0, binarySearch.chop(1, c));
	assertEquals(1, binarySearch.chop(3, c));
	assertEquals(2, binarySearch.chop(5, c));
	assertEquals(3, binarySearch.chop(7, c));
	assertEquals(-1, binarySearch.chop(0, c));
	assertEquals(-1, binarySearch.chop(2, c));
	assertEquals(-1, binarySearch.chop(4, c));
	assertEquals(-1, binarySearch.chop(6, c));
	assertEquals(-1, binarySearch.chop(8, c));
    }
}
