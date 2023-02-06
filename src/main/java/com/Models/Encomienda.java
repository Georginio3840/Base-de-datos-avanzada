package com.Models;
import java.util.List;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.*;



@Getter
@Setter
@Entity
@Table (name="TblEncomienda")

public class Encomienda {
    
    //Tabla Ecomienda
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long CodigoEncomeinda;

    //Atributos
    @Column(name="NombreEncomienda")
    private String NombreEncomienda;

    @Column(name="DescripcionEncomienda")
    private String DescripcionEncomienda;

    @Column(name="EstadoEncomienda")
    private String EstadoEncomienda;

    //Relaciones
    //Muchas encomiendas existe un envio
    @ManyToOne
    @JoinColumn(name = "CodigoEnvio",nullable = false)
    private Envio envio;

    //Una encomienda tendra muchos paquetes
    @OneToMany(mappedBy = "encomienda")
    private List<Paquete> paquetes;


  
    


    
    



    



    
}
