import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int n1 = sc.nextInt();

        System.out.println("Digite o segundo número:");
        int n2 = sc.nextInt();

        int soma = n1 + n2;

        System.out.println("A soma é: " + soma);

        int dobro = soma * 2;

        System.out.println("O dobro da soma é: " + dobro);

        sc.close();
    }
}