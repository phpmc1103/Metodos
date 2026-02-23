// Crie uma classe ContaBancaria com os seguintes atribut
// os: numeroConta (privado), saldo (privado) e titular (publico).
// Implemente métodos getters e setters para os atributos privados

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public String titular;

    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public int getnumeroConta(){
        return numeroConta;
    }
    public double getSaldo(){
        return saldo;
    }
}



