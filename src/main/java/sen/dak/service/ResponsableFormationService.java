package sen.dak.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sen.dak.entities.ResponsableFormation;
import sen.dak.persistence.ResponsableFormationRepository;
import java.util.Collection;
import java.util.List;

@Service
public class ResponsableFormationService {
    @Autowired
    ResponsableFormationRepository responsableFormationRepository;

    public Collection<ResponsableFormation> getAllResponsableFormation(){
        return responsableFormationRepository.findAll();
    }

    public ResponsableFormation getResponsableFormation(Long id){
        return responsableFormationRepository.findById(id).get();
    }

    public ResponsableFormation addResponsableFormation(ResponsableFormation responsableFormation){
        return responsableFormationRepository.save(responsableFormation);
    }

    public ResponsableFormation updateResponsableFormation(Long id, ResponsableFormation responsableFormation){
        return responsableFormationRepository.save(responsableFormation);
    }

    public void deleteResponsableFormation(Long id){
        responsableFormationRepository.deleteById(id);
    }

    public void deleteSelectedResponsableFormation(List<ResponsableFormation> list){
        responsableFormationRepository.deleteAll(list);
    }
}
