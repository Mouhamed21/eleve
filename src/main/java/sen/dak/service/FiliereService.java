package sen.dak.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sen.dak.entities.Filiere;
import sen.dak.persistence.FiliereRepository;
import java.util.Collection;
import java.util.List;

@Service
public class FiliereService {
    @Autowired
    FiliereRepository filiereRepository;

    public Collection<Filiere> getAllFiliere(){
        return filiereRepository.findAll();
    }

    public Filiere getFiliere(Long id){
        return filiereRepository.findById(id).get();
    }

    public Filiere addFiliere(Filiere filiere){
        return filiereRepository.save(filiere);
    }

    public Filiere updateFiliere(Long id, Filiere filiere){
        return filiereRepository.save(filiere);
    }

    public void deleteFiliere(Long id){
        filiereRepository.deleteById(id);
    }

    public void deleteSelectedFiliere(List<Filiere> list){
        filiereRepository.deleteAll(list);
    }
}
