package arreglodediez;

import java.util.Scanner;

public class Arreglodediez {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[10];
        for(int i=0; i<=9; i++){
                System.out.println("Alumno "+ (i+1) +" Escriba su nombre");
                 String nombre =  scanner.next();
                            nombres[i]=nombre;
        
        }
        System.out.println("================");
        System.out.println("================");
        System.out.println("================");
        System.out.println("================");
        System.out.println("Lista de alumnos");
        for(int i=0; i<=9; i++){
               
                System.out.println("Numero  " + (i+1) + "  Nombre:  "+ nombres[i]);
         }
     }
}
