package sen.dak.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sen.dak.entities.Metier;
import sen.dak.persistence.MetierRepository;
import java.util.Collection;
import java.util.List;

@Service
public class MetierService {
    @Autowired
    MetierRepository metierRepository;

    public Collection<Metier> getAllMetier(){
        return metierRepository.findAll();
    }

    public Metier getMetier(Long id){
        return metierRepository.findById(id).get();
    }

    public Metier addMetier(Metier metier){
        return metierRepository.save(metier);
    }

    public Metier updateMetier(Long id, Metier metier){
        return metierRepository.save(metier);
    }

    public void deleteMetier(Long id){
        metierRepository.deleteById(id);
    }

    public void deleteSelectedMetier(List<Metier> list){
        metierRepository.deleteAll(list);
    }
}
