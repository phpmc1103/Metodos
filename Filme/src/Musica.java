import java.util.Scanner;

public class Musica {

    // Crie uma classe Musica com atributos titulo, artista,
    // anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir
    // a ficha técnica, avaliar a música e calcular a média de avaliações.

    String titulo;
    String artista;
    int anoDeLancamento;
    int numAvaliacoes;
    double somaDasAvaliacoes;
    Scanner scan = new Scanner(System.in);

    void fichaTecnica(){
        System.out.printf(""" 
                Nome da Música: %s
                Nome do Artista: %s
                Data de lançamento da música: %d
                """,titulo,artista,anoDeLancamento);
    }

    void avalia(){
        System.out.println("Qual nota você da para essa música?: ");
        int nota = scan.nextInt();
        somaDasAvaliacoes += nota;
        numAvaliacoes++;
        double media = somaDasAvaliacoes / numAvaliacoes;
        System.out.println("A média das notas dadas a essa musica é " + media);
    }

    }


