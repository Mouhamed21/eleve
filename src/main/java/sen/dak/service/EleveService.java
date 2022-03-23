package sen.dak.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sen.dak.entities.Eleve;
import sen.dak.persistence.EleveRepository;

import java.util.Collection;

@Service
public class EleveService {
    @Autowired
    EleveRepository eleveRepository;
    public Collection<Eleve> getAllEleve(){
        return eleveRepository.findAll();
    }

    public Eleve addEleve(Eleve eleve){
        return eleveRepository.save(eleve);
    }
}
