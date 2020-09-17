/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectoM5A.Modelo;

import java.util.List;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Jessica Alvarez
 */
@Data
@Document
public class Estudiante {
    @Id
    private String fechaIngreso;
    private List<Persona> listapersona;
    private List<Equipo> listaequipo;
    private List<Curso> listacurso;
    private List<Carrera> listacarrera;
}
