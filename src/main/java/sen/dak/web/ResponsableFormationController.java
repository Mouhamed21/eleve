package sen.dak.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sen.dak.entities.ResponsableFormation;
import sen.dak.service.ResponsableFormationService;

import java.util.Collection;
import java.util.List;

@CrossOrigin(origins= "*")
@RestController
public class ResponsableFormationController {
    @Autowired
    ResponsableFormationService responsableFormationService;

    @GetMapping("/responsableFormation")
    public Collection<ResponsableFormation> getAllResponsableFormation(){
        return responsableFormationService.getAllResponsableFormation();
    }

    @GetMapping("/responsableFormation/{id}")
    public ResponsableFormation getResponsableFormation(@PathVariable Long id) {return responsableFormationService.getResponsableFormation(id); }

    @PostMapping("/responsableFormation")
    public ResponsableFormation addResponsableFormation(@RequestBody ResponsableFormation responsableFormation){
        return responsableFormationService.addResponsableFormation(responsableFormation);
    }

    @PutMapping("/responsableFormation/{id}")
    public ResponsableFormation updateResponsableFormation(@RequestBody  ResponsableFormation responsableFormation, @PathVariable Long id )
    {
        return responsableFormationService.updateResponsableFormation(id, responsableFormation);
    }

    @PatchMapping("/responsableFormation")
    public void deleteAllResponsableFormation(@RequestBody List<ResponsableFormation> list){
        responsableFormationService.deleteSelectedResponsableFormation(list);
    }

    @DeleteMapping("/responsableFormation/{id}")
    public void deleteResponsableFormation(@PathVariable Long id){
        responsableFormationService.deleteResponsableFormation(id);
    }
}
