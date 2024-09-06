package com.ipi.esport.pojos;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Class_indiv_fifa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "joueur")
    private List<Joueur> joueurs;

    public Class_indiv_fifa() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Joueur> getJoueurs() {
        return joueurs;
    }

    public void setJoueurs(List<Joueur> joueurs) {
        this.joueurs = joueurs;
    }
}
