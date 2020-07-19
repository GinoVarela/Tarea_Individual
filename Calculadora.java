
package calculadora;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Introdusca el primer digito");
     double numero1 = scanner.nextDouble();
     System.out.println("Introdusca el segundo digito");
     double numero2 = scanner.nextDouble();
     double suma;
     double resta;
     double multiplicacion;
     double division=0;
     double modulo = 0;
     suma = numero1+numero2;
     resta = numero1-numero2;
     multiplicacion = numero1 * numero2;
     modulo=numero1%numero2;
     if(numero2!=0){
     division= numero1/numero2;
     }else{
     System.out.println("El denominador no puede ser cero");
     } 
     System.out.println("Resultado de las operaciones:");
     System.out.println("Suma:"+ suma);
     System.out.println("Resta:"+ resta);
     System.out.println("Multiplicacion:"+ multiplicacion);
     System.out.println("Residuo:"+modulo);
     if(numero2!=0){
     System.out.println("Divicion:"+division);
     System.out.println("Residuo:"+modulo);
             }
       }
}
