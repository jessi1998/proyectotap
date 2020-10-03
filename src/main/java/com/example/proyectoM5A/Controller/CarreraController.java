/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectoM5A.Controller;

import com.example.proyectoM5A.Modelo.Asignatura;
import com.example.proyectoM5A.Modelo.Carrera;
import com.example.proyectoM5A.Servicio.CarreraService;
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
@RequestMapping("/carrera")
@CrossOrigin(origins="*")
public class CarreraController {
    @Autowired
   CarreraService carreraservice;

@PostMapping
    public ResponseEntity saveCarrera(@RequestBody Carrera carrera){
     
     return ResponseEntity.ok(carreraservice.crearCarrera(carrera));
    }
    
    @GetMapping(path= "/list")
    public ResponseEntity listCarrera(){
        
        return ResponseEntity.ok(carreraservice.ListarCarrera());
    }    
}
