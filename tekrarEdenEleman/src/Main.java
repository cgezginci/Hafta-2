import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
        Arrays.sort(dizi);
        for (int i = 0; i < dizi.length; i++) {
            int sayac = 0;
            for (int j = 0; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    sayac++;
                }
            }
            if (i == dizi.length - 1 || dizi[i] != dizi[i + 1]){
                System.out.println(dizi[i] + " sayısı " + sayac + " kere tekrar edildi.");
            }

        }
    }
}