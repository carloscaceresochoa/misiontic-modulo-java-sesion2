
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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int l1,l2,l3;
       Scanner teclado=new Scanner(System.in);
       System.out.println("Digite lado 1");
       l1=teclado.nextInt();
       System.out.println("Digite lado 2");
       l2=teclado.nextInt();
       System.out.println("Digite lado 3");
       l3=teclado.nextInt();
       if(l1==l2 && l2==l3){
           System.out.println("triangulo equilatero");
       }
       else if(l1!=l2 && l2!=l3 && l1!=l3){
           System.out.println("triangulo Escaleno");
       }
       else{
           System.out.println("Triangulo Isoceles");
       }   
              
    }
    
}
