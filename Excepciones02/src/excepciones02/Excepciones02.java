/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el
código para generar y capturar una excepción ArrayIndexOutOfBoundsException
(índice de arreglo fuera de rango).
 */
package excepciones02;


public class Excepciones02 {

    
    public static void main(String[] args) {
        
        
        
       int []  Array = new int[5];
        
        try {
        for (int i = 0; i < 6; i++) {
            
            Array[i]= i;
            
            System.out.println(Array[i]);
        }
        
        }catch(ArrayIndexOutOfBoundsException e){
            
            System.out.println("fuera de rango"); 
            
        } finally{
            System.out.println("fin del Array");
        }
        
    }
    
}
