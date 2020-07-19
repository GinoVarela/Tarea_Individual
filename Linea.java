
package helpers;

public class Linea extends superFormas{
    
    private int largo;
    
    public Linea(){
        setDibujar("Linea");
        setColor("Blanco");
    }
    
    public void Longitud(int longitud){
        this.largo=longitud;
        System.out.println(largo);
    }
    
}
