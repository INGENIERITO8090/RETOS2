// IMPORTAMOS  la clase dell objeto que vamos a tulizar 
import java.util.Scanner;
// creamos la clase 
public class RETO2_2 {
    // creamos el metodo de ejecucion 
public static void main(String[] args) {
    // instanciamos la clase 
     Scanner leer =new Scanner(System.in);
     // declaramos variables 
    String  nombre_c;
    int cantidad_p;


    
       // solicitamos datos 
System.out.println( " digite el nombre de la categoria");
nombre_c = leer.next(); 
System.out.println(" digite la cantidad de participantes   \n NOTA : maximo 8 participantes por categoria ");
cantidad_p=leer.nextInt();

// creamos el array NOMBRES
String [] nombres   = new String[cantidad_p];
// creamos el array  tiempos 
double [] tiempos   = new double[cantidad_p];
// creamo ses array podio  
Double [] podio = {Double.MAX_VALUE,Double.MAX_VALUE,Double.MAX_VALUE};
for ( int i=0 ;i<cantidad_p;i++){
 System.out.println( " ingrese el nombre  del participante  "+ (i+1) );
  nombres[i]=leer.next();
    
  System.out.println( "ingrese el tiempo  de  en segundos   " + nombres[i] + (i+1));  
tiempos[i]=leer.nextDouble();

 
}    


 for ( int   i =0 ;i <cantidad_p; i++){
    System.out.println( nombres[i]);
    System.out.println( tiempos[i]);
     
    if (tiempos[i] < podio[0]) {
        podio[2] = podio[1];
        podio[1] = podio[0];
        podio[0] = tiempos[i];
    } else if (podio[i] < podio[1]) {
        podio[2] = podio[1];
        podio[1] = tiempos[i];
    } else if (podio[i] < podio[2]) {
        podio[2] = tiempos[i];
    }
 System.out.println(" el primer lugar esta " +nombres[i] +podio[0]);
 System.out.println( "en el segudno lugar esta "+nombres[i]+podio[1]);
 System.out.println(" en el tercer lugar esta " +nombres[i]+podio[2]);
}


leer.close();

    

}
}














