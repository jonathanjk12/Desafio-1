package classes;

public class Piloto extends Pessoa{
    private String matricula;
    private String habilitacao;
    private Aeronave aeronaveAtual;

    public Piloto(String nome, String cpf, String matricula, String habilitacao) {
        super(nome, cpf);
        this.matricula = matricula;
        this.habilitacao = habilitacao;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(String habilitacao) {
        this.habilitacao = habilitacao;
    }

    public Aeronave getAeronaveAtual() {
        return aeronaveAtual;
    }

    public void setAeronaveAtual(Aeronave aeronaveAtual) {
        this.aeronaveAtual = aeronaveAtual;
    }

    public void acelerar(int valor){
        aeronaveAtual.setAltitudeAtual(valor);
    }

    @Override
    public String cumprimentar() {
        return "Olá, passageiro!";
    }

}
