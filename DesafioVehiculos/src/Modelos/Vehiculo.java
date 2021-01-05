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
public class Vehiculo {
    private String marca;
    private String modelo;
    private double precio;

    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio=precio;
      
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }
    
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public String toString() {
        return "Marca: "+marca+" // Modelo: "+ modelo;
    } 
    public int compararPrecio(Vehiculo v){
        int estado=-1;
	if(this.precio==v.getPrecio()){
            //Los objetos son iguales
            estado=0;
	}else if(this.precio>v.precio){
            //El objeto 1 es mayor que la pasada por parametro
            estado=1;
	}
			return estado;

	}
}
