package com.mycompany.ejercicio_04;

/**
 *
 * @author Marlon
 */
public class Raices {

    private double a;
    private double b;
    private double c;

    public Raices() {
        this.a = 0.0;
        this.b = 0.0;
        this.c = 0.0;
    }

    public Raices(double a, double b, double c) {

        this.a = a;
        this.b = b;
        this.c = c;
    }

    //calcular solucion Formula ecuación 2º grado: (-b±√((b^2)-(4*a*c)))/(2*a)
    public void calcularSolucion() {

        double disciminante = getDisciminante();//(b^2)-4*a*c

        if (disciminante >= 0) {

            double raiz1 = (-b + (Math.sqrt(disciminante))) / 2 * a;
            double raiz2 = (-b - (Math.sqrt(disciminante))) / 2 * a;
            System.out.println("Solucion =  raiz 1: " + raiz1 + " y raiz 2 : " + raiz2);
        } else {
            System.out.println("No hay soluciones REALES.");
        }

    }

    //discriminante
    public double getDisciminante() {

        return (b * b) - (4 * a * c);
    }

    public boolean tieneRaices() {
        return getDisciminante() >= 0;
    }

    public boolean tieneRaiz() {
        return getDisciminante() == 0;
    }
    public String toString( ){
        return "Coeficiente: a= "+a+", b="+b+" , c="+c;
    }
    

}
