package sen.dak.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sen.dak.entities.EntrepriseFormatrice;
import sen.dak.service.EntrepriseFormatriceService;

import java.util.Collection;
import java.util.List;

@CrossOrigin(origins= "*")
@RestController
public class EntrepriseFormatriceController {

    @Autowired
    EntrepriseFormatriceService entrepriseFormatriceService;

    @GetMapping("/entrepriseFormatrice")
    public Collection<EntrepriseFormatrice> getAllEntrepriseFormatrice(){
        return entrepriseFormatriceService.getAllEntrepriseFormatrice();
    }

    @GetMapping("/entrepriseFormatrice/{id}")
    public EntrepriseFormatrice getEntrepriseFormatrice(@PathVariable Long id) {return entrepriseFormatriceService.getEntrepriseFormatrice(id); }

    @PostMapping("/entrepriseFormatrice")
    public EntrepriseFormatrice addEntrepriseFormatrice(@RequestBody EntrepriseFormatrice entrepriseFormatrice){
        return entrepriseFormatriceService.addEntrepriseFormatrice(entrepriseFormatrice);
    }

    @PutMapping("/entrepriseFormatrice/{id}")
    public EntrepriseFormatrice updateEntrepriseFormatrice(@RequestBody  EntrepriseFormatrice entrepriseFormatrice, @PathVariable Long id)
    {
        return entrepriseFormatriceService.updateEntrepriseFormatrice(id, entrepriseFormatrice);
    }

    @PatchMapping("/entrepriseFormatrice")
    public void deleteAllEntrepriseFormatrice(@RequestBody List<EntrepriseFormatrice> list){
        entrepriseFormatriceService.deleteSelectedEntrepriseFormatrice(list);
    }

    @DeleteMapping("/entrepriseFormatrice/{id}")
    public void deleteEntrepriseFormatrice(@PathVariable Long id){
        entrepriseFormatriceService.deleteEntrepriseFormatrice(id);
    }
}
