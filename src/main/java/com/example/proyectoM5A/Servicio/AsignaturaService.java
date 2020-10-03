/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectoM5A.Servicio;

import com.example.proyectoM5A.Modelo.Asignatura;
import com.example.proyectoM5A.Repository.AsignaturaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jessica Alvarez
 */
@Service
public class AsignaturaService {
    @Autowired
    AsignaturaRepository asignaturarespository;
    
        public Asignatura crearAsignatura(Asignatura asignatura){
        return asignaturarespository.save(asignatura);
    }
    
    public List<Asignatura> ListarAsignatura(){
        return asignaturarespository.findAll();
}
}
