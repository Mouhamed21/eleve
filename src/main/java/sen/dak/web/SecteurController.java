package sen.dak.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sen.dak.entities.Secteur;
import sen.dak.service.SecteurService;

import java.util.Collection;
import java.util.List;

@CrossOrigin(origins= "*")
@RestController
public class SecteurController {
    @Autowired
    SecteurService secteurService;

    @GetMapping("/secteur")
    public Collection<Secteur> getAllSecteur(){
        return secteurService.getAllSecteur();
    }

    @GetMapping("/secteur/{id}")
    public Secteur getSecteur(@PathVariable Long id) {return secteurService.getSecteur(id); }

    @PostMapping("/secteur")
    public Secteur addSecteur(@RequestBody Secteur secteur){
        return secteurService.addSecteur(secteur);
    }

    @PutMapping("/secteur/{id}")
    public Secteur updateSecteur(@RequestBody  Secteur secteur, @PathVariable Long id )
    {
        return secteurService.updateSecteur(id, secteur);
    }

    @PatchMapping("/secteur")
    public void deleteAllSecteur(@RequestBody List<Secteur> list){
        secteurService.deleteSelectedSecteur(list);
    }

    @DeleteMapping("/secteur/{id}")
    public void deleteEleve(@PathVariable Long id){
        secteurService.deleteSecteur(id);
    }
}
