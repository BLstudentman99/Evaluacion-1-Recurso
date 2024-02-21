/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_6_asignaturas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_6_ASIGNATURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String clave;
        String nombre; 
        String carrera;
        boolean tipoMateria;
        int creditos;
        int HT;
        int HP;
        Scanner input = new Scanner(System.in);
        System.out.println("¿cual es la clave de la materia? ");
        clave = input.nextLine();
        System.out.println("¿cual es el nombre de la materia? ");                                                          
        nombre = input.nextLine();
        System.out.println("¿cual es el nombre de la carrera? ");
        carrera = input.nextLine();
        System.out.println("introduce tu tipo de materia. [true: generica, false: especialidad] ");
        tipoMateria = input.nextBoolean();
        System.out.println("¿cuantos creditos da la materia? ");
        creditos = input.nextInt();
        System.out.println("¿cuantas horas teoricas tiene la materia ? ");
        HT = input.nextInt();
        System.out.println("¿cuantas horas practicas tiene la materia? ");
        HP = input.nextInt();
        
        System.out.println("DATOS DE LA ASIGNATURA");
        System.out.println("la clave de tu materia es:" + " " + clave);
        System.out.println("el nombre de tu carrera es:" + " " + nombre);
        System.out.println("el nombre de tu carrera es:" + " " + carrera);
        System.out.println("el tipo de materia es:" + " " + tipoMateria);
        System.out.println("los creditos que da tu materia son:" + " " + creditos);
        System.out.println("las horas teoricas son:" + " " + HT);
        System.out.println("las horas practicas son:" + " " + HP);
               
    }
    
}
