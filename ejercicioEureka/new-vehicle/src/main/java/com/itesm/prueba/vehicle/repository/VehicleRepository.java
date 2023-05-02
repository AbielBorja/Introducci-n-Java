package com.itesm.prueba.vehicle.repository;

import com.itesm.prueba.vehicle.model.Vehicle;
import org.springframework.stereotype.Repository;

@Repository
public class VehicleRepository {

    public Vehicle findById(int id){
        Vehicle v= new Vehicle();
        v.setModel("2020");
        v.setVersion("Civic");
        v.setDescription("Civic Turbo");
        return v;
    }
}
