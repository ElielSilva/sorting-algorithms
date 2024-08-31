//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import algorithms.DoubleSort;
import algorithms.InsertionSort;
import algorithms.MergeSort;
import algorithms.SelectionSort;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //DoubleSort b = new DoubleSort();
        int[] a = new int[]{3,6,9,2,5,8,1,4,7};
        int[] result = MergeSort.Sort(a);
        System.out.println("aqui ");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + "");
        }
    }
}