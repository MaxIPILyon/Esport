package com.ipi.esport.dao;

import com.ipi.esport.pojos.Class_equipe_fifa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Class_equipe_fifaDao extends JpaRepository<Class_equipe_fifa, Long> {

    Class_equipe_fifa findByValeur(int valeurClassement);

}
