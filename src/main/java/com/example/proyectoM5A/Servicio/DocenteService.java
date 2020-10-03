/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectoM5A.Servicio;

import com.example.proyectoM5A.Modelo.Docente;
import com.example.proyectoM5A.Repository.DocenteReposotory;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jessica Alvarez
 */
@Service
public class DocenteService {
    @Autowired
    DocenteReposotory docenterepository;
        public Docente crearDocente(Docente docente){
        return docenterepository.save(docente);
    }
    
    public List<Docente> ListarDocente(){
        return docenterepository.findAll();
}
}
