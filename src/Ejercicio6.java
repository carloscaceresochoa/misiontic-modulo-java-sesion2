
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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclado=new Scanner(System.in);
         int n;
         System.out.println("Digite n");
         n=teclado.nextInt();
         if(n%2==0){
             System.out.println(n+" es par");
         }
         else{
             System.out.println(n+" es impar");
         }
    }
    
}
