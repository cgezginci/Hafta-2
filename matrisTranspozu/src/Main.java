public class Main {
    public static void main(String[] args) {
        int[][] matris = {{1,2,3} , {4,5,6}};
        int[][] transpoze= new int[3][2];
        System.out.println("Matris: ");
        for (int i = 0; i <2; i++){
            for (int j = 0; j<3; j++){
                System.out.print(matris[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("------");
        System.out.println("Transpoze: ");
        for (int i = 0; i <3; i++){
            for (int j = 0; j<2; j++){
                transpoze[i][j] = matris[j][i];
                System.out.print(transpoze[i][j] + " ");
            }
            System.out.println();
        }
    }
}
