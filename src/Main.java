//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import algorithms.DoubleSort;
import algorithms.InsertionSort;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //DoubleSort b = new DoubleSort();
        int[] a = new int[]{1,3,2,4,5,6,8,7};
        int[] result = InsertionSort.Sort(a);
        System.out.println("aqui ");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + "");
        }
    }
}