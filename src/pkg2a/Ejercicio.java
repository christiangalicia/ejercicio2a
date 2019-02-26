/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2a;

import escuela.*;
import java.util.Scanner;

/**
 *
 * @author christian
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     double b=5;
        float a = (float)b;
       
        
        
        Scanner leer = new Scanner(System.in);
        ControlDeCalificaciones cc = new ControlDeCalificaciones();
        
          System.out.println("1.- Ingresa examen, trabajo 1, trabajo 2, asistencia");
           
          float f1= cc.evaluarParcial(leer.nextFloat(), leer.nextFloat(), 
                   leer.nextFloat(), leer.nextFloat());
          System.out.println("2.- Ingresa examen, trabajo 1, trabajo 2, asistencia");
           
          float f2= cc.evaluarParcial(leer.nextFloat(), leer.nextFloat(), 
                   leer.nextFloat(), leer.nextFloat());
        
          float promedio= cc.evaluarCalificaciones(f1, f2);
          System.out.println("el promedio es "+ promedio);
    }

}
