package com.mycompany.ejercicio_03;

import java.util.Scanner;

public class Ejercicio_03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese su nombre: ");
        String nombre = sc.next();
        System.out.println("ingrese su edad: ");
        int edad = sc.nextInt();
        System.out.println("Ingrese su sexo(H-M)");
        char sexo = (char) sc.next().charAt(0);
        System.out.println("Ingrese su peso: ");
        double peso = sc.nextDouble();
        System.out.println("ingrese su altura: ");
        double altura = sc.nextDouble();

        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        persona2.setPeso(300);
        persona2.setAltura(1.70);
        Persona persona3 = new Persona();

        System.out.println("Persona 1: ");
        System.out.print("IMC: ");
        if (persona1.calcularIMC() == 1) {
            System.out.print(" SOBREPESO");
        } else if (persona1.calcularIMC() == -1) {
            System.out.print(" BAJO DE PESO");
        } else if (persona1.calcularIMC() == 0) {
            System.out.print(" PESO IDEAL");
        }
        System.out.println(" ");
        System.out.println("Mayor de edad: " + persona1.esMayor());
        System.out.println(persona1);

        System.out.println(" ");

        System.out.println("Persona 2: ");
        System.out.print("IMC: ");
        System.out.println(persona2.calcularIMC());
        if (persona2.calcularIMC() == 1) {
            System.out.print(" SOBREPESO");
        } else if (persona2.calcularIMC() == -1) {
            System.out.print(" BAJO DE PESO");
        } else if (persona2.calcularIMC() == 0) {
            System.out.print(" PESO IDEAL");
        }
        System.out.println(" ");
        System.out.println("Mayor de edad: " + persona2.esMayor());
        System.out.println(persona2.toString());

        
        System.out.println("");
        System.out.println("Persona 3: ");
        System.out.print("IMC: ");
        if (persona3.calcularIMC() == 1) {
            System.out.print(" SOBREPESO");
        } else if (persona3.calcularIMC() == -1) {
            System.out.print(" BAJO DE PESO");
        } else if (persona3.calcularIMC() == 0) {
            System.out.print(" PESO IDEAL");
        }
        System.out.println(" ");
        System.out.println("Mayor de edad: " + persona3.esMayor());
        System.out.println(persona3.toString());

    }
}
