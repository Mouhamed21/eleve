package sen.dak.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sen.dak.entities.NiveauQualificationCible;
import sen.dak.service.NiveauQualificationCibleService;
import java.util.Collection;
import java.util.List;

@CrossOrigin(origins= "*")
@RestController
public class NiveauQualificationCibleController {

    @Autowired
    NiveauQualificationCibleService niveauQualificationCibleService;

    @GetMapping("/niveauQualificationCible")
    public Collection<NiveauQualificationCible> getAllNiveauQualificationCible(){
        return niveauQualificationCibleService.getAllNiveauQualificationCible();
    }

    @GetMapping("/niveauQualificationCible/{id}")
    public NiveauQualificationCible getNiveauQualificationCible(@PathVariable Long id) {
        return niveauQualificationCibleService.getNiveauQualificationCible(id);
    }

    @PostMapping("/niveauQualificationCible")
    public NiveauQualificationCible addNiveauQualificationCible(@RequestBody NiveauQualificationCible niveauQualificationCible){
        return niveauQualificationCibleService.addNiveauQualificationCible(niveauQualificationCible);
    }

    @PutMapping("/niveauQualificationCible/{id}")
    public NiveauQualificationCible updateNiveauQualificationCible(@RequestBody  NiveauQualificationCible niveauQualificationCible, @PathVariable Long id )
    {
        return niveauQualificationCibleService.updateNiveauQualificationCible(id, niveauQualificationCible);
    }

    @PatchMapping("/niveauQualificationCible")
    public void deleteAllNiveauQualificationCible(@RequestBody List<NiveauQualificationCible> list){
        niveauQualificationCibleService.deleteSelectedNiveauQualificationCible(list);
    }

    @DeleteMapping("/niveauQualificationCible/{id}")
    public void deleteEleve(@PathVariable Long id){
        niveauQualificationCibleService.deleteNiveauniveauQualificationCible(id);
    }
}
