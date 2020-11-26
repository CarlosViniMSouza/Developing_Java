package Vetores;

public class matriz {
    public static void main(String[] args) {

        int matriz[][] = new int[2][2];

        for(int i = 1; i <=2; i++) {
            for(int j=1; j<=2; j++) {
                System.out.println("Sua matriz : " + matriz[i][j]);
            }
        }
    }
}
