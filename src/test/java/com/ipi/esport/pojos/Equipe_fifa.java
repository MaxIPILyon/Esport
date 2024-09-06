package com.ipi.esport.pojos;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Equipe_fifa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;

    @OneToMany(mappedBy = "joueur")
    private List<Joueur> joueurs;

    @ManyToOne
    private Class_equipe_fifa class_equipe_fifa;

    public Equipe_fifa() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Joueur> getJoueurs() {
        return joueurs;
    }

    public void setJoueurs(List<Joueur> joueurs) {
        this.joueurs = joueurs;
    }

    public Class_equipe_fifa getClass_equipe_fifa() {
        return class_equipe_fifa;
    }

    public void setClass_equipe_fifa(Class_equipe_fifa class_equipe_fifa) {
        this.class_equipe_fifa = class_equipe_fifa;
    }
}
