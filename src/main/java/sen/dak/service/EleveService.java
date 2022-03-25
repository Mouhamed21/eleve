package sen.dak.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sen.dak.entities.Eleve;
import sen.dak.persistence.EleveRepository;

import java.util.Collection;
import java.util.Optional;

@Service
public class EleveService {
    @Autowired
    EleveRepository eleveRepository;
    public Collection<Eleve> getAllEleve(){
        return eleveRepository.findAll();
    }

    public Optional<Eleve> getEleve(Long id){
        return eleveRepository.findById(id);
    }

    public Eleve addEleve(Eleve eleve){
        return eleveRepository.save(eleve);
    }

    public Eleve updateEleve(Eleve eleve){
        return eleveRepository.save(eleve);
    }

    public void deleteEleve(Long id){
         eleveRepository.deleteById(id);
    }
}
