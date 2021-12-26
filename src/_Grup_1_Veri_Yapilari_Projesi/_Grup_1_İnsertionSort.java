package _Grup_1_Veri_Yapilari_Projesi;

public class _Grup_1_İnsertionSort implements _Grup_1_IAlgorithma {

    Runtime bellek = Runtime.getRuntime();
    double baslamaZamani;
    double bitisZamani;
    long bosBellek;

    @Override
    public void sirala(int[] dizi, int boyut) {
        baslamaZamani = System.nanoTime();
        bellek.gc();
        for (int j = 1; j < boyut; j++) {
            int current = dizi[j];
            int i = j - 1;
            while ((i > -1) && (dizi[i] > current)) {
                dizi[i + 1] = dizi[i];
                i--;
            }
            dizi[i + 1] = current;
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
