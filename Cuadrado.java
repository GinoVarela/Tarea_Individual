
package helpers;

public class Cuadrado extends superFormas{
    
    private double Area;
    
    public Cuadrado(){
        setDibujar("Cuadrado");
        setColor("Verde");
    }
    
    public void calcularArea(int lado){
        System.out.println((lado*lado));
    }
    
    
}
