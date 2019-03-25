package edu.iis.mto.bsearch;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

    private static final int ELEMENT = 3;
    private static final int ANOTHER_ELEMENT = 10;

    @Test
    public void elementInSingleSequence() {
        int[] sequence = {ELEMENT};
        Assert.assertTrue(BinarySearch.search(ELEMENT, sequence).isFound());
    }

    @Test
    public void elementNotInSingleSequence() {
        int[] sequence = {ELEMENT};
        Assert.assertFalse(BinarySearch.search(ANOTHER_ELEMENT, sequence).isFound());
    }

    @Test
    public void elementOnFirstPositionInSequence() {
        int[] sequence = {ELEMENT, ANOTHER_ELEMENT};
        Assert.assertEquals(0, BinarySearch.search(ELEMENT, sequence).getPosition());
    }

    @Test
    public void elementOnLastPositionInSequence() {
        int[] sequence = {ELEMENT, ELEMENT + 1, ANOTHER_ELEMENT};
        Assert.assertEquals(2, BinarySearch.search(ANOTHER_ELEMENT, sequence).getPosition());
    }

    @Test
    public void elementOnMiddlePositionInSequence() {
        int[] sequence = {ELEMENT, ELEMENT + 1, ANOTHER_ELEMENT, ANOTHER_ELEMENT + 2, ANOTHER_ELEMENT + 4};
        Assert.assertEquals(sequence.length / 2, BinarySearch.search(ANOTHER_ELEMENT, sequence).getPosition());
    }

    @Test
    public void elementNotInSequence() {
        int[] sequence = {ELEMENT, ELEMENT + 1, ELEMENT + 2, ELEMENT + 3};
        Assert.assertEquals(-1, BinarySearch.search(ANOTHER_ELEMENT, sequence).getPosition());
    }

    @Test
    public void negativeElementInSequence() {
        int key = -2;
        int[] sequence = {key, key + 1, ELEMENT, ANOTHER_ELEMENT};
        Assert.assertTrue(BinarySearch.search(key, sequence).isFound());
        Assert.assertEquals(key, sequence[BinarySearch.search(key, sequence).getPosition()]);
    }

    @Test
    public void isFoundElementInSequence() {
        int[] sequence = {ELEMENT - 1, ELEMENT, ELEMENT + 1, ELEMENT + 3, ANOTHER_ELEMENT};
        Assert.assertTrue(BinarySearch.search(ELEMENT, sequence).isFound());
    }

    @Test(expected = IllegalArgumentException.class)
    public void searchInEmptySequence() {
        int[] sequence = {};
        BinarySearch.search(ELEMENT, sequence);
    }
}
