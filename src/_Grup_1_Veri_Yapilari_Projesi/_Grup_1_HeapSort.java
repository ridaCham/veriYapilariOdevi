package _Grup_1_Veri_Yapilari_Projesi;

public class _Grup_1_HeapSort implements _Grup_1_IAlgorithma {

    static int n;
    Runtime bellek = Runtime.getRuntime();
    double startTime;
    double endTime;
    long freeMemory;

    static void hpf(int dizi[], int i) {

        int so = 2 * i;
        int sa = 2 * i + 1;
        int max = i;
        if (so < n && dizi[so] < dizi[max]) {
            max = so;
        }
        if (sa < n && dizi[sa] < dizi[max]) {
            max = sa;
        }
        if (max != i) {
            deyistir(dizi, i, max);
            hpf(dizi, max);
        }

    }

    static void deyistir(int[] dizi, int a, int max) {
        int gecici = dizi[a];
        dizi[a] = dizi[max];
        dizi[max] = gecici;
    }

    @Override
    public void sirala(int[] dizi, int boyut) {
        bellek.gc();
        startTime = System.nanoTime();

        n = boyut - 1;
        for (int i = n / 2; i >= 0; i--) {
            hpf(dizi, i);
        }
        for (int i = n; i >= 0; i--) {
            deyistir(dizi, 0, i);
            hpf(dizi, 0);
            n--;

        }
        freeMemory = bellek.totalMemory() - bellek.freeMemory();
        endTime = System.nanoTime();

    }

    @Override
    public double calismaSuresi() {
        return (endTime - startTime) / 1000000;
    }

    @Override
    public long hafizadaKaplananYer() {
        return (freeMemory) / 1000;
    }

}
