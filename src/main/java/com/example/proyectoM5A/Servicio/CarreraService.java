/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectoM5A.Servicio;

import com.example.proyectoM5A.Modelo.Carrera;
import com.example.proyectoM5A.Repository.CarreraRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jessica Alvarez
 */
@Service
public class CarreraService {
    @Autowired
    CarreraRepository carrerarepository;
    public Carrera crearCarrera(Carrera carrera){
        return carrerarepository.save(carrera);
    }
    
    public List<Carrera> ListarCarrera(){
        return carrerarepository.findAll();
}    
    
}
