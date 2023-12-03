package sen.dak.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sen.dak.entities.InspectionAcademie;
import sen.dak.service.InspectionAcademieService;

import java.util.Collection;
import java.util.List;

@CrossOrigin(origins= "*")
@RestController
public class InspectionAcademieController {
    @Autowired
    InspectionAcademieService inspectionAcademieService;

    @GetMapping("/inspectionAcademie")
    public Collection<InspectionAcademie> getAllInspectionAcademie(){
        return inspectionAcademieService.getAllInspectionAcademie();
    }

    @GetMapping("/inspectionAcademie/{id}")
    public InspectionAcademie getInspectionAcademie(@PathVariable Long id) {return inspectionAcademieService.getInspectionAcademie(id); }

    @PostMapping("/inspectionAcademie")
    public InspectionAcademie addInspectionAcademie(@RequestBody InspectionAcademie inspectionAcademie){
        return inspectionAcademieService.addInspectionAcademie(inspectionAcademie);
    }

    @PutMapping("/inspectionAcademie/{id}")
    public InspectionAcademie updateInspectionAcademie(@RequestBody  InspectionAcademie inspectionAcademie, @PathVariable Long id )
    {
        return inspectionAcademieService.updateInspectionAcademie(id, inspectionAcademie);
    }

    @PatchMapping("/inspectionAcademie")
    public void deleteAllInspectionAcademie(@RequestBody List<InspectionAcademie> list){
        inspectionAcademieService.deleteSelectedInspectionAcademie(list);
    }

    @DeleteMapping("/inspectionAcademie/{id}")
    public void deleteInspectionAcademie(@PathVariable Long id){
        inspectionAcademieService.deleteInspectionAcademie(id);
    }
}
