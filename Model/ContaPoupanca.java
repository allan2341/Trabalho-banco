package Model;


public class ContaPoupanca extends Conta {

   
    private static final double RENDIMENTO_MENSAL = 0.01;

  
    public ContaPoupanca(
            String numero,
            Titular titular,
            double saldo
    ) {

        super(numero, titular, saldo);
    }

    public void render() {

        double rendimento = this.saldo * RENDIMENTO_MENSAL;

        this.saldo += rendimento;

        System.out.println(
            "Rendimento de R$ " + rendimento +
            " adicionado à conta."
        );

        System.out.println(
            "Novo saldo: R$ " + this.saldo
        );
    }

   
    @Override
    public void sacar(double valor) {

 
        if (valor <= 0) {
            throw new IllegalArgumentException(
                "O valor do saque deve ser maior que zero."
            );
        }

      
        if (valor > this.saldo) {
            throw new IllegalArgumentException(
                "Saldo insuficiente."
            );
        }

      
        this.saldo -= valor;

     
        System.out.println(
            "Saque de R$ " + valor +
            " realizado com sucesso."
        );

        System.out.println(
            "Novo saldo: R$ " + this.saldo
        );
    }
}