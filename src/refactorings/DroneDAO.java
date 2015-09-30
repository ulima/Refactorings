/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package refactorings;

import java.util.ArrayList;
import java.util.List;

public class DroneDAO {
    private static  DroneDAO singleton = null;
    
    public static DroneDAO getInstance(){
        if (singleton == null){
            singleton = new DroneDAO();
        }
        return singleton;
    }
    
    public List<TipoDrone> obtenerTipoDrones(){
        List<TipoDrone> tipoDrones = new ArrayList<TipoDrone>();
        TipoDrone tipoDrone1 = new TipoDrone(1l, "Tipo Drone 1");
        TipoDrone tipoDrone2 = new TipoDrone(2l, "Tipo Drone 2");
        TipoDrone tipoDrone3 = new TipoDrone(3l, "Tipo Drone 3");
        
        tipoDrones.add(tipoDrone1);
        tipoDrones.add(tipoDrone2);
        tipoDrones.add(tipoDrone3);
        
        return tipoDrones;
    }
    
    public List<Drone> obtenerDrones(){
        TipoDrone tipoDrone1 = new TipoDrone(1l, "Tipo Drone 1");
        TipoDrone tipoDrone2 = new TipoDrone(2l, "Tipo Drone 2");
        TipoDrone tipoDrone3 = new TipoDrone(3l, "Tipo Drone 3");
        
        List<Drone> drones = new ArrayList<Drone>();
        Drone drone1 = new Drone(1l, "12/12/2014", 10, tipoDrone1);
        Drone drone2 = new Drone(2l, "12/01/2015", 15, tipoDrone2);
        Drone drone3 = new Drone(3l, "12/02/2015", 12, tipoDrone3);
        Drone drone4 = new Drone(4l, "12/03/2015", 11, tipoDrone2);
        Drone drone5 = new Drone(5l, "12/05/2015", 9, tipoDrone1);
        
        drones.add(drone1);
        drones.add(drone2);
        drones.add(drone3);
        drones.add(drone4);
        drones.add(drone5);
        
        return drones;
    }
    
}
