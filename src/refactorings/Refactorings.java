/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package refactorings;

import java.util.List;

/**
 *
 * @author hquintana
 */
public class Refactorings {

    
    public static void main(String[] args) {
        // Se me pide calcular el espacio necesario en un almacen para la 
        // cantidad de drones.
        // La medida de un drone depende de su tipo. Si son de tipo 1 
        // miden 50 cm. Si son de tipo 2 miden 70cm. Si son del tipo 3
        // miden 60 cm.
        
        List<Drone> drones = DroneDAO.getInstance().obtenerDrones();
        List<TipoDrone> tipoDrones = DroneDAO.getInstance().obtenerTipoDrones();
        
        int tamano = new Refactorings().calcularEspacioAlmacen(drones, tipoDrones);
        
        System.out.println("El tamano necesario es de " + tamano);
    }
    
    
    // Utilizando Extract Method
    private int calcularEspacioAlmacen(List<Drone> drones, 
            List<TipoDrone> tipoDrones){
        int tamano = 0;
        for (Drone drone : drones){ 
            tamano += calcularEspacioDrone(drone);
        }
        
        return tamano;
    }
    
    
    //Utilizando Extract Method
    // Aplicar tecnica de Refactoring: Replace temp with Query 
    private int calcularEspacioDrone(Drone drone){
        if (drone.getTipoDrone().getId() == 1) {
            int stock = drone.getStock();
            return stock * 50;
        } else if (drone.getTipoDrone().getId() == 2) {
            int stock = drone.getStock();
            return drone.getStock() * 70;
        } else if (drone.getTipoDrone().getId() == 3) {
            int stock = drone.getStock();
            return drone.getStock() * 60;
        }else{
            return 0;
        }
    }
    
}
