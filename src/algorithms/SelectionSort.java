package algorithms;

public class SelectionSort {

    public static int[] Sort(int[] params) {
        int listLength = params.length;

        for (int indexPrimary = 0; indexPrimary <= listLength - 2; indexPrimary++) {
            int indexMin = indexPrimary;
            for (int indexSecond = indexPrimary + 1; indexSecond < listLength; indexSecond++) {
                if (params[indexSecond] < params[indexMin]) {
                        indexMin = indexSecond;
                }
            }
            if (params[indexMin] < params[indexPrimary]) {
                int swap = params[indexPrimary];
                params[indexPrimary] = params[indexMin];
                params[indexMin] = swap;
            }
        }

        return params;
    }
}
