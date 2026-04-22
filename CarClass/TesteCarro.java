package CarClass;

public class TesteCarro {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2020;
        carro1.cor = "Prata";

        carro2.marca = "Honda";
        carro2.modelo = "Civic";
        carro2.ano = 2022;
        carro2.cor = "Preto";

        System.out.println("=== DADOS DO CARRO 1 ===");
        System.out.println("Marca: " + carro1.marca);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Ano: " + carro1.ano);
        System.out.println("Cor: " + carro1.cor);

        System.out.println();

        System.out.println("=== DADOS DO CARRO 2 ===");
        System.out.println("Marca: " + carro2.marca);
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Ano: " + carro2.ano);
        System.out.println("Cor: " + carro2.cor);
    }
}
