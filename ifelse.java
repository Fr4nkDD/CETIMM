
public class ifelse {
    public static void main(String[] args) {
      
        int nota1 = 10;
        int nota2 = 1;
        
        double media =  (nota1 + nota2)/2.0;
        
        if(media >= 6){
            System.out.println("Aprovado");
        }if (media >= 4){
          System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado");
        }
    }
}