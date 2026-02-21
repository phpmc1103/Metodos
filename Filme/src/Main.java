import java.util.Scanner;

public class Main{
   public static void main() {
       Pessoa olaMundo = new Pessoa();
       Calculadora dobro = new Calculadora();
       Musica musica1 = new Musica();
       Carro carro1 = new Carro();
       Aluno aluno1 = new Aluno();

       //ALUNO
       aluno1.nome = "Pedro Henrique Pinzon Morais Coelho";
       aluno1.idade = 22;
       aluno1.informacoes();

       //CARRO
       carro1.ano = 2020;
       carro1.cor = "Branco";
       carro1.modelo = "Sandero";
       carro1.fichaTecnica();
       carro1.idadeCarro();
       //MUSICAS
       musica1.artista = "Rihanna";
       musica1.titulo = "Diamonds";
       musica1.anoDeLancamento = 2012;
       musica1.fichaTecnica();
       musica1.avalia();
       //OLAMUNDO
       olaMundo.oi();
       //DOBRO DO NÚMERO
       dobro.a();






    }
}