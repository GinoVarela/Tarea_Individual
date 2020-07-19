package aprobadoreprobado;

public class AprobadoReprobado {

    public static void main(String[] args) {
        String alumnos[][]={
            {"Alejandra", "85","null"},
            {"Miguel","35","null"},
            {"Alejandro","70","null"},
            {"Isabel","97", "null"},
            {"Ramon","59","null"}
        };
        
        for(int i=0;i<5;i++){
           int nota;
                nota = Integer.parseInt(alumnos[i][1]);
                if(nota>=70){
                    alumnos[i][2]="Aprobado";
                }else{
                    alumnos[i][2]="Reprobado";
                }
                System.out.println("");
            for(int j=0;j<3;j++){
                System.out.print(" "+alumnos[i][j]+" ");
            }
        }
    }
}
