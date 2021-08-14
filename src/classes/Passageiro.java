package classes;

public class Passageiro extends Pessoa {
    public Passageiro(String nome, String cpf, int idade) {
        super(nome, cpf, idade);
    }

    public Passageiro(String nome, String cpf) {
        super(nome, cpf);
    }

    private int codigoCliente;

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
}