package com.itesm.prueba.vehicle.service;

import com.itesm.prueba.vehicle.model.Vehicle;
import com.itesm.prueba.vehicle.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    @Autowired
    VehicleRepository vehicleRepository;

    public Vehicle findById(int id){
        return vehicleRepository.findById(id);
    }

}
