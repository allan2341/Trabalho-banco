package Model;


// Classe base para Conta Corrente e Conta Poupança
public abstract class Conta {

    private String numero;
    Titular titular;
    protected double saldo;

    public Conta(String numero, Titular titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor de depósito não pode ser negativo.");
        }

        this.saldo += valor;

        System.out.println("Depósito de R$ " + valor + " realizado.");
    }

    public abstract void sacar(double valor);

    public void transferir(double valor, Conta destino) {
        this.sacar(valor);
        destino.depositar(valor);
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: R$ " + this.saldo);
    }

    public String getNumero() {
        return numero;
    }

    public Titular getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero='" + numero + '\'' +
                ", titular=" + titular +
                ", saldo=" + saldo +
                '}';
    }
}
