package com.Models;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@Entity
@Table (name="Direccion")

public class Direccion {
    //Tabla direccion
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long CodigoDireccion;


    //Atributos
    @Column(name="CallePrincipalDireccion")
    private String CallePrincipalDireccion;

    @Column(name="CalleSecundariaDireccion")
    private String CalleSecundariaDireccion;
    
    @Column(name="ReferenciaDireccion")
    private String ReferenciaDireccion;

    @Column(name="DescripccionDireccion")
    private String DescripccionDireccion;

    //Un usuario tiene una direccion
    @OneToOne(mappedBy = "direccion")
    private Cliente cliente;


   




    


    
}
