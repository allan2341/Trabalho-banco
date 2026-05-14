package Model;


public class App {

    public static void main(String[] args) {

        Titular joao = new Titular(
                "João",
                "123",
                "99999-9999"
        );

        Titular maria = new Titular(
                "Maria",
                "456",
                "88888-8888"
        );

        ContaCorrente cc = new ContaCorrente(
                "1",
                joao,
                1000.0,
                500.0
        );

        ContaPoupanca cp = new ContaPoupanca(
                "2",
                maria,
                2000.0
        );

        cc.depositar(500.0);

        cc.sacar(200.0);

        cc.transferir(300.0, cp);

        cp.render();

        System.out.println(cc);

        System.out.println(cp);
    }
}