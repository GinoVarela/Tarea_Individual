
package boleanoperaciones;

public class Boleanoperaciones {

    public static void main(String[] args) {
        int M=6;
        int T=1;
        int K=-10;
        System.out.println("Sea M=" + M + ", T=" + T + ", K=" +K);
        System.out.println("Es correcto que M>K? " +(M>K));
        System.out.println("Es correcto que T/K=5? " +((T/K)==5));
        System.out.println("Es correcto que (M+T=7) || (M-T=5)? " +((M+T == 7) || (M-T == 5)));
    }
}
