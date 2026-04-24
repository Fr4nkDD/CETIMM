import java.util.Scanner;

public class calculadoraContinua {

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: divisão por zero!");
            return a; // mantém o valor atual
        }
        return a / b;
    }

    public static double calcular(double a, double b, String operador) {
        if (operador.equals("+")) {
            return somar(a, b);
        } else if (operador.equals("-")) {
            return subtrair(a, b);
        } else if (operador.equals("*")) {
            return multiplicar(a, b);
        } else if (operador.equals("/")) {
            return dividir(a, b);
        } else {
            System.out.println("Operador inválido!");
            return a;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int retorno;

        do {
            System.out.println("=== Calculadora ===");

            System.out.print("Digite o primeiro número: ");
            double resultado = sc.nextDouble();

            String operador;

            do {
                System.out.print("Digite a operação (+, -, *, /) ou = para mostrar o resultado: ");
                operador = sc.next();

                if (!operador.equals("=")) {
                    System.out.print("Digite o próximo número: ");
                    double numero = sc.nextDouble();

                    resultado = calcular(resultado, numero, operador);
                }

            } while (!operador.equals("="));

            System.out.println("Resultado: " + resultado);

            do {
                System.out.print("Deseja realizar outra operação? (1 - Sim, 0 - Não): ");
                retorno = sc.nextInt();
            } while (retorno != 0 && retorno != 1);

        } while (retorno == 1);

        sc.close();
    }
}