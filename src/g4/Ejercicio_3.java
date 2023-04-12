/*Crea una aplicación que a través de una función nos convierta una cantidad 
de euros introducida por teclado a otra moneda, estas pueden ser a dólares, 
yenes o libras. La función tendrá como parámetros, la cantidad de euros y la 
moneda a convertir que será una cadena, este no devolverá ningún valor y
mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package g4;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
     Scanner read = new Scanner(System.in);
     double euros;
        System.out.println("Ingrese la cantidad de euros a convertir");
        euros= read.nextDouble();
        convertor(euros);
    }
    
    public static void convertor(double euros){
        Scanner read = new Scanner(System.in);
        System.out.println("Elija la moneda a convertir");
        System.out.println("Dolar");
         System.out.println("Yen");
         System.out.println("Libra");
        String opcion= read.next();
        switch (opcion.toLowerCase()) {
            case "dolar":
                double cambio= euros* 1.28611;
                System.out.println("El cambio a dolares es " + cambio);
                break;
            case "yen":
                 cambio= euros* 129.852;
                System.out.println("El cambio a yenes es " + cambio);
                
                break;
                
            case "libra": 
                 cambio= euros* 0.86 ;
                System.out.println("El cambio a libras es " + cambio);
                    
                break;
                
        }
    }
}
