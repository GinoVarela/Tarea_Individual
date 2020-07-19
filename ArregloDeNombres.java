
package arreglo.de.nombres;
import java.util.Scanner;

public class ArregloDeNombres {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Nombres[]= new String[10];
        System.out.println("Bienvenido al Arreglo de nombres");
        for(int i=1; i<=10; i++){
        System.out.println("Introdusca nombre numero " +i);
       Nombres[i-1] = scanner.next();
        }
        System.out.println("Ahora imprimiremos los nombres guardados:");
        for(int j=0; j<10; j++){
        System.out.println( "Nombre numero "+(j+1) + ": "+Nombres[j]);
        }    
    }
}
