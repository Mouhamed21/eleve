package sen.dak.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sen.dak.entities.Classe;
import sen.dak.persistence.ClasseRepository;

import java.util.Collection;
import java.util.Optional;

@Service
public class ClasseService {
    @Autowired
    ClasseRepository classeRepository;
    public Collection<Classe> getAllClasse(){
        return classeRepository.findAll();
    }
    public Classe addClasse(Classe classe){
        return classeRepository.save(classe);
    }

    public Optional<Classe>  getClasse(Long id){
        return classeRepository.findById(id);
    }

    public Classe updateClasse(Classe classe){
        return classeRepository.save(classe);
    }

    public void deleteClasse(Long id){
        classeRepository.deleteById(id);
    }
}
