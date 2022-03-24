package mpoop5;
/**
 * Clase que crea un coche
 * @author David Gomez
 */
public class Coche {  
    private String marca; 
    private String color;
    private int placa;
    private int numPuertas;
    private int modeloAnio;
     // Actividad extra 
    private Persona chofer;
    private Persona copiloto;
    private Persona pasajero1;
    private Persona pasajero2;
    /**
     * Constructor vacio
     */       
    public Coche() {    
    }
    /**
     * @param marca Marca del coche
     * @param color Color del coche
     * @param placa Placa del coche
     * @param numPuertas Numero de puertas del coche
     * @param modeloAnio Modelo del coche
     * @param chofer Conductor del coche
     * @param copiloto Copiloto del coche
     * @param pasajero1 Pasajero 1 del coche
     * @param pasajero2 Pasajero 2 del coche
     */
    public Coche(String marca, String color, int placa, int numPuertas, 
            int modeloAnio, Persona chofer, Persona copiloto, 
            Persona pasajero1, Persona pasajero2) {
        this.marca = marca;
        this.color = color;
        this.placa = placa;
        this.numPuertas = numPuertas;
        this.modeloAnio = modeloAnio;
        // Actividad extra
        this.chofer = chofer;
        this.copiloto = copiloto;
        this.pasajero1 = pasajero1;
        this.pasajero2 = pasajero2;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public String getColor() {
        return color;
    }

    public int getPlaca() {
        return placa;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public int getModeloAnio() {
        return modeloAnio;
    }
    
    public Persona getChofer() {
        return chofer;
    }

    public Persona getCopiloto() {
        return copiloto;
    }

    public Persona getPasajero1() {
        return pasajero1;
    }

    public Persona getPasajero2() {
        return pasajero2;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public void setModeloAnio(int modeloAnio) {
        this.modeloAnio = modeloAnio;
    }
    
    public void setChofer(Persona chofer) {
        this.chofer = chofer;
    }

    public void setCopiloto(Persona copiloto) {
        this.copiloto = copiloto;
    }

    public void setPasajero1(Persona pasajero1) {
        this.pasajero1 = pasajero1;
    }

    public void setPasajero2(Persona pasajero2) {
        this.pasajero2 = pasajero2;
    }
    
    /**
     * Método que enciende el coche
     */
    public void encender(){
        System.out.println("Estoy encendido");
    }
    /**
     * Método que apaga el coche
     */
    public void apagar(){
        System.out.println("Me voy a apagar");
    }
    /**
     * Método que frena el coche
     */
    public void frenar(){
        System.out.println("Frenando");
    }
    /**
     * Método para tocar el claxon del coche
     */
    public void tocarClaxon(){
        System.out.println("Quitate del camino");
    }
    /**
     * Método que muestra la velocidad a la que va el coche
     * mediante la concatenación de cadenas.
     * @param velocidad Velocidad a la que va el coche
     */
    public void acelerar(int velocidad){
        System.out.println("Voy a una velocidad de "+velocidad+" km/hr");
    }
    
    /**
     * Método que muestra la informacion del coche al convertir sus
     * elementos a tipo String para mostralos en pantalla como 
     * concatenación de cadena de caracteres.
     * @return Informacion del coche como String
     */
   @Override 
    public String toString() {
        return "Coche{" + "marca=" + marca + ", color=" + color + ", placa=" + 
                placa + ", numPuertas=" + numPuertas + ", modeloAnio=" 
                + modeloAnio + "\n chofer: " + chofer + "\n copiloto: " + 
                copiloto + "\n pasajero 1: " + pasajero1 + "\n pasajero 2: " 
                + pasajero2 + '}';
    }
}
