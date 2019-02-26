/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author christian
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria(4, 45);
        Scanner leer = new Scanner(System.in);
        int opcion=9;
        while(opcion !=0){
            System.out.println("Ingresa una opcion (0-4)");
            opcion = leer.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Depositar");
                    c1.depositar(leer.nextFloat());
                  break;
                case 2:
                    System.out.println("Retirar");
                    c1.retirar(leer.nextFloat());
                  break;
                case 3:
                    System.out.println("Consultar Saldo");
                    System.out.println("Saldo "+c1.getSaldo());
                  break;
                case 4:
                    System.out.println("Consultar Movimientos");
                    String[] historial = c1.getHistorial();
                    for (int i = 0; i < 10; i++) {
                        if(historial[i] != null){
                            System.out.println(historial[i]);
                        }
                    }
                  break;
                default:
                    System.out.println("Salir");
            }
        }
        
        
        
    }

}
