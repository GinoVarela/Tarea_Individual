
package modulo2;

import java.util.Arrays;
import java.util.Scanner;

public class Modulo2 {

     public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Modulo2 ob = new Modulo2();
       //mensaje inicio
       System.out.println( ob.getmessage());
       //mensaje final
       
       //test de notas
       System.out.println("Introdusca su nota parcial.");
       int nota= scanner.nextByte();
       System.out.println("Usted ha " +ob.getApproved(nota));
       //test de notas
       
       //division inico
       System.out.println("Introdusca numerador");
       int a= scanner.nextInt();
       System.out.println("Introdusca denominador");
       int b= scanner.nextInt();
       System.out.println("el resultado de la division es: " +ob.getDiv(a, b));
       //division final
       
       //Impresion de lista
       System.out.println("Lista de 1 a X, Introdusca su X");
       int l= scanner.nextInt();
       System.out.println(Arrays.toString(ob.getList(l)));
       //Impresion de lista
       
    }
     //modulo de mensaje
     public String getmessage(){
     String saludo= "Estoy aprendiendo, pero seré el mejor programador del mundo";
     return saludo;
      }
    
     //modulo de Aprobacion
     public String getApproved(int x){
         String test;
     if(x>=70){
     test = "Aprobado";
            }else{
         test=  "Reprobado";     
            }
     return test;
     }
     
     //modulo de division
     public double getDiv(int a, int b){
     if(b==0){
         System.out.println("No puede Dividir por cero");
           return 0;
     }
         double div= a/b;
         return div;     
     }
     
     //generador de lista
     public int[] getList(int x){
     int[] lista= new int[x];
     for(int i=1; i<=x; i++){
     lista[(i-1)]=i;
     }
     return lista;
     }
     
}
