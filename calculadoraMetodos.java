import java.util.Scanner;

public class calculadoraMetodos {

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static String dividir(double a, double b) {
        if (b == 0) {
            return "Erro: divisão por zero!";
        }
        return String.valueOf(a / b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Calculadora ===");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        System.out.print("Escolha uma operação: ");
        int opcao = sc.nextInt();

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        String resultado;

        if (opcao == 1) {
            resultado = String.valueOf(somar(num1, num2));
        } else if (opcao == 2) {
            resultado = String.valueOf(subtrair(num1, num2));
        } else if (opcao == 3) {
            resultado = String.valueOf(multiplicar(num1, num2));
        } else if (opcao == 4) {
            resultado = dividir(num1, num2);
        } else {
            resultado = "Opção inválida!";
        }

        System.out.println("Resultado: " + resultado);

        sc.close();
    }
}

    

