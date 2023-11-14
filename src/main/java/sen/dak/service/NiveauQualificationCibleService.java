package sen.dak.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sen.dak.entities.NiveauQualificationCible;
import sen.dak.persistence.NiveauQualificationCibleRepository;
import java.util.Collection;
import java.util.List;

@Service
public class NiveauQualificationCibleService {
    @Autowired
    NiveauQualificationCibleRepository niveauQualificationCibleRepository;
    public Collection<NiveauQualificationCible> getAllNiveauQualificationCible(){
        return niveauQualificationCibleRepository.findAll();
    }

    public NiveauQualificationCible getNiveauQualificationCible(Long id){
        return niveauQualificationCibleRepository.findById(id).get();
    }

    public NiveauQualificationCible addNiveauQualificationCible(NiveauQualificationCible niveauQualificationCible){
        return niveauQualificationCibleRepository.save(niveauQualificationCible);
    }

    public NiveauQualificationCible updateNiveauQualificationCible(Long id, NiveauQualificationCible niveauQualificationCible){
        return niveauQualificationCibleRepository.save(niveauQualificationCible);
    }

    public void deleteNiveauniveauQualificationCible(Long id){
        niveauQualificationCibleRepository.deleteById(id);
    }

    public void deleteSelectedNiveauQualificationCible(List<NiveauQualificationCible> list){
        niveauQualificationCibleRepository.deleteAll(list);
    }
}
