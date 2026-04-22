import java.util.Scanner;

public class Explicação {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n1, n2, soma;
      
      System.out.println("Digite o primeiro número:");
      n1 = sc.nextInt();
      System.out.println("Digite o segundo número:");
      n2 = sc.nextInt();

      soma = n1 + n2;
      double media = soma / 2.0;  // Correção aqui

      System.out.printf("A média é: %.2f%n", media);

      if (media >= 7) {
         System.out.println("Aprovado");
      } else {
         System.out.println("Reprovado");
      }

      sc.close();
   }
}