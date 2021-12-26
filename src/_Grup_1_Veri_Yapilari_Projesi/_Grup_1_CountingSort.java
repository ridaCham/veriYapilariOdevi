package _Grup_1_Veri_Yapilari_Projesi;

public class _Grup_1_CountingSort implements _Grup_1_IAlgorithma {

    Runtime bellek = Runtime.getRuntime();

    double baslamaZamani;
    double bitisZamani;
    long bosBellek;

    @Override
    public void sirala(int[] dizi, int boyut) {

        baslamaZamani = System.nanoTime();
        bellek.gc();
        int[] siraliDizi = new int[boyut + 1];

        int max = dizi[0];
        for (int i = 1; i < boyut; i++) {
            if (dizi[i] > max) {
                max = dizi[i];
            }
        }
        int[] sayac = new int[max + 1];
        for (int i = 0; i < max; ++i) {
            sayac[i] = 0;
        }
        for (int i = 0; i < boyut; i++) {
            sayac[dizi[i]]++;
        }
        for (int i = 1; i <= max; i++) {
            sayac[i] += sayac[i - 1];
        }

        for (int i = boyut - 1; i >= 0; i--) {
            siraliDizi[sayac[dizi[i]] - 1] = dizi[i];
            sayac[dizi[i]]--;
        }
        for (int i = 0; i < boyut; i++) {
            dizi[i] = siraliDizi[boyut - i - 1];
        }

        bitisZamani = System.nanoTime();
        bosBellek = bellek.totalMemory() - bellek.freeMemory();
    }

    @Override
    public double calismaSuresi() {
        return (bitisZamani - baslamaZamani) / 1000000;
    }

    @Override
    public long hafizadaKaplananYer() {
        return (bosBellek) / 1000;
    }

}
