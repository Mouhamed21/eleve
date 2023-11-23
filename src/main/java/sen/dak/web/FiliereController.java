package sen.dak.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sen.dak.entities.Filiere;
import sen.dak.service.FiliereService;
import java.util.Collection;
import java.util.List;

@CrossOrigin(origins= "*")
@RestController
public class FiliereController {
    @Autowired
    FiliereService filiereService;

    @GetMapping("/filiere")
    public Collection<Filiere> getAllFiliere(){
        return filiereService.getAllFiliere();
    }

    @GetMapping("/filiere/{id}")
    public Filiere getFiliere(@PathVariable Long id) {return filiereService.getFiliere(id); }

    @PostMapping("/filiere")
    public Filiere addFiliere(@RequestBody Filiere filiere){
        return filiereService.addFiliere(filiere);
    }

    @PutMapping("/filiere/{id}")
    public Filiere updateFiliere(@RequestBody  Filiere filiere, @PathVariable Long id )
    {
        return filiereService.updateFiliere(id, filiere);
    }

    @PatchMapping("/filiere")
    public void deleteAllFiliere(@RequestBody List<Filiere> list){
        filiereService.deleteSelectedFiliere(list);
    }

    @DeleteMapping("/filiere/{id}")
    public void deleteFiliere(@PathVariable Long id){
        filiereService.deleteFiliere(id);
    }
}
