// importamos la clase de los objetos que vamos a crear 
import java.util.Scanner;

//  creamos la clase
public class RETO2_3 {
     
    public static void main(String[] args) {
    // instanciamos   
     Scanner leer = new Scanner(System.in);
    // imprimimos
    System.out.println( " este programa simula el juego de concentrese el programa  mostrara en que cuadros almaceno la misma informacion  ");

     System.out.println(" llene las matris con numeros  ");
    // creamos la matriz 
   int [][] concentrese = new int [3][3]; 
   for (int f = 0; f < 3; f++) {
    for (int c = 0; c <3; c++) {
         System.out.println("digite el numero  que desea almacenar en la pocision "+f+c);
     concentrese[f][c]=leer.nextInt();
  
    } }
 // Recorremos la matriz
for (int f = 0; f < 3; f++) {
    for (int c = 0; c <3; c++) {
        int elementoActual = concentrese[f][c];
        
        // Comparamos con los demás elementos en la matriz
        for (int k = f; k < 3; k++) {
            int l = 0;
            if (k == f) {
                l = c + 1;
            }
            for (; l < k; l++) {
                int  elementoComparado = concentrese[k][l];
                if (elementoActual == elementoComparado) {
                    System.out.println("El elemento " + elementoActual + " se repite en la matriz");
                }
            }
        }
    }
}
        



     for (int f = 0; f < 3; f++) {
        for (int c = 0; c <3; c++) {
             
           System.out.print( concentrese[f][c]+"\t");

        
                                             }
          System.out.println();


            } 

  

leer.close();

        } 
         
       

            }
    







    