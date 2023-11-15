package sen.dak.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sen.dak.entities.CentreReference;
import sen.dak.entities.NiveauQualificationCible;
import sen.dak.persistence.CentreReferenceRepository;

import java.util.Collection;
import java.util.List;

@Service
public class CentreReferenceService {

    @Autowired
    CentreReferenceRepository centreReferenceRepository;

    public Collection<CentreReference> getAllCentreReference(){
        return centreReferenceRepository.findAll();
    }

    public CentreReference getCentreReference(Long id){
        return centreReferenceRepository.findById(id).get();
    }

    public CentreReference addCentreReference(CentreReference centreReference){
        return centreReferenceRepository.save(centreReference);
    }

    public CentreReference updateCentreReference(Long id, CentreReference centreReference){
        return centreReferenceRepository.save(centreReference);
    }

    public void deleteCentreReference(Long id){
        centreReferenceRepository.deleteById(id);
    }

    public void deleteSelectedCentreReference(List<CentreReference> list){
        centreReferenceRepository.deleteAll(list);
    }
}
