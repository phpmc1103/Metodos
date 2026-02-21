public class Carro {
    //Crie uma classe Carro com atributos modelo, ano, cor
    // e métodos para exibir a ficha técnica e calcular a idade do carro.

    String modelo;
    int ano;
    String cor;

    void fichaTecnica(){
        System.out.println("Modelo do carro: "+ modelo);
        System.out.println("Ano de Lançamento: "+ ano);
        System.out.println("Cor do carro: "+ cor);
    }

    void idadeCarro(){
        int idade = 2026 - ano;
        System.out.println("Idade do carro: "+idade+ " anos");
    }
}

