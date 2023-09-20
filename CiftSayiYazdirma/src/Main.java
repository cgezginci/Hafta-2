import java.util.Arrays;
public class Main {
    static boolean isFind(int[] arr, int value){
        for (int i : arr){
            if (i == value) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] number = {5,4,9,6,4,7,2,6,4,9};
        int[] even = new int[number.length];
        int startIndex = 0;
        for (int i = 0; i < number.length; i++){
            for (int j = 0; j < number.length; j++){
                if ((i != j) && (number[i] == number[j]) && (number[i] % 2 == 0)){
                    if (!isFind(even, number[i]) ){
                        even[startIndex++] = number[i];
                    }

                    break;
                }
            }
        }
        for (int value : even){
            if (value != 0){
                System.out.println(value);
            }
        }

    }
}
