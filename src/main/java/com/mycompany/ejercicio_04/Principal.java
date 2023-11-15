/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_04;

import java.util.Scanner;

/**
 *
 * @author Marlon
 */
public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese los coeficientes de la ecuacion de segundo grado: ");
        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();
        System.out.print("c: ");
        double c = sc.nextDouble();
        
        Raices ecuacion = new Raices(a,b,c);
        System.out.println("Informacion de la ecuacion: ");
        
        System.out.println(ecuacion);
        System.out.println("Discriminante= "+ecuacion.getDisciminante());
        if (ecuacion.tieneRaices()) {
            ecuacion.calcularSolucion();
        }else{
            System.out.println("La ecuacion no tiene soluciones");
        }
        
        

    }
}
