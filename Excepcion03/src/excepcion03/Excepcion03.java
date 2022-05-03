/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner
para leer dos números en forma de cadena. A continuación, utilice el método
parseInt() de la clase Integer, para convertir las cadenas al tipo int y guardarlas en
dos variables de tipo int. Por ultimo realizar una división con los dos numeros y
mostrar el resultado.
Todas estas operaciones puede tirar excepciones a manejar, el ingreso por
teclado puede causar una excepción de tipo InputMismatchException, el método
Integer.parseInt() si la cadena no puede convertirse a entero, arroja una
NumberFormatException y además, al dividir un número por cero surge una
ArithmeticException. Manipule todas las posibles excepciones utilizando bloques
try/catch para las distintas excepciones
 */
package excepcion03;

import java.util.InputMismatchException;
import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author monti
 */
public class Excepcion03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("ingrese los dos numeros :");
        try {
        String n1 = leer.nextLine();
        String n2 = leer.nextLine();
        
        
        int num1 = Integer.parseInt(n1);
        int num2 = Integer.parseInt(n2);
        
        int resu = num1 / num2;
        } catch (InputMismatchException e) {
            System.out.println("me mandaste un String");
        }catch(NumberFormatException e){
            System.out.println("no podemos convertirlo en entero");
        }catch(ArithmeticException e){
            System.out.println("hay un numero cero en tu logica");
        }finally{
            System.out.println(" terminado el programa");
       
        }
       
        
        
    }
    
}
