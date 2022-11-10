package sen.dak.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sen.dak.entities.Classe;
import sen.dak.entities.Eleve;
import sen.dak.entities.Niveau;
import sen.dak.persistence.NiveauRepository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class NiveauService {
    @Autowired
    NiveauRepository niveauRepository;
    public Collection<Niveau> getAllNiveau(){
        return niveauRepository.findAll();
    }

    public Niveau getNiveau(Long id){
        return niveauRepository.findById(id).get();
    }

    public Niveau addNiveau(Niveau niveau){
        return niveauRepository.save(niveau);
    }

    public Niveau updateNiveau(Long id, Niveau niveau){
        return niveauRepository.save(niveau);
    }

    public void deleteNiveau(Long id){
        niveauRepository.deleteById(id);
    }

    public void deleteSelectedNiveau(List<Niveau> list){
        niveauRepository.deleteAll(list);
    }

}
