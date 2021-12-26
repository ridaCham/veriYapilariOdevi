package _Grup_1_Veri_Yapilari_Projesi;

public class _Grup_1_MainClass {

    public static void main(String[] args) {
        int[] diziboyutlari = {100, 1000, 50000, 500000, 2500000};
        _Grup_1_YDizi diz = new _Grup_1_YDizi();
        _Grup_1_IAlgorithma countingSort = new _Grup_1_CountingSort();
        _Grup_1_IAlgorithma heapSort = new _Grup_1_HeapSort();
        _Grup_1_IAlgorithma insertionSort = new _Grup_1_İnsertionSort();
        for (int i = 0; i < 5; i++) {
            int[] dizi = new int[diziboyutlari[i]];
            int[] dizi1 = new int[diziboyutlari[i]];
            int[] dizi2 = new int[diziboyutlari[i]];
            diz.diziOlustur(dizi, diziboyutlari[i]);
            System.arraycopy(dizi, 0, dizi1, 0, diziboyutlari[i]);
            System.arraycopy(dizi, 0, dizi2, 0, diziboyutlari[i]);
            System.out.println("karisik (Sirasiz) sekilde girilen " + diziboyutlari[i] + " boyutlu dizi analizi:");
            Runtime.getRuntime().gc();
            countingSort.sirala(dizi, diziboyutlari[i]);
            diz.yazdir("Conting Sort  ", countingSort.hafizadaKaplananYer(), countingSort.calismaSuresi());
            Runtime.getRuntime().gc();
            heapSort.sirala(dizi1, diziboyutlari[i]);
            diz.yazdir(" Heap Sort    ", heapSort.hafizadaKaplananYer(), heapSort.calismaSuresi());
            Runtime.getRuntime().gc();
            insertionSort.sirala(dizi2, diziboyutlari[i]);
            diz.yazdir("İnsertion Sort", insertionSort.hafizadaKaplananYer(), insertionSort.calismaSuresi());
            System.out.println("");

            System.out.println("Kucukten Buyuge sirali sekilde girilen " + diziboyutlari[i] + " boyutlu dizi analizi:");
            Runtime.getRuntime().gc();
            countingSort.sirala(diz.siraliDizi(dizi, diziboyutlari[i]), diziboyutlari[i]);
            diz.yazdir("Conting Sort  ", countingSort.hafizadaKaplananYer(), countingSort.calismaSuresi());
            Runtime.getRuntime().gc();
            heapSort.sirala(diz.siraliDizi(dizi, diziboyutlari[i]), diziboyutlari[i]);
            diz.yazdir(" Heap Sort    ", heapSort.hafizadaKaplananYer(), heapSort.calismaSuresi());
            Runtime.getRuntime().gc();
            insertionSort.sirala(diz.siraliDizi(dizi, diziboyutlari[i]), diziboyutlari[i]);
            diz.yazdir("İnsertion Sort", insertionSort.hafizadaKaplananYer(), insertionSort.calismaSuresi());
            System.out.println("");

            System.out.println("Buyukten Kucuge sirali sekilde girilen " + diziboyutlari[i] + " boyutlu dizi analizi:");
            Runtime.getRuntime().gc();
            countingSort.sirala(diz.tersSiraliDizi(dizi, diziboyutlari[i]), diziboyutlari[i]);
            diz.yazdir("Conting Sort  ", countingSort.hafizadaKaplananYer(), countingSort.calismaSuresi());
            Runtime.getRuntime().gc();
            heapSort.sirala(diz.tersSiraliDizi(dizi, diziboyutlari[i]), diziboyutlari[i]);
            diz.yazdir(" Heap Sort    ", heapSort.hafizadaKaplananYer(), heapSort.calismaSuresi());
            Runtime.getRuntime().gc();
            insertionSort.sirala(diz.tersSiraliDizi(dizi, diziboyutlari[i]), diziboyutlari[i]);
            diz.yazdir("İnsertion Sort", insertionSort.hafizadaKaplananYer(), insertionSort.calismaSuresi());
            System.out.println(diziboyutlari[i] + " boyutlu dizi analiz sonudur");
        }

    }
}
