package com.ipi.esport.services;

import com.ipi.esport.pojos.Joueur;

import java.util.List;

public interface JoueurService {

    Joueur recupererJoueur(Long idJoueur);

    List<Joueur> recupererJoueurs();

}
