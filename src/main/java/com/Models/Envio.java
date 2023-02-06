package com.Models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;




@Getter
@Setter
@Entity
@Table (name="TblEnvio")


//Tabla de envio 
public class Envio {

    //Atributos 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long CodigoEnvio;

    @Column(name = "FechaEnvio")
    private Date  FechaEnvio;


    @Column(name="TipoEnvio")
    private String TipoEnvio;

    @Column (name="InstanciaEnvio")
    private String InstanciaEnvio;

    //Relaciones 
    //Un envio tendra una lista de rutas 
    @OneToMany(mappedBy = "envio")
    private List<Ruta>rutas;
    //Un envio tiene una lista de encomiendas
    @OneToMany(mappedBy = "envio")
    private List <Encomienda> encomiendas;

    //Un envio tiene una lista de trasnportes
    @OneToMany(mappedBy = "envio")
    private List <Transporte> transportes;

   
    
    


    








    
}
