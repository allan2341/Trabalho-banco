package Model;


public class ContaCorrente extends Conta implements Tributavel {

    
    private double limite;

    private static final double TAXA_SAQUE = 0.05;
    private static final double TAXA_CONTA = 0.01;

   
    public ContaCorrente(
            String numero,
            Titular titular,
            double saldo,
            double limite
    ) {

        super(numero, titular, saldo);
        this.limite = limite;
    }

    
    @Override
    public void sacar(double valor) {

        
        if (valor <= 0) {
            throw new IllegalArgumentException(
                "O valor do saque deve ser maior que zero."
            );
        }

        double valorTaxa = valor * TAXA_SAQUE;
        double valorTotal = valor + valorTaxa;

        
        double saldoDisponivel = this.saldo + limite;

  
        if (valorTotal > saldoDisponivel) {
            throw new IllegalArgumentException(
                "Saldo insuficiente para realizar o saque."
            );
        }

        this.saldo -= valorTotal;

  
        System.out.println(
            "Saque de R$ " + valor + " realizado com sucesso."
        );

        System.out.println(
            "Taxa aplicada: R$ " + valorTaxa
        );

        System.out.println(
            "Valor total debitado: R$ " + valorTotal
        );

        System.out.println(
            "Novo saldo: R$ " + this.saldo
        );
    }

    @Override
    public double calcularTaxa() {

        return this.saldo * TAXA_CONTA;
    }

    
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}