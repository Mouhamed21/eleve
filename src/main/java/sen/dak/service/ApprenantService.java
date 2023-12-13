package sen.dak.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sen.dak.entities.Apprenant;
import sen.dak.persistence.ApprenantRepository;
import java.util.Collection;
import java.util.List;

@Service
public class ApprenantService {
    @Autowired
    ApprenantRepository apprenantRepository;


    public Collection<Apprenant> getAllApprenant(){
        return apprenantRepository.findAll();
    }

    public Apprenant getApprenant(Long id){
        return apprenantRepository.findById(id).get();
    }

    public Apprenant addApprenant(Apprenant apprenant){
        return apprenantRepository.save(apprenant);
    }

    public Apprenant updateApprenant(Long id, Apprenant apprenant){
        return apprenantRepository.save(apprenant);
    }

    public void deleteApprenant(Long id){
        apprenantRepository.deleteById(id);
    }

    public void deleteSelectedApprenant(List<Apprenant> list){
        apprenantRepository.deleteAll(list);
    }
}
