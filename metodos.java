import java.util.Scanner;

public class metodos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double n3 = scanner.nextDouble();

        // Cálculo da soma
        double soma = n1 + n2 + n3;

        // Cálculo da média
        double media = soma / 3;

        // Saída
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        scanner.close();
    }
}