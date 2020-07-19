
package helpers;

public class Circulo extends superFormas {
    
    private double radio;
    
    public Circulo(){
      setDibujar("Circulo");
      setColor("Azul");
    }
  
    public void CalcularRadio(double Diametro){
        this.radio=Diametro/2;
        System.out.println(radio);
    }
    
}
