package com.Models;


import java.util.List;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.*;


@Getter
@Setter
@Entity
@Table (name="TblCuidad")

public class Cuidad {
//Tabla Cuidad
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long CodigoCuidad;

 //Atributos
 @Column(name="NombreCuidad")
 private String NombreCuidad;


@Column(name="RegionCuidad")
private String RegionCuidad;

//Relacion

//Una cuidad tiene muchas agencias
//Una cuidad va a tener una lista de agencias
@OneToMany(mappedBy = "cuidad")
private List<Agencia> agencias;







}
