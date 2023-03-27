import java.util.*; 
public class RETO2_4 {
public static void main(String[] args) {

    Scanner leer = new Scanner( System.in );  
    
    int precio; 
    String producto;
    

    String [][] productos = new String [4][4]; 
     for (int f=0; f<4; f++  ){
for (  int c=0; c<4;c++ ){ 
   System.out.println( "digite el producto en la posicion " + f + c );
   producto=leer.next() ;
   System.out.println( " ingrese precio del producto " + f + c );
   precio=leer.nextInt(); 
   productos[f][c]=  producto + precio ;
  
  }
  }  
   for (int  f=0 ; f<4; f++  ){ 
for (  int c=0 ; c<4; c++) {
  System.out.print( productos[f][c] +"\t"  );
} System.out.println( );
}   
}
}
