
package tareamodulo5;

import helpers.Circulo;
import helpers.Cuadrado;
import helpers.Linea;
import helpers.Triangulo;

public class TareaModulo5 {

    public static void main(String[] args) {
        Circulo cir= new Circulo();
        Linea lin= new Linea();
        Triangulo tri= new Triangulo();
        Cuadrado qua= new Cuadrado();
        System.out.println("Figuras");
                
        System.out.println("La figura es un " +cir.printDibujar()+" y es color " +cir.printColor());
        System.out.println("El radio del circulo es: ");
        cir.CalcularRadio(50);
        
        System.out.println("La figura es una " +lin.printDibujar()+" y es color "+lin.printColor());
        System.out.println("La longitud de la linea es: ");
        lin.Longitud(20);
        
        System.out.println("La figura es un " +tri.printDibujar()+" y es color " +tri.printColor());
        System.out.println("El area del triangulo es: ");
        tri.calcularArea(20, 5);
        
        System.out.println("La figura es un " +qua.printDibujar()+" y es color " +qua.printColor());
        System.out.println("El area del cuadrado es: ");
        qua.calcularArea(7);
        
       
        
        
    }
    
}
