/*
 Escribir un programa en Java que juegue con el usuario a adivinar un número. La
computadora debe generar un número aleatorio entre 1 y 500, y el usuario tiene
que intentar adivinarlo. Para ello, cada vez que el usuario introduce un valor, la
computadora debe decirle al usuario si el número que tiene que adivinar es mayor
o menor que el que ha introducido el usuario. Cuando consiga adivinarlo, debe
indicárselo e imprimir en pantalla el número de veces que el usuario ha intentado
adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se
debe contar el carácter fallido como un intento.
 */
package excepciones04;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author monti
 */
public class Excepciones04 {

    
    
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int random = (int) (Math.random() * (10));
        int numA = -1;
        int cont = 0;

        System.out.println("adivina el numero ");

        do {
            try {
                System.out.println("numero correcto " + random + " shhh");
                cont++;
                numA = leer.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("el num ingresado no es un entero ");
                leer.next();
            }
            if (random == numA) {
                System.out.println("CORRECTO SON IGUALES  ");
            } else {
                if (numA < random ) {
                    System.out.println("el num que ingresaste es MENOR al correcto ");
                } else if( numA > random){
                    System.out.println("el num que ingresaste es MAYOR al correcto");
                } 
            }

        } while (numA != random);

        System.out.println("los intentos son "+ cont);
    }
    
}
