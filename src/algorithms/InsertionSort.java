package algorithms;

public class InsertionSort {

    public static int[] Sort(int[] params) {


        int indexActual = 1;

        while (indexActual < params.length) {
            int swap = params[indexActual];
            int indexMenor = indexActual;
            for (int i = indexActual; i != 0 ; i--) {
                if (swap <= params[i-1]) {
                    params[i] = params[i - 1];
                    indexMenor = i - 1;
                }
            }
            params[indexMenor] = swap;
            indexActual = indexActual + 1;
        }

        return params;
    }
}
