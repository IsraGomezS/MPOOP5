package mpoop5;
/**
 * Clase que crea un circulo
 * @author David Gomez
 */
public class Circulo {
    final float PI = 3.1416f;
    private float radio;
    /**
     * Constructor vacio
     */
    public Circulo(){
    
    }   
    /**
     * @param radio Radio del circulo
     */
    public Circulo(float radio){
        this.radio = radio;
    }  
    /**
     * Metodo que calcula y devuelve el perimetro de un circulo a partir
     * de definir previamente la constante PI y declarar una nueva variable
     * llamada perímetro y asignarle el valor 2*PI*radio y que dará en 
     * pantalla el valor a través de la concatencación de cadenas.
     */
    public void perimetro(){
        float perimetro = 2 * PI * radio;
        System.out.println("Perimetro="+perimetro);
    }
    /**
     * Metodo que calcula y devuelve el area de un circulo a partir
     * de definir previamente la constante PI y asignar directamente 
     * su valor  en el println() PI*radio*radio y que dará en 
     * pantalla el valor a través de la concatencación de cadenas.
     */
    public void area(){
        System.out.println("Area="+(PI) * radio * radio);
    } 
    
    public float getRadio(){
        return radio;
    } 
    
    public void setRadio(float radio){ 
        this.radio = Math.abs(radio);        
    }
    /**
     * Metodo que devuelve el valor del radio del circulo
     * @return Regresa el valor del radio del circulo
     */
    @Override
    public String toString(){
        return "Circulo{radio="+radio+"}";
    }
}
