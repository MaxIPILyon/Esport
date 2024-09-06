package com.ipi.esport.dao;

import com.ipi.esport.pojos.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JoueurDao extends JpaRepository<Joueur, Long> {

    List<Joueur> findByClassIndivFifa(Class_indiv_fifa class_indiv_fifa);

    List<Joueur> findByEquipeFifa (Equipe_fifa equipe_fifa);

    List<Joueur> findByEquipeLol (Equipe_lol equipe_lol);

    List<Joueur> findByStatistiques_lol (Statistiques_lol statistiques_lol);

}
