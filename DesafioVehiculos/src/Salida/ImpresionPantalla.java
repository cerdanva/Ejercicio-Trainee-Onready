/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salida;

/**
 *
 * @author Cerdan Victor Andres
 */
import Modelos.Moto;
import Modelos.Auto;
import Modelos.ListaVehiculos;


public class ImpresionPantalla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos varios objetos Vehiculos
        Auto A1 =new Auto(4, 200000, "Puegeot", "206");
        Auto A2 =new Auto(5, 250000, "Puegeot", "208");
        Moto M1 =new Moto("125cc",60000, "Honda", "Titan");
        Moto M2 =new Moto("160cc", 80500.50, "Yamaha", "YBR");
        //Creamos un objeto lista
        ListaVehiculos lista1 =new ListaVehiculos();
        //Agregamos los Vehiculos
        lista1.agregarVehiculo(A1);
        lista1.agregarVehiculo(A2);
        lista1.agregarVehiculo(M1);
        lista1.agregarVehiculo(M2);
        //litamos la lista
        lista1.mostrarLista();
        System.out.println("Vehiculo mas caro: "+lista1.buscarMasCaro().getMarca()+" "+lista1.buscarMasCaro().getModelo());
        System.out.println("Vehiculo mas barato: "+lista1.buscarMenorPrecio().getMarca()+" "+lista1.buscarMenorPrecio().getModelo());
        System.out.print("Vehículo que contiene en el modelo la letra ‘Y’: "+lista1.buscarModeloCon("Y").getMarca());
        System.out.println(" "+lista1.buscarModeloCon("Y").getModelo()+" "+lista1.buscarModeloCon("Y").getPrecio());
        //llamando a metodo de ordenamiento por precio
        System.out.println("Vehículos ordenados por precio de mayor a menor: ");
        lista1.OrdenarPorPrecio(lista1.listaVehiculos);
        
        
        
    }
}      
     
