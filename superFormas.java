
package helpers;

public class superFormas {
   
    private  String Color;
    private  String Dibujar;
       
   public superFormas(){
   //Constructor standar    
   }
   
   //set things
   public void setColor(String Colores){
       this.Color=Colores;
   }
   
   public void setDibujar(String Dibujos){
       this.Dibujar=Dibujos;
   }
   
   //return for print
   public String printColor(){
       return this.Color;
   }
   
   public String printDibujar(){
       return this.Dibujar;
   }
   
   
}
