package com.sistemas.apirest.services;

import java.util.List;

import com.sistemas.apirest.models.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(long id);
}
