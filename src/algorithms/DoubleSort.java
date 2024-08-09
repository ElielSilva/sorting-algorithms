package algorithms;

public class DoubleSort {

    public static int[] Sort(int[] params) {

        for (int index = 0; index < params.length -1;index++) {
            for (int indexSecond = index + 1; indexSecond < params.length ;indexSecond++) {
                if (params[index] >= params[indexSecond]) {
                    int swap = params[index];
                    params[index] = params[indexSecond];
                    params[indexSecond]= swap;
                }
            }
        }
        return params;
    }
}
