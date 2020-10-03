/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectoM5A.Servicio;

import com.example.proyectoM5A.Modelo.Bitacora;
import com.example.proyectoM5A.Repository.BitacoraRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jessica Alvarez
 */
@Service
public class BitacoraService {
    @Autowired
    BitacoraRepository bitacorarepository;
    
        public Bitacora crearBitacora(Bitacora bitacora){
        return bitacorarepository.save(bitacora);
    }
    
    public List<Bitacora> ListarBitacora(){
        return bitacorarepository.findAll();
}
}
