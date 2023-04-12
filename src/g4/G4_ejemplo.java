/* *Crea una aplicación que le pida dos números al usuario y este pueda elegir 
entre sumar, restar, multiplicar y dividir. La aplicación debe tener una función
para cada operación matemática y deben devolver sus resultados para imprimirlos
en el main. 
 */
package g4;

import java.util.Scanner;

public class G4_ejemplo {

    
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        String frase;  
        System.out.println("Ingrese una frase");
        frase= leer.nextLine();
        String retorno= reemplazo(frase);
       
               
      
       
    }
    
    /* a=@          i=$     u=*
        e=#        o=%
    */
    
    public static String reemplazo (String frase) {
         frase = frase.toLowerCase();
         System.out.println(frase.length());
         int legth=frase.length();
         String cambio=null;
        for (int i=0; i<legth; i++) {
            switch (frase.substring(i-1,i)){
                case "a":
                   cambio= "@";
                   continue;
                case "e":
                    cambio= "#";
                    continue;
                    
                case "i":
                    cambio="$";
                    continue;
                    
                case "o":
                    cambio="%";
                    continue;
                    
                 case "u":
                    cambio = "*";
                    continue;
                    
                 default:
                     cambio= frase.substring(i);
                     break;
                   
                    
            }
                
            System.out.print(cambio);
            }
        System.out.println(" ");
        return frase;    
        } 
       
    }
      
   
