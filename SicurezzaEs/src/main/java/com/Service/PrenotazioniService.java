package com.Service;

import com.Entity.Prenotazioni;
import com.Entity.Visita;
import com.Repository.PrenotazioniRepository;
import com.Repository.VisitaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class PrenotazioniService {
    @Autowired
    PrenotazioniRepository repo;
    @Autowired
    VisitaRepository Vrepo;
    public List<Prenotazioni> getAll(){
        return repo.findAll();
    }

    public Prenotazioni add(Prenotazioni obj){
        ArrayList<Prenotazioni> prenotazioni = (ArrayList<Prenotazioni>) repo.findAll();
        Visita visita = Vrepo.findById(obj.getIdVisita().getId()).orElse(null);
        LocalDate data = obj.getData();
        for(int i = 0; i<prenotazioni.toArray().length; i++){
            if(prenotazioni.get(i).getIdVisita().getId() == obj.getIdVisita().getId()){

            }if (prenotazioni.get(i).getData().isEqual(data)){
                return null;
            }else if(prenotazioni.get(i).getData().isBefore(data)){
                return null;
            }

        }
        return repo.save(obj);
    }
    public Prenotazioni update(Prenotazioni obj){
        return repo.save(obj);
    }

    public String delete(int id){
        repo.deleteById(id);
        return "Eliminazione avvenuta con successo!";
    }

    public Prenotazioni getById(int id){
        return repo.findById(id).orElse(null);
    }
}
