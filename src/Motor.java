
public class Motor extends ComponenteVehicular {
    int cilindros;
    int potencia;

    public Motor(String codigo, String fabricante, int cilindros, int potencia) {
        // Llamada al constructor de la clase base
        super(codigo, fabricante);
        this.cilindros = cilindros;
        this.potencia = potencia;
    }
    //Polimorfismo: sobre escritura del metodo mostrarInformacion
    @Override
    public void mostrarInformacion() {
        // Llamada al metodo mostrarInformacion de la clase base
        super.mostrarInformacion();
        System.out.println("Cilindros: " + cilindros);
        System.out.println("Potencia: " + potencia + " HP");
    }

    public void encenderMotor() {
        System.out.println("Motor encendido con " + cilindros + " cilindros y " + potencia + " HP.");
    }
}