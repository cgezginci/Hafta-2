import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int elemanSayisi;
        System.out.print("Kaç elemanlı bir dizi gireceksiniz? ");
        elemanSayisi = input.nextInt();
        int[] dizi = new int[elemanSayisi];
        System.out.println("Dizinin elemanlarını giriniz");

        for (int i = 0; i < elemanSayisi; i++){
            System.out.print((i + 1) + ". Elemanı: ");
                dizi[i] = input.nextInt();
        }
        System.out.println("Sıralama");

                Arrays.sort(dizi);
                System.out.println(Arrays.toString(dizi));




    }
}
