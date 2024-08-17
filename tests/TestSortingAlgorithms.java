import algorithms.DoubleSort;
import algorithms.InsertionSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TestSortingAlgorithms {

    @Test
    public void testDoubleSort(){
        int[] expeteds = new int[] {1,2,3,4,5,6,7,8,9};
        int[] actualTestOrdered = DoubleSort.Sort(new int[]{1,2,3,4,5,6,7,8,9});
        int[] actualDecoded = DoubleSort.Sort(new int[]{3,6,9,2,5,8,1,4,7});
        int[] actualTestInverseOrdered = DoubleSort.Sort(new int[]{9,8,7,6,5,4,3,2,1});
        Assertions.assertArrayEquals(expeteds, actualTestOrdered);
        Assertions.assertArrayEquals(expeteds, actualDecoded);
        Assertions.assertArrayEquals(expeteds, actualTestInverseOrdered);
    }

    @Test
    public void testInsertionSort(){
        int[] expeteds = new int[] {1,2,3,4,5,6,7,8,9};
        int[] actualTestOrdered = InsertionSort.Sort(new int[]{1,2,3,4,5,6,7,8,9});
        int[] actualDecoded = InsertionSort.Sort(new int[]{3,6,9,2,5,8,1,4,7});
        int[] actualTestInverseOrdered = InsertionSort.Sort(new int[]{9,8,7,6,5,4,3,2,1});
        Assertions.assertArrayEquals(expeteds, actualTestOrdered);
        Assertions.assertArrayEquals(expeteds, actualDecoded);
        Assertions.assertArrayEquals(expeteds, actualTestInverseOrdered);
    }
}
