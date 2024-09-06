package com.ipi.esport.services;

import com.ipi.esport.pojos.Class_equipe_fifa;

import java.util.List;

public interface Class_equipe_fifaService {

    Class_equipe_fifa recupererClassEquipeFifa (Long idClassEquipeFifa);

    List<Class_equipe_fifa> recupererClassEquipesFifa();
}
