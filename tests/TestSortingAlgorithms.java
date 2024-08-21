import algorithms.DoubleSort;
import algorithms.InsertionSort;
import algorithms.SelectionSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSortingAlgorithms {

    @Test
    public void testDoubleSort(){
        int[] expected = new int[] {1,2,3,4,5,6,7,8,9};
        int[] actualTestOrdered = DoubleSort.Sort(new int[]{1,2,3,4,5,6,7,8,9});
        int[] actualDecoded = DoubleSort.Sort(new int[]{3,6,9,2,5,8,1,4,7});
        int[] actualTestInverseOrdered = DoubleSort.Sort(new int[]{9,8,7,6,5,4,3,2,1});
        Assertions.assertArrayEquals(expected, actualTestOrdered);
        Assertions.assertArrayEquals(expected, actualDecoded);
        Assertions.assertArrayEquals(expected, actualTestInverseOrdered);
    }

    @Test
    public void testInsertionSort(){
        int[] expected = new int[] {1,2,3,4,5,6,7,8,9};
        int[] actualTestOrdered = InsertionSort.Sort(new int[]{1,2,3,4,5,6,7,8,9});
        int[] actualDecoded = InsertionSort.Sort(new int[]{3,6,9,2,5,8,1,4,7});
        int[] actualTestInverseOrdered = InsertionSort.Sort(new int[]{9,8,7,6,5,4,3,2,1});
        Assertions.assertArrayEquals(expected, actualTestOrdered);
        Assertions.assertArrayEquals(expected, actualDecoded);
        Assertions.assertArrayEquals(expected, actualTestInverseOrdered);
    }

    @Test
    public void testSeletionSort(){
        int[] expected = new int[] {1,2,3,4,5,6,7,8,9};
        int[] actualTestOrdered = SelectionSort.Sort(new int[]{1,2,3,4,5,6,7,8,9});
        int[] actualDecoded = SelectionSort.Sort(new int[]{3,6,9,2,5,8,1,4,7});
        int[] actualTestInverseOrdered = SelectionSort.Sort(new int[]{9,8,7,6,5,4,3,2,1});
        Assertions.assertArrayEquals(expected, actualTestOrdered);
        Assertions.assertArrayEquals(expected, actualDecoded);
        Assertions.assertArrayEquals(expected, actualTestInverseOrdered);
    }
}
