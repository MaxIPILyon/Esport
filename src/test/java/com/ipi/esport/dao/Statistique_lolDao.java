package com.ipi.esport.dao;

import com.ipi.esport.pojos.Equipe_fifa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Statistique_lolDao extends JpaRepository<Equipe_fifa, Long> {

    Statistique_lolDao findByKills(int kills);
    Statistique_lolDao findBydeaths(int deaths);
    Statistique_lolDao findByAssist(int assist);

}
