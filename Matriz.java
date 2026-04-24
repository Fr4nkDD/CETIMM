import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matriz = new int[3][3];


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                System.err.println("Gigite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
                }
            }
            for(int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++){
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
            sc.close();
        }
        
    }

