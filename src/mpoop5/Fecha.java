package mpoop5;
/**
 * Clase que crea una fecha
 * @author David Gomez
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    /**
     * Constructor vacio
     */
    public Fecha() {   
    }
    /**
     * @param dia Dia de la fecha
     * @param mes Mes de la fecha
     * @param anio Año de la fecha
     */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    /**
     * Metodo que crea una fecha al convertir sus
     * elementos a tipo String para mostralos en pantalla 
     * como concatenación de cadena de caracteres.
     * @return La fecha completa como String
     */
    @Override
    public String toString() {
        return dia+"/"+mes+"/"+anio;  // modificando el formato
    }  
}
