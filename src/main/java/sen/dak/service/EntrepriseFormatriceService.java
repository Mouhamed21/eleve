package sen.dak.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sen.dak.entities.EntrepriseFormatrice;
import sen.dak.persistence.EntrepriseFormatriceRepository;

import java.util.Collection;
import java.util.List;

@Service
public class EntrepriseFormatriceService {
    @Autowired
    EntrepriseFormatriceRepository entrepriseFormatriceRepository;

    public Collection<EntrepriseFormatrice> getAllEntrepriseFormatrice(){
        return entrepriseFormatriceRepository.findAll();
    }

    public EntrepriseFormatrice getEntrepriseFormatrice(Long id){
        return entrepriseFormatriceRepository.findById(id).get();
    }

    public EntrepriseFormatrice addEntrepriseFormatrice(EntrepriseFormatrice niveauEntre){
        return entrepriseFormatriceRepository.save(niveauEntre);
    }

    public EntrepriseFormatrice updateEntrepriseFormatrice(Long id, EntrepriseFormatrice niveauEntre){
        return entrepriseFormatriceRepository.save(niveauEntre);
    }

    public void deleteEntrepriseFormatrice(Long id){
        entrepriseFormatriceRepository.deleteById(id);
    }

    public void deleteSelectedEntrepriseFormatrice(List<EntrepriseFormatrice> list){
        entrepriseFormatriceRepository.deleteAll(list);
    }
}
