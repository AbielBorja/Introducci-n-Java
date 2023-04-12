package com.itesm.prueba.users.service;


import com.itesm.prueba.users.clients.VehicleClientRest;
import com.itesm.prueba.users.dto.UserDTO;
import com.itesm.prueba.users.model.User;
import com.itesm.prueba.users.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    VehicleClientRest vehicleClientRest;

    public UserDTO findById(int id){
        User u= userRepository.findById(id);
        UserDTO userDTO= new UserDTO();
        userDTO.setName(u.getName());
        userDTO.setEmail(u.getEmail());
        userDTO.setVehicle(vehicleClientRest.findById(1));
        return userDTO;
    }
}
