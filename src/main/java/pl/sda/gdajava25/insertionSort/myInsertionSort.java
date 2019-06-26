package pl.sda.gdajava25.insertionSort;

public class myInsertionSort {
    public static void sort(int[] array) {
        for (int j = 0; j < array.length; j++) { // * n (obiegów)
            for (int i = 0; i < array.length - 1 - j; i++) { // * n-1 (obiegów)
                if (array[i] < array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
        }
    }
}
