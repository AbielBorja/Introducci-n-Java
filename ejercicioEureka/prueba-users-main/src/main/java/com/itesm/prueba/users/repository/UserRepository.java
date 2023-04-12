package com.itesm.prueba.users.repository;

import com.itesm.prueba.users.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public User findById(int id){
        User u= new User();
        u.setEmail("atorres@applab.mx");
        u.setName("Andres");
        return u;
    }
}
