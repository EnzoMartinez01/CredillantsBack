package com.example.credillants.credillants.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.credillants.credillants.entity.TipoEntity;

@Repository
public interface TipoRepository extends JpaRepository<TipoEntity, Integer>{
	
}
