import java.util.Scanner;
public class main {
    public static int somar(int num1, int num2) {
        return num1 + num2;
    }
    public static int subtrair(int num1, int num2) {
        return num1 - num2;
    }
    public static double media(int num1, int num2) {
        return (num1 + num2) / 2.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();
        int resultado = somar(n1, n2);
        System.out.println("A soma é: " + resultado);
        int resultado1 = subtrair(n1, n2);
        System.out.println("A subtração é: " + resultado1);
        double resultado2 = media(n1, n2);
        System.out.println("A média é: " + resultado2);
        sc.close();
    }
}