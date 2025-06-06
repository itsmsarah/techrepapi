package com.techrep.apitechrep.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techrep.apitechrep.entity.Usuarioentity;

public interface Usuariorepository extends JpaRepository<Usuarioentity, Integer> {

}
