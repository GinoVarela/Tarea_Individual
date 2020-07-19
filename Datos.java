package ciudadano;

import helpers.Ciudadano;

public class Datos {

    public static void main(String[] args) {
        Ciudadano dt=new Ciudadano();
        dt.setEdad(25);
        dt.setExp(5);
        dt.setNombre("Elizabeth Carranza");
        
        System.out.println("Nombre:" +dt.getNombre());
        System.out.println("Edad:" +dt.getEdad()+" Años");
        System.out.println("Experiencia:"+dt.getExp()+" Años");
    }
    
}
