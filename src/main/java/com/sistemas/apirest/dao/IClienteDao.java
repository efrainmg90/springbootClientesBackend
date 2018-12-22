package com.sistemas.apirest.dao;

import org.springframework.data.repository.CrudRepository;

import com.sistemas.apirest.models.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
