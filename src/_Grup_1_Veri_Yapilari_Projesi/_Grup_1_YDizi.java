package _Grup_1_Veri_Yapilari_Projesi;

import java.util.Random;

public class _Grup_1_YDizi {

    Random r = new Random();

    public void diziOlustur(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            array[i] = n + r.nextInt() % n;
        }
    }

    public int[] siraliDizi(int[] array, int size) {
        int[] output = new int[size + 1];
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        int[] count = new int[max + 1];
        for (int i = 0; i < max; ++i) {
            count[i] = 0;
        }
        for (int i = 0; i < size; i++) {
            count[array[i]]++;
        }
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }
        for (int i = size - 1; i >= 0; i--) {
            output[count[array[i]] - 1] = array[i];
            count[array[i]]--;
        }

        for (int i = 0; i < size; i++) {
            array[i] = output[i];
        }

        return array;
    }

    public int[] tersSiraliDizi(int[] array, int size) {
        int[] output = new int[size + 1];
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        int[] count = new int[max + 1];
        for (int i = 0; i < max; ++i) {
            count[i] = 0;
        }
        for (int i = 0; i < size; i++) {
            count[array[i]]++;
        }
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }
        for (int i = size - 1; i >= 0; i--) {
            output[count[array[i]] - 1] = array[i];
            count[array[i]]--;
        }

        for (int i = 0; i < size; i++) {
            array[i] = output[size - i - 1];
        }

        return array;
    }

    public void yazdir(String algorithma, long hafiza, double sure) {

        System.out.println("-----------------------------------------------|");
        System.out.println("| " + algorithma + "     | " + hafiza + " KB |" + sure + " ms |");
    }

}
