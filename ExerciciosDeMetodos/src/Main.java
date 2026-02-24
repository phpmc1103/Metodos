public class Main{
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria();
        IdadePessoa pessoa1 = new IdadePessoa();
        Produto produto1 = new Produto();
        Aluno aluno1 = new Aluno();
        Livro livro1 = new Livro();
        PulaLinha pulalinha1 = new PulaLinha();

        pulalinha1.pulaLinha();

        livro1.setTitulo("O conde de monte cristo");
        livro1.setAutor("Alexandre Dumas");
        livro1.exibirDetalhes();

        pulalinha1.pulaLinha();

        aluno1.setNome("Pedro Henrique");
        aluno1.setNotas(10);
        aluno1.setNotas(9);
        aluno1.setNotas(6);
        System.out.println("Nome do Aluno: "+ aluno1.getNome());
        aluno1.calcularMedia();

        pulalinha1.pulaLinha();

        produto1.setNome("Beyblade");
        produto1.setPreco(276);
        produto1.setDesconto(71);
        produto1.aplicarDesconto();

        pulalinha1.pulaLinha();

        conta1.setNumeroConta(27);
        conta1.setSaldo(1000);
        System.out.println("O numero da conta é: " + conta1.getnumeroConta());
        System.out.println("O saldo da conta é: " + conta1.getSaldo() + " R$");

        pulalinha1.pulaLinha();

        pessoa1.setNome("Pedro");
        pessoa1.setIdade(7);
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
        pessoa1.verificarIdade();
    }
}