package  Model;

public class Main {

    public static void main(String[] args) {

        
        Titular joao = new Titular(
                "João Silva",
                "123.456.789-00",
                "(11) 98765-4321"
        );

        Titular maria = new Titular(
                "Maria Oliveira",
                "987.654.321-00",
                "(11) 12345-6789"
        );

       
        ContaCorrente contaCorrente = new ContaCorrente(
                "12345-6",
                joao,
                1000.00,
                500.00
        );

        ContaPoupanca contaPoupanca = new ContaPoupanca(
                "65432-1",
                maria,
                2000.00
        );

      
        System.out.println("=================================");
        System.out.println("DADOS INICIAIS DAS CONTAS");
        System.out.println("=================================");

        System.out.println("\nCONTA CORRENTE:");
        System.out.println(contaCorrente);

        System.out.println("\nCONTA POUPANÇA:");
        System.out.println(contaPoupanca);

    
        System.out.println("\n=================================");
        System.out.println("DEPÓSITO");
        System.out.println("=================================");

        contaCorrente.depositar(500.00);

      
        System.out.println("\n=================================");
        System.out.println("SAQUE");
        System.out.println("=================================");

        contaCorrente.sacar(200.00);

       
        System.out.println("\n=================================");
        System.out.println("TRANSFERÊNCIA");
        System.out.println("=================================");

        contaCorrente.transferir(
                300.00,
                contaPoupanca
        );

        System.out.println("\n=================================");
        System.out.println("RENDIMENTO DA POUPANÇA");
        System.out.println("=================================");

        contaPoupanca.render();


        System.out.println("\n=================================");
        System.out.println("DADOS FINAIS DAS CONTAS");
        System.out.println("=================================");

        System.out.println("\nCONTA CORRENTE:");
        System.out.println(contaCorrente);

        System.out.println("\nCONTA POUPANÇA:");
        System.out.println(contaPoupanca);
    }
}