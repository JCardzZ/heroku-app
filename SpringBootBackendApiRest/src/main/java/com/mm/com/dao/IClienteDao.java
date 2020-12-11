package com.mm.com.dao;

import org.springframework.data.repository.CrudRepository;

import com.mm.com.entity.Cliente;

public interface IClienteDao  extends CrudRepository<Cliente, Long>{

}
