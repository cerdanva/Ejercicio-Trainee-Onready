/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Cerdan Victor Andres
 */
public class Moto extends Vehiculo {
    private String cilindrada;
    

    public Moto(String cilindrada, double precio, String marca, String modelo) {
        super(marca, modelo,precio);
        this.cilindrada = cilindrada;
        
    }
  
    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    
    @Override
    public String toString() {
        return super.toString()+ "//Cilindrada: "+cilindrada;
    }
  
}
