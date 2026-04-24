import java.util.Scanner;

public class calculadoraAprimorada {

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
        int retorno;

        do {
            System.out.println("=== Calculadora ===");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");

            int opcao;
            do {
                System.out.print("Escolha uma operação: ");
                opcao = sc.nextInt();
            } while (opcao < 1 || opcao > 4);

            sc.nextLine(); // limpar o Enter do nextInt()

            String resultado;

            if (opcao == 1) {
                double total = 0;
                String entrada;

                System.out.println("Digite os números para somar.");
                System.out.println("Quando quiser ver o resultado, digite =");

                do {
                    System.out.print("Digite um número ou = : ");
                    entrada = sc.next();

                    if (!entrada.equals("=")) {
                        double numero = Double.parseDouble(entrada);
                        total = somar(total, numero);
                    }

                } while (!entrada.equals("="));

                resultado = String.valueOf(total);

            } else {
                System.out.print("Digite o primeiro número: ");
                double num1 = sc.nextDouble();

                System.out.print("Digite o segundo número: ");
                double num2 = sc.nextDouble();

                if (opcao == 2) {
                    resultado = String.valueOf(subtrair(num1, num2));
                } else if (opcao == 3) {
                    resultado = String.valueOf(multiplicar(num1, num2));
                } else {
                    resultado = dividir(num1, num2);
                }
            }

            System.out.println("Resultado: " + resultado);

            do {
                System.out.println("Deseja realizar outra operação? (1 - Sim, 0 - Não)");
                retorno = sc.nextInt();
            } while (retorno != 0 && retorno != 1);

        } while (retorno == 1);

        sc.close();
    }
}