package com.Models;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.*;



@Getter
@Setter
@Entity
@Table (name="TblTipoTransporte")

public class TipoTransporte {
//Tabla TipoTransporte
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long CodigoTT;

 //Atributos
 @Column(name="NombreTT")
 private String NombreTT;

 @Column(name="TamanioTT")
 private String TamanioTT;

@Column(name="CapacidadTT")
 private String CapacidadTT;

 @Column(name="DescripcionTT")
 private String Descripcion;

 //Relaciones
 //Muchos tipos de trasnporte tiene un transporte
 @ManyToOne
 @JoinColumn(name = "CodigoTansporte")
 private Transporte transporte;








 

}
