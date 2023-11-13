package com.mycompany.ejercicio_02;

import java.util.Arrays;
import java.util.Random;

public class Arreglo {

    private int[] arreglo;
   

    public Arreglo(int tam) {

        this.arreglo = new int[tam];

    }
    //llenar el array
    public void llenarArray(int x1 , int x2 ){
        Random random= new Random();
        
        for (int i = 0; i < arreglo.length; i++) {
            
            arreglo[i]=random.nextInt(x2-x1+1)+x1;
        }
        
    }
    
    //suma los valores mayores a x y resta los valores menoreso  iguales a y
    public int valorMayorX( int x){
        int suma=0;
        for( int valor:arreglo){
            if (valor>x) {
                suma+=valor;
            }else{
                suma-=valor;
            }
        }
        
        return suma;
    }

    
    
    //mostrar el array 
    
    public String toString( ){
        return " "+Arrays.toString(arreglo)+" ";
    }
    
    
  
    
    

}
