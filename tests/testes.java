import algorithms.DoubleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class testes {

    @Test
    public void t(){
        int[] expeted = new int[] {1,2,3,4,5,6,7,8,9};
        int[] data = new int[]{1,3,2,5,4,7,6,9,8};
        DoubleSort a = new DoubleSort();
        int[] receid = a.Sort(new int[]{1,3,2,5,4,7,6,9,8});
        Assertions.assertArrayEquals(expeted, receid);
    }
}
