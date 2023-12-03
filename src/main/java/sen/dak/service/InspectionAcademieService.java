package sen.dak.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sen.dak.entities.InspectionAcademie;
import sen.dak.persistence.InspectionAcademieRepository;

import java.util.Collection;
import java.util.List;

@Service
public class InspectionAcademieService {

    @Autowired
    InspectionAcademieRepository inspectionAcademieRepository;

    public Collection<InspectionAcademie> getAllInspectionAcademie(){
        return inspectionAcademieRepository.findAll();
    }

    public InspectionAcademie getInspectionAcademie(Long id){
        return inspectionAcademieRepository.findById(id).get();
    }

    public InspectionAcademie addInspectionAcademie(InspectionAcademie inspectionAcademie){
        return inspectionAcademieRepository.save(inspectionAcademie);
    }

    public InspectionAcademie updateInspectionAcademie(Long id, InspectionAcademie inspectionAcademie){
        return inspectionAcademieRepository.save(inspectionAcademie);
    }

    public void deleteInspectionAcademie(Long id){
        inspectionAcademieRepository.deleteById(id);
    }

    public void deleteSelectedInspectionAcademie(List<InspectionAcademie> list){
        inspectionAcademieRepository.deleteAll(list);
    }
}
