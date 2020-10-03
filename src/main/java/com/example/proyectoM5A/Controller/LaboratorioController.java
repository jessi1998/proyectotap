/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectoM5A.Controller;

import com.example.proyectoM5A.Modelo.Bitacora;
import com.example.proyectoM5A.Modelo.Laboratorio;
import com.example.proyectoM5A.Servicio.LaboratorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jessica Alvarez
 */
@RestController
@RequestMapping("/laboratorio")
@CrossOrigin(origins="*")
public class LaboratorioController {
    @Autowired
    LaboratorioService laboratorioservice;
    
    @PostMapping
    public ResponseEntity saveLaboratorio(@RequestBody Laboratorio laboratorio){
     
     return ResponseEntity.ok(laboratorioservice.crearLaboratorio(laboratorio));
    }
    
    @GetMapping(path= "/list")
    public ResponseEntity listLaboratorio(){
        
        return ResponseEntity.ok(laboratorioservice.listarLaboratorio());
    }
    
    
}
