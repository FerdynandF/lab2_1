package edu.iis.mto.bsearch;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

    public static final int ELEMENT = 3;
    public static final int ANOTHER_ELEMENT = 5;

    @Test
    public void elementInSingleSequence(){
        int[] sequence = {ELEMENT};
        Assert.assertTrue(BinarySearch.search(ELEMENT, sequence).isFound());
    }

    @Test
    public void elementNotInSingleSequence(){
        int[] sequence = {ELEMENT};
        Assert.assertFalse(BinarySearch.search(ANOTHER_ELEMENT, sequence).isFound());
    }

}
