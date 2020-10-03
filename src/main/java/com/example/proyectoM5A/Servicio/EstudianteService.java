/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectoM5A.Servicio;

import com.example.proyectoM5A.Modelo.Estudiante;
import com.example.proyectoM5A.Repository.EstudianteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jessica Alvarez
 */
@Service
public class EstudianteService {
    @Autowired
    EstudianteRepository estudianterepository;
        public Estudiante crearEstudiante(Estudiante estudiante){
        return estudianterepository.save(estudiante);
    }
    
    public List<Estudiante> ListarEstudiante(){
        return estudianterepository.findAll();
}
}
