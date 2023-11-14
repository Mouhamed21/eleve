package sen.dak.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sen.dak.entities.Niveau_Entre;
import sen.dak.persistence.NiveauRepository;
import sen.dak.persistence.Niveau_EntreRepository;

import java.util.Collection;
import java.util.List;

@Service
public class Niveau_EntreService {
    @Autowired
    Niveau_EntreRepository niveauEntreRepository;
    public Collection<Niveau_Entre> getAllNiveauEntre(){
        return niveauEntreRepository.findAll();
    }

    public Niveau_Entre getNiveauEntre(Long id){
        return niveauEntreRepository.findById(id).get();
    }

    public Niveau_Entre addNiveauEntre(Niveau_Entre niveauEntre){
        return niveauEntreRepository.save(niveauEntre);
    }

    public Niveau_Entre updateNiveauEntre(Long id, Niveau_Entre niveauEntre){
        return niveauEntreRepository.save(niveauEntre);
    }

    public void deleteNiveauEntre(Long id){
        niveauEntreRepository.deleteById(id);
    }

    public void deleteSelectedNiveauEntre(List<Niveau_Entre> list){
        niveauEntreRepository.deleteAll(list);
    }
}
