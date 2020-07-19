
package registromultidimensional;
import java.util.Scanner;


public class RegistroMultidimensional {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String registro[][]= new String[5][4];
        System.out.println("Bienvenido al Registro multidimencional");
        
        for(int i=1; i<=5; i++){
             System.out.println("");
             System.out.println(" Datos Alumno numero " +i );
             
            for(int j=1; j<=4; j++){
            System.out.print(j);
            switch(j){
                case 1: {System.out.print(" Escriba Nombre: ");
                registro[i-1][j-1]=scanner.next();
                break;
                }
                case 2: {System.out.print(" Escriba Apellido: ");
                registro[i-1][j-1]=scanner.next();
                break;
                }
                case 3: {System.out.print(" Escriba Carrera: ");
                registro[i-1][j-1]=scanner.next();
                break;
                }
                case 4: {System.out.print(" Escriba lugar de trabajo: ");
                registro[i-1][j-1]=scanner.next(); 
                break;
                }
                }
            }
        }
        System.out.println("");
        

          //impresora del string de datos
          System.out.println("Alumno     Apellido     Carrera     Lugar Trabajo");
          for(int i=0;i<5; i++){
          System.out.println("=========================================");
          for(int j=0; j<4; j++){
          System.out.print(" " +registro[i][j]+" ");
          System.out.print(" ║ ");
          if(j==3){
              System.out.println("");
                    }
               }
          }
          System.out.println("=========================================");
    }
}
