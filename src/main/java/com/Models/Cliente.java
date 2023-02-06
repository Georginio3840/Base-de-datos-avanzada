package com.Models;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.*;


@Getter
@Setter
@Entity
@Table (name="TblCliente")

public class Cliente {
    

     //Tabla Ecomienda
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long CodigoCliente;

     //Atributos Cliente
     @Column(name="NombreCliente")
    private String NombreCliente;

    @Column(name="DireccionCliente")
    private String DireccionCliente;
    
    
    @Column(name="FonoCliente")
    private String FonoCliente;

    @Column(name="EmailCliente")
    private String EmailCliente;

    @Column(name="TipoCliente")
    private String TipoCliente;

    //Relaciones
    //Muchos clientes tienen una ruta
    @ManyToOne
    @JoinColumn(name = "CodigoRuta")
    private Ruta ruta;
    

    //Un cliente tendra una direccion
    @OneToOne
    @JoinColumn(name="CodigoDireccion")
    private Direccion direccion;



    

}
