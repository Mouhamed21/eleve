package sen.dak.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sen.dak.entities.Secteur;
import sen.dak.persistence.SecteurRepository;

import java.util.Collection;
import java.util.List;

@Service
public class SecteurService {
    @Autowired
    SecteurRepository secteurRepository;

    public Collection<Secteur> getAllSecteur(){
        return secteurRepository.findAll();
    }

    public Secteur getSecteur(Long id){
        return secteurRepository.findById(id).get();
    }

    public Secteur addSecteur(Secteur secteur){
        return secteurRepository.save(secteur);
    }

    public Secteur updateSecteur(Long id, Secteur secteur){
        return secteurRepository.save(secteur);
    }

    public void deleteSecteur(Long id){
        secteurRepository.deleteById(id);
    }

    public void deleteSelectedSecteur(List<Secteur> list){
        secteurRepository.deleteAll(list);
    }
}
