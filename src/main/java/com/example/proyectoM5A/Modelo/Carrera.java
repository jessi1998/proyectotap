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
public class Carrera {
@Id
private String id_carrera;
private String nombre_carrera;
private String modalidad_carrera;
private String jornada_carrera;
private List<Nivel> listanivel;
}
