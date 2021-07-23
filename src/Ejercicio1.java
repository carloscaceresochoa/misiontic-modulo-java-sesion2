
import java.util.Scanner;




public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        int n1,n2,suma;
        System.out.println("Digite n1");
        n1=teclado.nextInt();
        System.out.println("Digite n2");
        n2=teclado.nextInt();
        suma=n1+n2;
        System.out.println("Suma "+suma);
        
    }
    
}
