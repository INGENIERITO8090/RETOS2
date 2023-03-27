// importamos la clase de el objeto que vamos a utilizar 
import java.util.Scanner;
// craamos la clase
public class RETO2_1 {
    // creamos el metdo de ejecucion 
    public static void main(String[] args) {
        // creamos el objeto de la clase scanner 
        Scanner leer = new Scanner(System.in);
// declaramos variables 
        int n;
    // solicitamos datos  y capturamos datos 
    System.out.println( "digite el numero del cual desea saber los multiplos de dos ");
    n=leer.nextInt();
    // creamos el array 
    int [] multiplos = new int [n];
     // ciclo tipo  for para que el array llene sus campos
     
     for ( int i=0; i<n ; i++ ){
        
        multiplos[i]=i;
         i=i+1;
      }
      // ciclo for para mostrar lo que almaceno el array 
    for(int i=0;i<n;i++){
        
        System.out.println(multiplos[i]);
      i=i+1;

    }  
    // limpiamos el buffer 
 leer.close();
    }
}
