//Borde  del cuadrado con numero ingresado por el usuario
package matrices1.pkg1;
import java.util.Scanner;
public class Matrices11 {

    public static void main(String[] args) {
Scanner entrada=new Scanner (System.in);
int n,m,d;


        System.out.print("ingresa numero de columna\n");
        n=entrada.nextInt();
        
        System.out.print("ingresa numero de fila\n");
        m=entrada.nextInt();
        
        System.out.print("ingresa un numero\n");
        d=entrada.nextInt();
        
        
      if(n>=0 && n<=m){
            //columnas Superior
           for (int i=0; i<n; i++){
               System.out.print(d);
        }
           System.out.println();
           //centro
for (int i=0; i<m-2; i++){
System.out.print(d);
for (int j=0; j<n-2; j++){
    System.out.print(" ");
}
System.out.println(d);
}            
           //columnas Inferior
        for (int i=0; i<n; i++){
               System.out.print(d);
        }
    
    }
    
}
}