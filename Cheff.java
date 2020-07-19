package modulo3;


public class Cheff {
    private String Nombre;
    private String Apellido;
    private String Identidad;   
    private int Edad;
    private String Est_civil;
    private String Residencia;
    private String Correo;
    private int num_telefono;
    
    public Cheff(){
        
    }
    
    public Cheff(String Nombre, String Apellido, String Identidad, int Edad,String Est_civil, String Residencia, String Correo, int num_telefono){
        this.setNombre(Nombre);
        this.setApellido(Apellido);
        this.setIdentidad(Identidad);
        this.setEdad(Edad);
        this.setEst_civil(Est_civil);
        this.setResidencia(Residencia);
        this.setCorreo(Correo);
        this.setnum_telefono(num_telefono);
    }
    
    //Obtener los datos
    public String getNombre(){
        return Nombre;
    }
     
    public String getApellido(){
        return Apellido;
    }
    
    public String getIdentidad(){
        return Identidad;
    }
    
    public int getEdad(){
        return Edad;
    }
    
    public String getEst_civil(){
        return Est_civil;
    }
    
    public String getResidencia(){
        return Residencia;
    }
    
    public String getCorreo(){
        return Correo;
    }
    
    public int getnum_telefono(){
        return num_telefono;
    }
    
    
    //Establecer los datos
    
    public void setNombre(String _Nombre){
        this.Nombre=_Nombre;
    }
    
    public void setApellido(String _Apellido){
        this.Apellido= _Apellido;
    }
    
    public void setIdentidad(String _Identidad){
        this.Identidad=_Identidad;
    }
    
    public void setEdad(int _Edad){
        this.Edad=_Edad;
    }
    
    public void setEst_civil(String _Est_civil){
        this.Est_civil=_Est_civil;
    }
    
    public void setResidencia(String _Residencia){
        this.Residencia=_Residencia;
    }
    
    public void setCorreo(String _Correo){
        this.Correo=_Correo;
    }
    
    public void setnum_telefono(int _num_telefono){
        this.num_telefono=_num_telefono;
    }
    
}
