

package com.mycompany.ejercicio_02;

/**
 *
 * @author Marlon
 */
public class Ejercicio_02 {

    public static void main(String[] args) {
       
        
        Arreglo miArray = new Arreglo(5);
        //llenar el array del 1 al 10
        miArray.llenarArray(1, 10);
        //mostrar el array
        System.out.println("Array inicial : "+miArray);
        
        //sumar numeros mayores a 5 y restar los numeros menores o iguales a 5
        int result=miArray.valorMayorX(5);
        System.out.println("Suma x=5 : "+result);
        
        
        
        
        
    }
}
