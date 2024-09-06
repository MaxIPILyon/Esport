package com.ipi.esport.dao;

import com.ipi.esport.pojos.Class_equipe_fifa;
import com.ipi.esport.pojos.Equipe_fifa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Equipe_fifaDao extends JpaRepository<Equipe_fifa, Long> {
    Equipe_fifa findByNom(String nom);
    List<Equipe_fifa> findByClassEquipeFifa (Class_equipe_fifa class_equipe_fifa);
}
