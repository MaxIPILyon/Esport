package com.ipi.esport.pojos;

import jakarta.persistence.*;

@Entity
public class Joueur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String pseudo;

    @ManyToOne
    private Class_indiv_fifa class_indiv_fifa;

    @ManyToOne
    private Equipe_fifa equipe_fifa;

    @ManyToOne
    private Equipe_lol equipe_lol;

    @ManyToOne
    private Statistiques_lol statistiques_lol;

    public Joueur(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public Class_indiv_fifa getClass_indiv_fifa() {
        return class_indiv_fifa;
    }

    public void setClass_indiv_fifa(Class_indiv_fifa class_indiv_fifa) {
        this.class_indiv_fifa = class_indiv_fifa;
    }

    public Equipe_fifa getEquipe_fifa() {
        return equipe_fifa;
    }

    public void setEquipe_fifa(Equipe_fifa equipe_fifa) {
        this.equipe_fifa = equipe_fifa;
    }

    public Equipe_lol getEquipe_lol() {
        return equipe_lol;
    }

    public void setEquipe_lol(Equipe_lol equipe_lol) {
        this.equipe_lol = equipe_lol;
    }

    public Statistiques_lol getStatistiques_lol() {
        return statistiques_lol;
    }

    public void setStatistiques_lol(Statistiques_lol statistiques_lol) {
        this.statistiques_lol = statistiques_lol;
    }
}
