package com.cibertec.angeles.cl3.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.angeles.cl3.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}

