package com.Models;
import java.sql.Time;
import java.util.List;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.*;


@Getter
@Setter
@Entity
@Table (name="TblRuta")

public class Ruta {

    //Tabla Ruta
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long CodigoRuta;
    
    //Atributos
    @Column(name="NombreRuta")
    private String NombreRuta;

    @Column(name="CallePrincipalRuta")
    private String CallePrincipalRuta;

    @Column(name="CalleSecundariaRuta")
    private String CalleSecundariaRuta;

    @Column(name="HoraRuta")
    private Time HoraRuta;

    @Column(name="DescripcionRuta")
    private String DescripcionRuta;

    //Relaciones
    //Muchas rutas tendra una agencia
    //Sera mapeado por el codigo de la agencia
    @ManyToOne
    @JoinColumn(name = "CodigoAgencia",nullable = false)
    private Agencia agencia;

    //Muchos envios entran una ruta
    @ManyToOne
    @JoinColumn(name = "CodigoEnvio",nullable=false)
    private Envio envio;

    //Una ruta tiene una lista de clientes
    @OneToMany(mappedBy = "ruta")
    private List<Cliente> clientes;

 
    




    

    


}
