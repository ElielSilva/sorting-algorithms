package algorithms;

public class MergeSort {

    public static int[] merge(int[] listLeft, int[] listRight) {
        int listRightLength = listRight.length;
        int listLeftLength = listLeft.length;

        int[] resultMergeLists = new int[listLeftLength + listRightLength];

        int indexListControl = 0;
        int indexListleft = 0;
        int indexListRight = 0;

        while (indexListleft < listLeftLength && indexListRight < listRightLength) {
            if (listLeft[indexListleft] < listRight[indexListRight]) {
                resultMergeLists[indexListControl] = listLeft[indexListleft];
                indexListleft++;
            } else {
                resultMergeLists[indexListControl] = listRight[indexListRight];
                indexListRight++;
            }
            indexListControl++;
        }

        while (indexListleft < listLeftLength) {
            resultMergeLists[indexListControl] = listLeft[indexListleft];
            indexListleft++;
            indexListControl++;
        }
        while (indexListRight < listRightLength) {
            resultMergeLists[indexListControl] = listRight[indexListRight];
            indexListRight++;
            indexListControl++;
        }

        return resultMergeLists;
    }

    public static int[] Sort(int[] params) {
        int listLength = params.length;
        int listLengthMidium = params.length / 2;

        if (listLength < 2) {
            return params;
        }

        int[] listLeft = new int[ listLengthMidium ];
        int[] listRight = new int[ listLength - listLengthMidium];

        for (int i = 0; i < listLengthMidium; i++) {
            listLeft[i] = params[i];
        }
        for (int j = 0; j < listLength - listLengthMidium; j++) {
            listRight[j] = params[j + listLengthMidium];
        }

        int[] resultListLeft = Sort(listLeft);
        int[] resultListRight = Sort(listRight);

        return merge(resultListLeft, resultListRight);
    }
}
