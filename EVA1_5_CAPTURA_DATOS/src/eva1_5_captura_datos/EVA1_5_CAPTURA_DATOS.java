/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_5_captura_datos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_5_CAPTURA_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre; 
        int edad; 
        System.out.println("introduce tu nombre ");
        //scanner 
        Scanner scanner = new Scanner(System.in);
        //captura
        nombre = scanner.nextLine();
        System.out.println("introduce tu edad ");
        edad = scanner.nextInt();
        System.out.println("tu nombre es:" + " " + nombre);
        System.out.println("tu edad es: " + " " + edad);
        
       
        
    }
    
}
