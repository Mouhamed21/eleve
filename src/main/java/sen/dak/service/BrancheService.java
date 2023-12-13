package sen.dak.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sen.dak.entities.Branche;
import sen.dak.persistence.BrancheRepository;

import java.util.Collection;
import java.util.List;

@Service
public class BrancheService {

    @Autowired
    BrancheRepository brancheRepository;


    public Collection<Branche> getAllBranche(){
        return brancheRepository.findAll();
    }

    public Branche getBranche(Long id){
        return brancheRepository.findById(id).get();
    }

    public Branche addBranche(Branche branche){
        return brancheRepository.save(branche);
    }

    public Branche updateBranche(Long id, Branche branche){
        return brancheRepository.save(branche);
    }

    public void deleteBranche(Long id){
        brancheRepository.deleteById(id);
    }

    public void deleteSelectedBranche(List<Branche> list){
        brancheRepository.deleteAll(list);
    }

}
