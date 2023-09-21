import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] hata = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while (right < 5) {
            System.out.print("Bir tahminde bulunun: ");
            selected = input.nextInt();
            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0 ila 100 arasında bir sayı girin.");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla yanlış sayı girdiniz: " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Artık yanlış sayı girerseniz hakkınızdan düşülecek.");
                }continue;
            }
            if (selected == number) {
                System.out.println("Tebrikler doğru tahminde bulundunuz: ");
                isWin = true;
                break;
            } else {
                System.out.println("Yanlış tahmin: ");
                if (selected < number) {
                    System.out.println("Daha yüksek bir sayı deneyin.");
                } else {
                    System.out.println("Daha küçük bir sayı deneyin.");
                }
                hata[right] = selected;
                right++;
                System.out.println("Kalan hak:" + (5 - right));
            }
        }
        if (!isWin) {
            System.out.println("Üzgünüz hakkınız kalmadı." + "Sayı: " + number);
            System.out.println("Tahminleriniz" + Arrays.toString(hata));
        }
    }
}
