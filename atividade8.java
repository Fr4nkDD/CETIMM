import java.util.Scanner;

public class atividade8 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int numero;
      System.out.println("Digite o número:");
      numero = sc.nextInt();
for (int i = 1; i <= 10; i++) {
         System.out.println(numero + " x " + i + " = " + (numero * i));
      }

      if (numero % 3 == 0) {
         System.out.println("Divisível por 3");
      } else {
         System.out.println("Não é divisível por 3");
      }

      sc.close();
   }
}