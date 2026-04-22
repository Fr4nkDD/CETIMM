import java.util.Scanner;
    public class Media {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            double media = (n1 + n2) / 2;
            System.out.println(media);

            sc.close();
            
        }
    }
