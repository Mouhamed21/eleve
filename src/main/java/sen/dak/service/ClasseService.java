package sen.dak.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sen.dak.entities.Classe;
import sen.dak.persistence.ClasseRepository;

import java.util.*;

@Service
public class ClasseService {
    List<Classe> list;
    @Autowired
    ClasseRepository classeRepository;
    public Collection<Classe> getAllClasse(){
        return classeRepository.findAll();
    }
    public Classe addClasse(Classe classe){
        return classeRepository.save(classe);
    }

    public Classe  getClasse(Long id){
        return classeRepository.findById(id).get();
    }

    public Classe updateClasse(Long id,Classe classe){
        return classeRepository.save(classe);
    }

    public void deleteClasse(Long id){
        classeRepository.deleteById(id);
    }

    public void deleteAllClasse(){classeRepository.deleteAll();}

    public void deleteSelectedClasse(List<Classe> list){
        classeRepository.deleteAll(list);
    }
}
