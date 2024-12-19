package uniqueElement;

//Task 1. Removing negative values from the array

import java.util.LinkedHashSet;

class UniqueElements {
    public static int[] getUniqueElements(int[] a) {
         LinkedHashSet<Integer> uniqueSet = new LinkedHashSet<>();

         for (int num : a) {
            uniqueSet.add(num);
        }

         int[] resultArray = new int[uniqueSet.size()];
        int i = 0;
        for (int num : uniqueSet) {
            resultArray[i++] = num;
        }

        return resultArray;
    }
}
