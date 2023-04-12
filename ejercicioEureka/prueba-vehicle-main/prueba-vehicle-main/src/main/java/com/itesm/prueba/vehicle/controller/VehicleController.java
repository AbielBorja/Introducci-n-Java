package com.itesm.prueba.vehicle.controller;


import com.itesm.prueba.vehicle.model.Vehicle;
import com.itesm.prueba.vehicle.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/v1/vehicle")
public class VehicleController {

    @Autowired
    VehicleService vehicleService;


    @GetMapping(path="/find/{id}",produces = "application/json")
    public ResponseEntity<Vehicle> findById(@PathVariable("id") int id){
        return new ResponseEntity<>(vehicleService.findById(id), HttpStatus.OK);
    }
}
