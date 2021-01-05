/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.Arrays;

/**
 *
 * @author Cerdan Victor Andres
 */
public class ListaVehiculos {
    
    public Vehiculo listaVehiculos[];
    private static final int maxVehiculos=4;
    private static int contadorVehiculos;

    public ListaVehiculos() {
        listaVehiculos= new Vehiculo[maxVehiculos];
    }
      
    public void agregarVehiculo(Vehiculo vehiculo) {
        //Si los vehiculos agregados no superan al máximo
        //agregamos el nuevo vehuculo
        if(contadorVehiculos<maxVehiculos) {
            //Agregamos el nuevo producto al arreglo
            //e incrementamos el contador
            listaVehiculos[contadorVehiculos++] =vehiculo;
        }
        else{
            System.out.println("Se ha superado el máximo de vehiculos: "+maxVehiculos);
        }
    }
    public void mostrarLista(){
        
        for(int i =0; i <contadorVehiculos; i++) {
            System.out.println(listaVehiculos[i].toString()+"// precio: $"+listaVehiculos[i].getPrecio());
        }
    }
   
    public Vehiculo buscarModeloCon(String letra){
        String modelo;
        int iMax=0;
        boolean encontrado=false;
        int i=0;
        while (i<maxVehiculos && !encontrado){
            modelo=listaVehiculos[i].getModelo();
            if (modelo.indexOf(letra)==0){
                encontrado=true;
                iMax=i;
                return listaVehiculos[iMax];
            }
            i++;
        }
        return listaVehiculos[iMax];
    }
    public Vehiculo buscarMasCaro(){
        int iMax=0;
        double mayorPrecio=0.0;
        
        for (int i=0;i<maxVehiculos;i++){
            if (mayorPrecio<this.listaVehiculos[i].getPrecio()){
                iMax=i;
                mayorPrecio=this.listaVehiculos[i].getPrecio();
                
            }
        }
        return listaVehiculos[iMax];
    }
    public Vehiculo buscarMenorPrecio(){
        int iMin=0;
        double menorPrecio=100000000.0;
        
        for (int i=0;i<maxVehiculos;i++){
            if (menorPrecio>this.listaVehiculos[i].getPrecio()){
                iMin=i;
                menorPrecio=this.listaVehiculos[i].getPrecio();
                
            }
        }
        return listaVehiculos[iMin];
    }
    private static void permutar(Vehiculo[] a,int i,int j){
        Vehiculo t;
        t = a[i];
        a[i] = a[j];
        a[j] = t;
    
    }
    public static void mostrarOrdenados(Vehiculo[] lista){
        for (int i = 0; i <maxVehiculos; i++)
            System.out.println(lista[i].getMarca()+" "+lista[i].getModelo());
    }
    public void OrdenarPorPrecio(Vehiculo[] lista){
        int n = lista.length;
        for (int i = 0; i <= n - 2; i++)
            for (int j = n - 1; j > i; j--)
                if (lista[j - 1].getPrecio() < lista[j].getPrecio()){
                    permutar(lista, j - 1, j);
                }
        
        mostrarOrdenados(lista);
    }
}   
    
    

