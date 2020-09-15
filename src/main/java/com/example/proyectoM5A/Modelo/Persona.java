/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectoM5A.Modelo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Jessica Alvarez
 */
@Data

public class Persona {
    @Id
    private String cedula;
    private String nombre;
    private String apellido;
    private String email;
    private int edad;
    private String direccion;
    private String telefono;
    
    
}
