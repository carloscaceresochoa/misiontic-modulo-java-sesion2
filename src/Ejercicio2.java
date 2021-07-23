
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * programa en java que calcula el area del circulo
         */
        //tipo de dato double (decimal)
        Scanner teclado=new Scanner(System.in);
        double ac,radio;
        //tipo de constante PI
        final double PI=3.1416;
        System.out.println("Digite el radio");
        radio=teclado.nextDouble();
        ac=PI*Math.pow(radio, 2);
        System.out.println("Radio "+radio+" area del circulo "+ac);
        
    }
    
}
