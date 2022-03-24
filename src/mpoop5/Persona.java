package mpoop5;
/**
 * Clase que crea una persona
 * @author David Gomez
 */
public class Persona { 
    private String nombre;
    private String apellido;
    private Fecha fNacimiento; 
    /**
     * Constructor vacio
     */
    public Persona() {    
    }
    /**
     * @param nombre Nombre de la persona
     * @param apellido Apellido de la persona
     * @param fNacimiento Fecha de nacimiento de la persona
     */
    public Persona(String nombre, String apellido, Fecha fNacimiento) {
        this.nombre = nombre; // Constructores
        this.apellido = apellido;
        this.fNacimiento = fNacimiento;
    }
    /**
     * @param nombre Nombre de la persona
     * @param apellido Apellido de la persona
     * @param dia Dia de la fecha de nacimiento de la persona
     * @param mes Mes de la fecha de nacimiento de la persona
     * @param anio año de la fecha de nacimiento de la persona
     */
    public Persona(String nombre, String apellido, int dia, int mes, int anio){
        this.nombre = nombre; // Constructores
        this.apellido = apellido;
        this.fNacimiento = new Fecha(dia,mes,anio);
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }

    public Fecha getfNacimiento() {
        return fNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
    /**
     * Mètodo que crea una persona al convertir sus
     * elementos a tipo String para mostralos en pantalla
     * como concatenación de cadena de caracteres.
     * @return Informacion completa de la persona en String
     */
    @Override // Sobre escritura del metodo toString
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + 
                apellido + ", fNacimiento=" + fNacimiento + '}';
    }  
}
