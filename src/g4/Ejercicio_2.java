/*Diseñe una función que pida el nombre y la edad de N personas e imprima 
los datos de las personas ingresadas por teclado e indique si son mayores o
menores de edad. Después de cada persona, el programa debe preguntarle al 
usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese 
la palabra “No”.
 */
package g4;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas");
        int n = leer.nextInt();
        cantPersonas(n);
    }
    public static void cantPersonas(int n){
        
        String opcion;
         String nombrePersona;
         Scanner leer = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("ingrese el nombre de la persona:");
            nombrePersona = leer.next();
            System.out.println("ingresa la edad:");
            int edad = leer.nextInt();
            if (edad >= 18) {
                System.out.println("es mayor de edad");
            } else {
                System.out.println("es menor de edad");
            }
            System.out.println("desea continuar?");
            opcion = leer.next();
            if (opcion.equalsIgnoreCase("no")) {
                break;

            }
        
    }
        
    }
    
}
    

