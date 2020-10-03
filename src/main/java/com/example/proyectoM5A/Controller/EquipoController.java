/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectoM5A.Controller;

import com.example.proyectoM5A.Modelo.Carrera;
import com.example.proyectoM5A.Modelo.Equipo;
import com.example.proyectoM5A.Servicio.EquipoService;
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
@RequestMapping("/equipo")
@CrossOrigin(origins="*")
public class EquipoController {
    @Autowired 
    EquipoService equiposervice;
    @PostMapping
    public ResponseEntity saveEquipo(@RequestBody Equipo equipo){
     
     return ResponseEntity.ok(equiposervice.crearEquipo(equipo));
    }
    
    @GetMapping(path= "/list")
    public ResponseEntity listEquipo(){
        
        return ResponseEntity.ok(equiposervice.ListarEquipo());
    }   
}
