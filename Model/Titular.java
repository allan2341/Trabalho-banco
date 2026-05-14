package Model;


public class Titular {


    private String nome;
    private String cpf;
    private String fone;

 
    public Titular(
            String nome,
            String cpf,
            String fone
    ) {

        this.setNome(nome);
        this.setCpf(cpf);
        this.setFone(fone);
    }


    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getFone() {
        return fone;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    @Override
    public String toString() {

        return "Titular {" +
                "\n nome = '" + nome + '\'' +
                ",\n cpf = '" + cpf + '\'' +
                ",\n fone = '" + fone + '\'' +
                "\n}";
    }
}