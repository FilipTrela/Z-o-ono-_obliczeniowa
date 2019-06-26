package pl.sda.gdajava25.countingSort;

public class CountingSort {
    public static void sort(int[] array, int maxNumber) {
        int[] counting = new int[maxNumber + 1];
        for (int i = 0; i < array.length; i++) {
            counting[array[i]]++;
        }
        int countingPointer = 0;
        for (int i = 0; i < counting.length; i++) {
            for (int j = 0; j < counting[i]; j++) {
                array[countingPointer++] = i;
            }
        }
    }
}
