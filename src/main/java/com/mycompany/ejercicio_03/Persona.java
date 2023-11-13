package com.mycompany.ejercicio_03;

import java.util.Random;

public class Persona {

    //atributos
    private String nombre;
    private int edad;
    private int DNI;
    private char sexo;
    private double peso;
    private double altura;

    public Persona() {

        this.nombre = " ";
        this.edad = 0;
        this.generarDNI();
        this.sexo = 'H';
        this.peso = 0.0;
        this.altura = 0.0;

    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.generarDNI();
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.generarDNI();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularIMC() {
        if (altura == 0) {//la altura no puede ser cero por la division
            return -1;
        }
        double imc = peso / Math.pow(altura, 2);

        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayor() {
        return edad >= 18;
    }

    public char comprobarSexo(char sexo) {

       return (sexo=='H' && sexo=='M')?sexo:'H';

    }

    //devolver todo la informacion
    public String toString() {

        return "Nombre: " + nombre +
                "\nEdad: " + edad +
                "\nDNI: " + DNI +
                "\nSexo: " + sexo +
                "\nPeso: " + peso +
                "\nAltura: " + altura;

    }

    public void generarDNI() {

        Random random = new Random();
        this.DNI = random.nextInt(90000000) + 10000000;

    }

}
