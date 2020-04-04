//Matriz de x y matriz de escalera /
package matrizx;
import java.util.Scanner;
public class MatrizX {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
 int f,c;
        int nu=1;
        
   System.out.print("ingrese un numero de fila:\n");
   f=entrada.nextInt();
   System.out.print("ingrese un numero de columna:\n");
   c=entrada.nextInt();
   
   int arreglo[][]=new int [f][c];
    
   for (int i=0; i<arreglo.length; i++){
       for (int j=0; j<arreglo.length; j++){
           int la=i +1;
           if((i==j)||j==(c-la)){
           arreglo[i][j]=0;
           System.out.print(arreglo[i][j]+" ");
       }
           else{
               arreglo[i][j]=1;
               System.out.print(arreglo[i][j]+" ");
           } 
      }
   
System.out.print(" ");
System.out.print("\n");
   }
   System.out.println("\n");
   for(int i=0; i<arreglo.length; i++){
       for (int j=0; j<arreglo.length; j++){
           int la=i+1;
           if ((j== (c-la))){
               arreglo[i][j]=0;
               System.out.print(arreglo[i][j]+" ");
           }
           else{
               arreglo[i][j]=1;
               System.out.print(arreglo[i][j]+" ");
           }
       }
  System.out.println( );
   }
    System.out.println("\n");
 
    }
    
}
