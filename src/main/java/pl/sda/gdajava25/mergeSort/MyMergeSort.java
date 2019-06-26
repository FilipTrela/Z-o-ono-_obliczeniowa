package pl.sda.gdajava25.mergeSort;

import java.util.Arrays;

public class MyMergeSort {
    public static int licznikOperacji = 0;

    public static void sort(int[] tablica) {
        licznikOperacji = 0;
        splitNMerge(tablica, 0, tablica.length - 1);
        System.out.println(licznikOperacji);
    }

    private static void splitNMerge(int[] tablica, int from, int to) {
        if (from == to) { // dotarliśmy do pojedynczego elementu
            return;
        }

        int middle = (from + to) / 2;

        splitNMerge(tablica, from, middle);
        splitNMerge(tablica, middle + 1, to);

        merge(tablica, from, middle, to);
    }

    private static void merge(int[] tablica, int from, int middle, int to) {
        int[] kopia = Arrays.copyOf(tablica, tablica.length);

        int indexLeft = from;
        int indexRight = middle + 1;

        int pozycjaWstawiania = from;

        while ((indexLeft <= middle) && (indexRight <= to)) {
            licznikOperacji++;
            if (kopia[indexLeft] < kopia[indexRight]) { // lewy jest wiekszy
                tablica[pozycjaWstawiania] = kopia[indexRight++];
            } else {
                tablica[pozycjaWstawiania] = kopia[indexLeft++];
            }
            pozycjaWstawiania++;
        }

        while (indexLeft <= middle) {
            tablica[pozycjaWstawiania++] = kopia[indexLeft++];
            licznikOperacji++;
        }

        while (indexRight <= to) {
            tablica[pozycjaWstawiania++] = kopia[indexRight++];
            licznikOperacji++;
        }
    }
}
