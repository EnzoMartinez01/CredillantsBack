package com.example.credillants.credillants.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.credillants.credillants.entity.MarcaEntity;

@Repository
public interface MarcarRepository extends JpaRepository<MarcaEntity, Integer>{

}
