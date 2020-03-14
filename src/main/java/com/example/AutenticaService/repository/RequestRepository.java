package com.example.AutenticaService.repository;

import com.example.AutenticaService.domain.Request;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RequestRepository extends JpaRepository<Request,Long>{

}
