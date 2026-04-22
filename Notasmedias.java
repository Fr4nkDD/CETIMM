import java.util.Scanner;

public class Notasmedias {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

    double[] notas = new double[8];

    // Entrada das 8 notas
    System.out.println("Digite as 8 notas anuais:");
    for (int i = 0; i < 8; i++) {
        System.out.print("Nota " + (i + 1) + ": ");
        notas[i] = sc.nextDouble();
    }

    // Cálculos
    double primeiroBim = (notas[0] + notas[1]) / 2;
    double segundoBim = (notas[2] + notas[3]) / 2;
    double primeiroSem = (primeiroBim + segundoBim) / 2;

    double terceiroBim = (notas[4] + notas[5]) / 2;
    double quartoBim = (notas[6] + notas[7]) / 2;
    double segundoSem = (terceiroBim + quartoBim) / 2;

    double mediaFinal = (primeiroSem + segundoSem) / 2;

    // Saída formatada
    System.out.println("\n===== RESULTADOS =====");
    System.out.println("1º Bimestre: " + primeiroBim);
    System.out.println("2º Bimestre: " + segundoBim);
    System.out.println("1º Semestre: " + primeiroSem);
    System.out.println("------------------------");
    System.out.println("3º Bimestre: " + terceiroBim);
    System.out.println("4º Bimestre: " + quartoBim);
    System.out.println("2º Semestre: " + segundoSem);
    System.out.println("------------------------");
    System.out.println("Média Final: " + mediaFinal);

    sc.close();
}

}





