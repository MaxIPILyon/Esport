package com.ipi.esport.dao;

import com.ipi.esport.pojos.Equipe_lol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Equipe_lolDao extends JpaRepository<Equipe_lol, Long> {
    Equipe_lol findByNom(String nom);
}
