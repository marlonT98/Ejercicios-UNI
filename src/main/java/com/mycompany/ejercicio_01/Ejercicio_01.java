
package com.mycompany.ejercicio_01;

import java.util.Scanner;

/**
 *
 * @author Marlon
 */
public class Ejercicio_01 {

    public static void main(String[] args) {
      
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el nombre de la cuenta: ");
        String nombre =sc.next();
        System.out.println("Ingrese el saldo a la cuenta: ");
        double saldo =sc.nextDouble();
        Cuenta tarjeta = new Cuenta(nombre,saldo);
        
        System.out.println(tarjeta);
        tarjeta.retirar(200);
        System.out.println("Retirando: 200");
        System.out.println(tarjeta);
       
        //segunda ceunta
        Cuenta tarjeta2 = new Cuenta("maria");
        System.out.println(tarjeta2.toString());
       
        
        
        
        
        
        
        
        
        
        
        
    }
}
