package mpoop5;
/**
 * Clase principal
 * @author David Gomez
 */
public class MPOOP5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo cir1 = new Circulo();
        cir1.setRadio(5);
        System.out.println(cir1.getRadio());
        cir1.area();
        cir1.perimetro();
        System.out.println(cir1.toString()); 
        System.out.println(cir1);
        
        System.out.println("##########");
        Circulo cir2 = new Circulo();
        cir2.setRadio(-15);
        System.out.println(cir2);
        
        System.out.println("################");
        Coche coche = new Coche();
        System.out.println(coche); 
        
        System.out.println("############");
        Persona per1 = new Persona();
        per1.setNombre("Panchito");
        per1.setApellido("Lopez");
        System.out.println(per1); 
        Fecha fecha = new Fecha(6,7, 2001);
        per1.setfNacimiento(fecha); 
        System.out.println(per1);
        
        System.out.println("###########");
        Persona per2 = new Persona();
        per2.setNombre("Juanito");
        per2.setApellido("Aguilar");
        per2.setfNacimiento(new Fecha(15,6,2002));
        System.out.println(per2);
        
        System.out.println("#######");
        Persona per3 = new Persona("Alan","Martinez", new Fecha (16,2,2002));
        System.out.println(per3);
        
        System.out.println("###########");
        Persona per4 = new Persona ("Sofia","Vazquez",12,2,1999);
        System.out.println(per4);
        
        System.out.println("###########");
        Persona chofer = new Persona("Aldo","Suárez",15,8,1985);
        Persona copiloto = new Persona("María","Rivera",9,6,1987);
        Persona pasajero1 = new Persona("Ashael","Rocha",21,1,2002);
        Persona pasajero2 = new Persona("Valeria","Cano",14,3,2003);
        Coche miCoche = new Coche("Mazda", "rojo", 123456, 4, 2020, chofer, 
                                    copiloto, pasajero1, pasajero2);
        System.out.println(miCoche);
    }
    
}
