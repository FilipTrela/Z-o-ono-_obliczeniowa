package pl.sda.gdajava25.selectionSort;

public class MySelectionSort {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int indeks = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[indeks]) {
                    indeks = j;
                }

            }
            int min = array[indeks];
            array[indeks] = array[i];
            array[i] = min;
        }
    }
}
