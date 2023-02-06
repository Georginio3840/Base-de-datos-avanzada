package com.Models;

import java.util.List;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.*;


@Getter
@Setter
@Entity
@Table (name="TblAgencia")


public class Agencia {
    
  //Tabla Agencia
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long CodigoAgencia;


//Atributos
@Column(name="NombreAgencia")
private String NombreAgencia;

@Column(name="DireccionAgencia")
private String DireccionAgencia;

@Column(name="FonoAgencia")
private String FonoAgencia;

@Column(name="EmailAgencia")
private String EmailAgencia;

//Relaciones
//Muchas agencia estaran en una cuidad
//Sera mapeado por el codigo de cuidad
@ManyToOne
@JoinColumn(name = "CodigoCuidad",nullable = false)
private Cuidad cuidad;

//Una agencia tendra muchas rutas
//Una agencia tendra una lista de rutas 
@OneToMany(mappedBy = "agencia")
private List<Ruta> rutas;







  
}
