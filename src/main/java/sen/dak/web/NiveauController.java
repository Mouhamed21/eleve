package sen.dak.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sen.dak.entities.Niveau;
import sen.dak.service.NiveauService;

import java.util.Collection;
import java.util.List;

@CrossOrigin(origins= "*")
@RestController
public class NiveauController {
    @Autowired
    NiveauService niveauService;

    @GetMapping("/niveau")
    public Collection<Niveau> getAllNiveau(){
        return niveauService.getAllNiveau();
    }

    @GetMapping("/niveau/{id}")
    public Niveau getNiveau(@PathVariable Long id) {return niveauService.getNiveau(id); }

    @PostMapping("/niveau")
    public Niveau addNiveau(@RequestBody Niveau niveau){
        return niveauService.addNiveau(niveau);
    }

    @PutMapping("/niveau/{id}")
    public Niveau updateNiveau(@RequestBody  Niveau niveau, @PathVariable Long id )
    {
        return niveauService.updateNiveau(id, niveau);
    }

    @PatchMapping("/niveau")
    public void deleteAllNiveau(@RequestBody List<Niveau> list){
        niveauService.deleteSelectedNiveau(list);
    }

    @DeleteMapping("/niveau/{id}")
    public void deleteEleve(@PathVariable Long id){
        niveauService.deleteNiveau(id);
    }
}

