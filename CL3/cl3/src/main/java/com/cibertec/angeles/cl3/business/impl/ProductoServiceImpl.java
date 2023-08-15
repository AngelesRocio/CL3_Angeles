package com.cibertec.angeles.cl3.business.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cibertec.angeles.cl3.business.ProductoService;
import com.cibertec.angeles.cl3.dao.ProductoRepository;
import com.cibertec.angeles.cl3.model.Producto;


import lombok.AllArgsConstructor;

@Service//es para indicarle a spring que se va a trabajr a nivel de servicio
@AllArgsConstructor
public class ProductoServiceImpl implements ProductoService {
	
	private ProductoRepository repository;

	@Override
	public List<Producto> listaProducto() {
		return repository.findAll();
	}

	@Override
	public void registrarProducto(Producto producto) {
		repository.save(producto);	
	}

	@Override
	public Producto listaProductoPorId(int id) {
		Optional<Producto> objeto = repository.findById(id);
		Producto producto = null;
		if(objeto.isPresent()) {
			producto = objeto.get();
		}else {
			throw new RuntimeException("Producto con el Id "+ id +" No fue encontrado!!");
		}
		return producto;
	}

	@Override
	public void eliminarProducto(int id) {
		repository.deleteById(id);
		
	}

}
