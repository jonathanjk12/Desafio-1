package classes;

public class Aeronave {
    private String modelo;
    private String numChassi;
    private Piloto piloto;
    private int altitudeAtual = 0;

    public Aeronave(String modelo, String numChassi, Piloto piloto) {
        this.modelo = modelo;
        this.numChassi = numChassi;

        setPiloto(piloto);
        piloto.setAeronaveAtual(this);
    }

    public int getAltitudeAtual() {
        return altitudeAtual;
    }

    public void setAltitudeAtual(int altitude) {
        this.altitudeAtual = altitude;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumChassi() {
        return numChassi;
    }

    public void setNumChassi(String numChassi) {
        this.numChassi = numChassi;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }
    
}
