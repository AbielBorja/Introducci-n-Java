package com.itesm.prueba.users.clients;

import com.itesm.prueba.users.dto.VehicleDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="vehicle-ms")
public interface VehicleClientRest {

    @GetMapping("/v1/vehicle/find/{id}")
    public VehicleDTO findById(@PathVariable("id") int id);
}
