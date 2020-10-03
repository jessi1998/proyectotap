/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectoM5A.Servicio;

import com.example.proyectoM5A.Modelo.Equipo;
import com.example.proyectoM5A.Repository.EquipoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jessica Alvarez
 */
@Service
public class EquipoService {
    @Autowired
    EquipoRepository equiporepository;
        public Equipo crearEquipo(Equipo equipo){
        return equiporepository.save(equipo);
    }
    
    public List<Equipo> ListarEquipo(){
        return equiporepository.findAll();
}
}
