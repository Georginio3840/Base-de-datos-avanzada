package com.Models;


import jakarta.persistence.*;
import lombok.*;



@Getter
@Setter
@Entity
@Table (name="TblPaquete")

public class Paquete {

    //Tabla ecomienda
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long CodigoPaquete;


    //Atributos
    @Column(name="NombrePaquete")
    private String NombrePaquete;

    @Column(name="DeclaracionPaquete")
    private String DeclaracionPaquete;

    //Ralaciones
    //Muchos paquetes tendra una encomienda
    @ManyToOne
    @JoinColumn(name = "CodigoEncomienda",nullable = false)
    private Encomienda encomienda;



    
}
