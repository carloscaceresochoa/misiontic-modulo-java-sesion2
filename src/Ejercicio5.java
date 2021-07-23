
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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclado=new Scanner(System.in);
         int edad;
         System.out.println("Digite la edad");
         edad=teclado.nextInt();
         if(edad>0){
            if(edad>=18){
                System.out.println("Es mayor");
            }          
            else{
                System.out.println("Es menor");
            }//else if(edad>=18)
         }
         else{
            System.out.println("la edad es negativa");
         }// else if(edad>0)
         
         
    }// main
    
}//class
