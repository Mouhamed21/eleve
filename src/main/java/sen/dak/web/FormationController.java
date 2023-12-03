package sen.dak.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sen.dak.entities.Formation;
import sen.dak.service.FormationService;
import java.util.Collection;
import java.util.List;

@CrossOrigin(origins= "*")
@RestController
public class FormationController {
    @Autowired
    FormationService formationService;

    @GetMapping("/formation")
    public Collection<Formation> getAllFormation(){
        return formationService.getAllFormation();
    }

    @GetMapping("/formation/{id}")
    public Formation getFormation(@PathVariable Long id) {return formationService.getFormation(id); }

    @PostMapping("/formation")
    public Formation addFormation(@RequestBody Formation formation){
        return formationService.addFormation(formation);
    }

    @PutMapping("/formation/{id}")
    public Formation updateFormation(@RequestBody  Formation formation, @PathVariable Long id )
    {
        return formationService.updateFormation(id, formation);
    }

    @PatchMapping("/formation")
    public void deleteAllFormation(@RequestBody List<Formation> list){
        formationService.deleteSelectedFormation(list);
    }

    @DeleteMapping("/formation/{id}")
    public void deleteFormation(@PathVariable Long id){
        formationService.deleteFormation(id);
    }
}
