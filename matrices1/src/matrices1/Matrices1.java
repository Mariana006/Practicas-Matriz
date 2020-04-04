//borde del Cuadrado
package matrices1;
import java.util.Scanner;

public class Matrices1 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        System.out.printf("Ingresa la longitud del cuadrado:\n");
      int n=teclado.nextInt();
        
        if(n>=0 && n<=50){
            //columnas Superior
           for (int i=0; i<n; i++){
               System.out.print("*");
        }
           System.out.println();
           //centro
for (int i=0; i<n-2; i++){
System.out.print("*");
for (int j=0; j<n-2; j++){
    System.out.print(" ");
}
System.out.println("*");
}            
           //columnas Inferior
        for (int i=0; i<n; i++){
               System.out.printf("*");
        }
        
    }
}
}