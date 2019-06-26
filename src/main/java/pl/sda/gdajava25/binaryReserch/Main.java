package pl.sda.gdajava25.binaryReserch;

public class Main {
    public static void main(String[] args) {
        int[] tablica = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binaryReserch(tablica, 10));
        System.out.println(recursiveBinarySerch(tablica, 10));
        System.out.println(recursiveBinarySerch(tablica, 1));
        System.out.println(recursiveBinarySerch(tablica, 5));
    }

    public static int binaryReserch(int[] array, int serched) {
        int koniec = array.length - 1;
        int poczatek = 0;
        do {
            if (array[(koniec + poczatek) / 2] == serched) {
                return (koniec + poczatek) / 2;
            } else if (array[(koniec + poczatek) / 2] > serched) {
                koniec = (koniec + poczatek) / 2;
            } else if (array[(koniec + poczatek) / 2] < serched) {
                poczatek = (koniec + poczatek) / 2 + 1;
            }
            if (koniec < poczatek) {
                return -1;
            }
        } while (true);
    }

    public static int recursiveBinarySerch(int[] array, int serched) {
        return recursiveBinarySerch(array, serched, array.length - 1, 0);
    }

    private static int recursiveBinarySerch(int[] array, int serched, int end, int beggining) {
        if (array[(beggining + end) / 2] == serched) {
            return (beggining+end) / 2;
        } else if (array[(beggining + end) / 2] > serched) {
           return recursiveBinarySerch(array,serched,(beggining+end)/2-1,beggining);
        } else if (array[(beggining+end) / 2] < serched) {
           return recursiveBinarySerch(array,serched,end,(beggining+end)/2+1);
        }
        if (end < beggining) {
            return -1;
        }
        return -1;
    }
}