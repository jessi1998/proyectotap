/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectoM5A.Controller;

import com.example.proyectoM5A.Modelo.Asignatura;
import com.example.proyectoM5A.Modelo.Bitacora;
import com.example.proyectoM5A.Servicio.BitacoraService;
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
@RequestMapping("/bitacora")
@CrossOrigin(origins="*")
public class BitacoraController {
    @Autowired
    BitacoraService bitacoraservice;
    @PostMapping
    public ResponseEntity saveBitacora(@RequestBody Bitacora bitacora){
     
     return ResponseEntity.ok(bitacoraservice.crearBitacora(bitacora));
    }
    
    @GetMapping(path= "/list")
    public ResponseEntity listBitacora(){
        
        return ResponseEntity.ok(bitacoraservice.ListarBitacora());
    }
    
}
