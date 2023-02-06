package com.Models;
import java.util.List;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.*;



@Getter
@Setter
@Entity
@Table (name="TblTransporte")

public class Transporte {
    //Tabla Transporte
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long CodigoTransporte;
    
    //Atributos
    @Column(name="NombreTransporte")
    private String NombreTransporte;

    @Column(name="EncargadoTransporte")
    private String EncargadoTransporte;

    //Relaciones
    //Muchos trasnportes tendran un envio
    @ManyToOne
    @JoinColumn(name = "CodigoEnvio",nullable = false)
    private Envio envio;

    //Un transporte tendra una lista de tipo de trasnporte
    @OneToMany(mappedBy = "transporte")
    private List<TipoTransporte> tipoTransportes;




    
}
