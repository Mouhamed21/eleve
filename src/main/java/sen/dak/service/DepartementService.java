package sen.dak.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sen.dak.entities.Departement;
import sen.dak.persistence.DepartementRepository;
import java.util.Collection;
import java.util.List;

@Service
public class DepartementService {
    @Autowired
    DepartementRepository departementRepository;

    public Collection<Departement> getAllDepartement(){
        return departementRepository.findAll();
    }

    public Departement getDepartement(Long id){
        return departementRepository.findById(id).get();
    }

    public Departement addDepartement(Departement secteur){
        return departementRepository.save(secteur);
    }

    public Departement updateDepartement(Long id, Departement secteur){
        return departementRepository.save(secteur);
    }

    public void deleteDepartement(Long id){
        departementRepository.deleteById(id);
    }

    public void deleteSelectedDepartement(List<Departement> list){
        departementRepository.deleteAll(list);
    }
}
