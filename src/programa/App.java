package programa;
import classes.Aeronave;
import classes.Piloto;

public class App {
    public static void main(String[] args) {        
        Piloto piloto = new Piloto("Luiz Fernando", "12345678910", "121312", "P1789123");        
        Aeronave a = new Aeronave("Helicóptero", "98754786548", piloto);

        System.out.printf("Nome do piloto: %s\n", piloto.getNome());              
        System.out.printf("Cpf do pilto: %s\n", piloto.getCpf());        
        System.out.printf("Matricula do piloto: %s\n", piloto.getMatricula());        
        System.out.printf("Habilitação do piloto: %s\n", piloto.getHabilitacao());        
        System.out.printf("Modelo  da aeronave: %s\n", a.getModelo());
        System.out.printf("Numero de identificação da aeronave: %s\n", a.getNumChassi());
        System.out.printf("Vamos decolar! %s metros de altura.\n", a.getAltitudeAtual());
        piloto.acelerar(2000);
        System.out.printf("Estamos chegando a %s metros de altura.\n", a.getAltitudeAtual());
    }
}
