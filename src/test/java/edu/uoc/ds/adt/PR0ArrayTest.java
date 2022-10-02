package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR0ArrayTest {
    PR0Array pr0Array;

    @Before
    public void setUp() {
        this.pr0Array = new PR0Array();

        assertNotNull(this.pr0Array.getArray());
    }

    @After
    public void release() {
        this.pr0Array = null;
    }

    @org.junit.Test
    public void arrayTest() {
        int[] v = this.pr0Array.getArray();
        assertEquals(0, v[0]);
        assertEquals(2, v[1]);
        assertEquals(4, v[2]);
        assertEquals(6, v[3]);
        assertEquals(8, v[4]);
// ..
        assertEquals(98, v[49]);
    }
    @org.junit.Test
    public void searchArray() {
        int index = this.pr0Array.getIndexOf(41);
        assertEquals(-1, index);
        index = this.pr0Array.getIndexOf(14);
        assertEquals(7, index);
        index = this.pr0Array.getIndexOf(48);
        assertEquals(24, index);
    }
    @org.junit.Test
    public void binarySearchArray() {
        int index = this.pr0Array.binarySearch(41);
        assertEquals(-1, index);
        index = this.pr0Array.binarySearch(14);
        assertEquals(7, index);
    }
}
