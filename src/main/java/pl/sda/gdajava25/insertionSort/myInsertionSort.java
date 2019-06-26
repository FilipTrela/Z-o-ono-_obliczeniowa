package pl.sda.gdajava25.insertionSort;

public class myInsertionSort {
    static int[] sort(int[] array) {
        for (int a : array) {
            int lastSorted = 0;
            for (int i = lastSorted; i == 0; i--) {
                if (array[i] > a) {
                    int tymczasowa = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tymczasowa;
                } else break;
            }
        }
        return array;
    }
}
