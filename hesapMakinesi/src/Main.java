import java.util.Scanner;

public class Main {

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Sonuç " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Sonuç " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Sonuç " + result);
        return result;
    }

    static int divided(int a, int b) {

        if (b == 0) {
            System.out.println("Bölen 0 olamaz.");
            return 0;
        }
        int result = a / b;
        System.out.println("Sonuç " + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Sonuç " + result);
        return result;
    }

    static int factorial(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }

    static int mod(int a, int b) {
        int result = a % b;
        System.out.println("Sonuç: " + result);
        return result;
    }

    static void rectangle(int a, int b) {
        int cevre = (2 * (a + b));
        int alan = a * b;
        System.out.println("Çevre: " + cevre);
        System.out.println("Alan: " + alan);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        int select;
        System.out.println(menu);
        while (true) {

            System.out.print("Bir işlem seçin: ");
            select = input.nextInt();

            if (select == 0) {
                break;
            }
            int a, b;
            switch (select) {
                case 1:
                    System.out.print("Bir sayı seçin: ");
                    a = input.nextInt();
                    System.out.print("İkinci sayı seçin: ");
                    b = input.nextInt();
                    sum(a, b);
                    break;
                case 2:
                    System.out.print("Bir sayı seçin: ");
                    a = input.nextInt();
                    System.out.print("İkinci sayı seçin: ");
                    b = input.nextInt();
                    minus(a, b);
                    break;
                case 3:
                    System.out.print("Bir sayı seçin: ");
                    a = input.nextInt();
                    System.out.print("İkinci sayı seçin: ");
                    b = input.nextInt();
                    times(a, b);
                    break;
                case 4:
                    System.out.print("Bir sayı seçin: ");
                    a = input.nextInt();
                    System.out.print("İkinci sayı seçin: ");
                    b = input.nextInt();
                    divided(a, b);
                    break;
                case 5:
                    System.out.print("Bir sayı seçin: ");
                    a = input.nextInt();
                    System.out.print("İkinci sayı seçin: ");
                    b = input.nextInt();
                    power(a, b);
                    break;
                case 6:
                    System.out.print("Bir sayı seçin: ");
                    a = input.nextInt();
                    System.out.println("Sonuç: " + factorial(a));
                    break;
                case 7:
                    System.out.print("Bir sayı seçin: ");
                    a = input.nextInt();
                    System.out.print("İkinci sayı seçin: ");
                    b = input.nextInt();
                    mod(a, b);
                    break;
                case 8:
                    System.out.print("Bir sayı seçin: ");
                    a = input.nextInt();
                    System.out.print("İkinci sayı seçin: ");
                    b = input.nextInt();
                    rectangle(a, b);
                    break;
                default:
                    System.out.println("Geçersiz işlem girdiniz. ");


            }
        }
        System.out.print("Güle Güle");
    }
}
