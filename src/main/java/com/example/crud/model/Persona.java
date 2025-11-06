package com.example.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Persona {
    @Id
    @GeneratedValue
    private Long id;
    private String nombre;

    public Long getID() {return id;}
    public void setId(Long id) {this.id = id;}

    // nombre
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
}
