import java.util.Scanner;
public class Main {
    static void pat(int n) {
        int lastnumber = n;
        while (lastnumber > 0) {
            lastnumber -= 5;
            System.out.print( lastnumber + " ");
        }
        while (lastnumber < n) {
            lastnumber += 5;
            System.out.print(lastnumber + " ");
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("N Sayısı: ");
        n = input.nextInt();
        System.out.print("Çıktısı: " + n + " ");
        pat(n);

    }
}
