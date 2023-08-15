package com.cibertec.angeles.cl3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="producto")
@AllArgsConstructor//en lugar de hacer un constructor con parametros(por el uso del lombok)
@NoArgsConstructor// Constructor sin parametros
@Getter//en lugar de hacer un constructor (por el uso del lombok)
@Setter//en lugar de hacer un constructor(por el uso del lombok)
@ToString // con el lombok En dependencia dentro del pom y activado para el framework
public class Producto {
	@Id //campo identificador
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private double precio;
	private int cantidad;

}
