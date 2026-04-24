public class parpositivomaior {
    public static void main(String[] args) {
        int numero1 = 75;
        int numero2 = 15;

        if(numero1 > 0 ){
            System.out.println("O número " + numero1 + " é positivo.");
        } else if (numero1 < 0) {
            System.out.println("O número " + numero1 + " é negativo.");
        }

        if(numero1 % 2 == 0){
            System.out.println("O número " + numero1 + " é par.");
        } else {
            System.out.println("O número " + numero1 + " é impar.");
        }

        if(numero1 > numero2){
            System.out.println("O número " + numero1 + " é maior que " + numero2);
        }else{
            System.out.println("O número " + numero2 + " é maior que " + numero1);
        }
    }
}

        