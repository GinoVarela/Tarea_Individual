
package helpers;

public class Triangulo extends superFormas {
    
    private double angulo;
    
    public Triangulo(){
        setDibujar("Triangulo");
        setColor("Amarillo");
    }
    
    public void calcularArea(int altura, int base){
        double Area=(altura*base)/2;
        System.out.println(Area);
    }
    
}
