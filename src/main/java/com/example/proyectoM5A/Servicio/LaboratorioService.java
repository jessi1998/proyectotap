/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectoM5A.Servicio;

import com.example.proyectoM5A.Modelo.Laboratorio;
import com.example.proyectoM5A.Repository.LaboratorioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jessica Alvarez
 */
@Service
public class LaboratorioService {
    @Autowired
    LaboratorioRepository laboratoriorepository;
    
        public Laboratorio crearLaboratorio(Laboratorio laboratorio){
        return laboratoriorepository.save(laboratorio);
    }
    
    public List<Laboratorio> listarLaboratorio(){
        return laboratoriorepository.findAll();
}
    
}
