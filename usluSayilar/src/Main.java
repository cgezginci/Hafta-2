import java.util.Scanner;
public class Main {

    static int expo(int number, int exp) {
        if ( exp == 1){
            return number;
        }

        return number * expo(number, exp-1);

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,exp;
        System.out.print("Sayı girin: ");
        number = input.nextInt();
        System.out.print("Üs Girin: ");
        exp = input.nextInt();
        int result = expo(number,exp);
        System.out.println(result);


    }
}
