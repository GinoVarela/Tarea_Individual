
package registromultidimensionaltarea;
public class RegistroMultidimensionaltarea {

    public static void main(String[] args) {
        String registro[][]= {
            {"Elias", "Velasquez", "Industrail", "Estudiante"},
            {"Oscar","Gomez ","Industrial ","Estudiante "},
            {"Imelda","Osorto ","Industrial "," Estudiante "},
            {"Kenia ","Flores ","Industrial","Estudiante "},
            {" Gino","Ortiz ","Electronica ","Estudiante "}
        };
                 System.out.println("Alumno     Apellido     Carrera    Trabajo");
          for(int i=0;i<5; i++){
          System.out.println("=========================================");
                     for(int j=0; j<4; j++){
                                              System.out.print(" " +registro[i][j]+" ");
                                              //System.out.print(" ║ ");
                                              if(j==3){
                                                   System.out.println("");
                                                            }
                                   }
          }
          System.out.println("=========================================");
    }
 }
