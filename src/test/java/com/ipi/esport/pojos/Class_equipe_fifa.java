package com.ipi.esport.pojos;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Class_equipe_fifa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int valeurClassement;

    @OneToMany(mappedBy = "ClassEquipeFifa")
    private List<Equipe_fifa> equipe_fifa;

    public Class_equipe_fifa(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getValeurClassement() {
        return valeurClassement;
    }

    public void setValeurClassement(int valeurClassement) {
        this.valeurClassement = valeurClassement;
    }

    public List<Equipe_fifa> getEquipe_fifa() {
        return equipe_fifa;
    }

    public void setEquipe_fifa(List<Equipe_fifa> equipe_fifa) {
        this.equipe_fifa = equipe_fifa;
    }
}
