
package helpers;

public class Ciudadano {
    
    private int Edad;
    private int Exp;
    private String Nombre;
    
    public Ciudadano(){
        
    }
    
    public void setEdad(int Edad){
        this.Edad=Edad;
    }
    
    public void setExp(int Exp){
        this.Exp=Exp;
    }
    
    public void setNombre(String Nombre){
        this.Nombre=Nombre;
    }
    
    public int getEdad(){
        return Edad;
    }
    
    public int getExp(){
        return Exp;
    }
    
    public String getNombre(){
        return Nombre;
    }
}
