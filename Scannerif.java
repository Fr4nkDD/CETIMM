import java.util.Scanner;

public class Scannerif {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2)/2.0;

        if(media > 6){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
    }
}
