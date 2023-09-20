import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] numbers = {15, 12, 788, 1, -1, -778, 2, 0};
        int girilenSayi = 5;
        Arrays.sort(numbers);

        int enKucukYakin = numbers[0];
        int enBuyukYakin = numbers[numbers.length - 1];

        for (int i : numbers) {

            if (girilenSayi > i && enKucukYakin < i) {
                enKucukYakin = i;
            }
            if (girilenSayi < i && enBuyukYakin > i) {
                enBuyukYakin = i;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + enKucukYakin);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + enBuyukYakin);
    }
}
