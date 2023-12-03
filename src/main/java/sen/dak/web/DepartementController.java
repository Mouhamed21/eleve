package sen.dak.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sen.dak.entities.Departement;
import sen.dak.service.DepartementService;
import java.util.Collection;
import java.util.List;

@CrossOrigin(origins= "*")
@RestController
public class DepartementController {
    @Autowired
    DepartementService departementService;

    @GetMapping("/departement")
    public Collection<Departement> getAllDepartement(){
        return departementService.getAllDepartement();
    }

    @GetMapping("/departement/{id}")
    public Departement getDepartement(@PathVariable Long id) {return departementService.getDepartement(id); }

    @PostMapping("/departement")
    public Departement addDepartement(@RequestBody Departement departement){
        return departementService.addDepartement(departement);
    }

    @PutMapping("/departement/{id}")
    public Departement updateDepartement(@RequestBody  Departement departement, @PathVariable Long id )
    {
        return departementService.updateDepartement(id, departement);
    }

    @PatchMapping("/departement")
    public void deleteAllDepartement(@RequestBody List<Departement> list){
        departementService.deleteSelectedDepartement(list);
    }

    @DeleteMapping("/departement/{id}")
    public void deleteDepartement(@PathVariable Long id){
        departementService.deleteDepartement(id);
    }
}
