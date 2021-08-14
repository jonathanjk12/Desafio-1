package classes;

public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Pessoa(String nome, String cpf, int idade) {
        setNome(nome);
        setCpf(cpf);
        setIdade(idade);
    }
    
    @Override
    public String toString() {
        return String.format("Nome: %s - CPF: %s - Idade: %s", getNome(), getCpf(), getIdade());
    }
    
    public String cumprimentar() {
        return "Olá, piloto!";
    }
    
}
