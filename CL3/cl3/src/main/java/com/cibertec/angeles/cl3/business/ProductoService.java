package com.cibertec.angeles.cl3.business;

import java.util.List;

import com.cibertec.angeles.cl3.model.Producto;

public interface ProductoService {
	List<Producto> listaProducto();
	void registrarProducto(Producto producto);
	Producto listaProductoPorId(int id);
	void eliminarProducto(int id);

}
