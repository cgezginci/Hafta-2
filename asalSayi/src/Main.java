import java.util.Scanner;

public class Main {

    static int prime(int number, int i) {

        if (i == 1){
            return 1;
        }else {
            if (number % i == 0) {
                return 0;

            }else {
                return prime(number, i-1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Sayı Giriniz: ");
        number = input.nextInt();
        int result = prime(number, number / 2);

        if (result == 1){
            System.out.println(number + " Bir asal sayıdır.");
        }else {
            System.out.println(number + " Bir asal sayı değildir.");
        }

    }
}
