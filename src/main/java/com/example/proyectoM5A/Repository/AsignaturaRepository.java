/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectoM5A.Repository;

import com.example.proyectoM5A.Modelo.Asignatura;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jessica Alvarez
 */
@Repository
public interface AsignaturaRepository extends MongoRepository<Asignatura,String>{
    
}
