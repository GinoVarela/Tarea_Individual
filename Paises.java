
package paises;

import Helpers.Guatemala;
import Helpers.Honduras;
import Helpers.Rusia;


public class Paises {


    public static void main(String[] args) {
        Honduras HN = new Honduras();
        Rusia RS = new Rusia();
        Guatemala GM = new Guatemala();
        System.out.println("Pais:");
        System.out.println(HN.getpais());
        System.out.println("Presidente:");
        System.out.println(HN.getpresidente());
        System.out.println("Pais:");
        System.out.println(RS.getpais());
        System.out.println("Presidente:");
        System.out.println(RS.getpresidente());
        System.out.println("Pais:");
        System.out.println(GM.getpais());
        System.out.println("Presidente:");
        System.out.println(GM.getpresidente());
    }
    
}
