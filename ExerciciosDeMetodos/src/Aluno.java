//Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters
// para acessar e modificar esses atributos. Adicione um
// método calcularMedia que retorna a média das notas do aluno.
public class Aluno {
    private String nome;
    private double notas;

    private int numeroDeNotas = 0;
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setNotas(double notas){
        this.notas += notas;
        this.numeroDeNotas++;
    }
    public String getNome(){
        return nome;
    }
    public double getNotas(){
        return notas;
    }
    public void calcularMedia(){
      double  media = this.notas / numeroDeNotas;
        System.out.println("A Média das notas é: "+ media);
    }
}

