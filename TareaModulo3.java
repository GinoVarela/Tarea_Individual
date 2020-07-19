package modulo3;

public class TareaModulo3 {

    public static void main(String[] args) {
        Cheff cocinero= new Cheff();
        
        cocinero.setNombre("Carlos estrada");
        cocinero.setApellido("Funez reyes");
        cocinero.setIdentidad("081197536952");
        cocinero.setEdad(45);
        cocinero.setEst_civil("Casado");
        cocinero.setResidencia("La canada bloque 43 casa 5236");
        cocinero.setCorreo("ca_estrada75@gmail.com");
        cocinero.setnum_telefono(9961532);
        System.out.println("Los datos del cocinero son: ");
        System.out.println("Nombre: "+cocinero.getNombre());
        System.out.println("Apellido: "+cocinero.getApellido());
        System.out.println("Numero de identidad: "+cocinero.getIdentidad());
        System.out.println("Edad: "+cocinero.getEdad());
        System.out.println("Est_civil: "+cocinero.getEst_civil() );
        System.out.println("Residencia: "+cocinero.getResidencia());
        System.out.println("Correo Electronico: "+cocinero.getCorreo());
        System.out.println("Numero de telefono: "+cocinero.getnum_telefono());
      
    }
}
