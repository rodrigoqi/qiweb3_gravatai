package com.qi.appcadastrocliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qi.appcadastrocliente.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
