package sen.dak.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sen.dak.entities.Formation;
import sen.dak.persistence.FormationRepository;

import java.util.Calendar;
import java.util.Collection;
import java.util.List;

@Service
public class FormationService {
    @Autowired
    FormationRepository formationRepository;

    public Collection<Formation> getAllFormation(){
        return formationRepository.findAll();
    }

    public Formation getFormation(Long id){
        return formationRepository.findById(id).get();
    }

    public Formation addFormation(Formation formation){
       // Calendar calendar = Calendar.getInstance();


        return formationRepository.save(formation);
    }

    public Formation updateFormation(Long id, Formation formation){
        return formationRepository.save(formation);
    }

    public void deleteFormation(Long id){
        formationRepository.deleteById(id);
    }

    public void deleteSelectedFormation(List<Formation> list){
        formationRepository.deleteAll(list);
    }
}
