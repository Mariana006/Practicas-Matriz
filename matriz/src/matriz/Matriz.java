package matriz;
import java.util.Scanner;
public class Matriz {

    public static void main(String[] args) {
   Scanner entrada=new Scanner(System.in);
        int f,c;
        int nu=1;
   System.out.print("ingrese un numero de fila");
   f=entrada.nextInt();
   System.out.print("ingrese un numero de columna");
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
   }
   System.out.println("\n");
   //forma de escalera
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
    //forma cuadrada
     for(int i=0; i<arreglo.length; i++) {
 for(int j=0;j<arreglo.length;j++){
     int la=j+1;
     if (i==0 || i==c-1 || j==0 || j==c-1){
         arreglo[i][j]=0;
         System.out.print(arreglo[i][j]+" ");
     }
     else {
         arreglo[i][j]=1;
         System.out.print(arreglo[i][j]+" ");
     }
 }
 System.out.println();
}
     for(int k=0; k<arreglo.length; k++){
       for (int q=0; q<arreglo.length; q++){
           int la=k+1;
           if ((k==q)||(k==(c-la))){
               arreglo[k][q]=0;
           }
           else {
               arreglo[k][q]=1;
           }
     }
}
     for(int k=0; k<arreglo.length; k++){
       for (int q=0; q<arreglo.length; q++){
if (arreglo[k][q]==0 || arreglo[k][q]==1){
    System.out.print(arreglo[k][q]+" ");
}
else {
    arreglo[k][q]=1;
    System.out.print(arreglo[k][q]+" ");
       }
}
       nu=nu+1;
}
}

}


