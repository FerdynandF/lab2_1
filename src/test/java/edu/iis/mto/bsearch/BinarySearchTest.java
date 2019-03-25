package edu.iis.mto.bsearch;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

    private static final int ELEMENT = 3;
    private static final int ANOTHER_ELEMENT = 5;

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
        Assert.assertEquals(0,BinarySearch.search(ELEMENT, sequence).getPosition());
    }

    @Test
    public void elementOnLastPositionInSequence(){
        int[] sequence = {ELEMENT, ELEMENT+1, ANOTHER_ELEMENT};
        Assert.assertEquals(2,BinarySearch.search(ANOTHER_ELEMENT, sequence).getPosition());
    }

}
