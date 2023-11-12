
package com.mycompany.ejercicio_01;

/**
 *
 * @author Marlon
 */
public class Cuenta {
 
    
    private String nombre;
    private double saldo;
    private double acum=0.0;
    
    public Cuenta(String nombre , double saldo ){
        this.nombre=nombre;
        this.saldo=saldo;
    }
    
   public Cuenta( String nombre){
        this.nombre=nombre;
        this.saldo=0.0;
   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

   public void ingresar( double cantidad){
       
       if (cantidad>0) {
           saldo+=cantidad;
       }
       
   }
   
    public void retirar(double cantidad ){
        
        
        if ((saldo-cantidad)<0) {
             saldo=0;
        }else{
            saldo-=cantidad;
        }
        
    }
    
    public String toString( ){
        
        return " titular: "+this.nombre+", saldo: "+saldo;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
