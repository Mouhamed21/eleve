package sen.dak.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sen.dak.entities.Eleve;
import sen.dak.service.EleveService;

import java.util.Collection;
import java.util.Optional;

@CrossOrigin(origins= "*")
@RestController
public class EleveController {
    @Autowired
    EleveService eleveService;
    @GetMapping("/eleve")
    public Collection<Eleve> getAllEleve(){
        return eleveService.getAllEleve();
    }

    @GetMapping("/eleve/{id}")
    public Optional<Eleve> getEleve(@PathVariable Long id) {return eleveService.getEleve(id); }

    @PostMapping("/eleve")
    public Eleve addEleve(@RequestBody Eleve eleve){
        return eleveService.addEleve(eleve);
    }

    @PutMapping("/eleve/{id}")
    public Eleve updateEleve(@RequestBody  Eleve eleve, @PathVariable Long id )
    {
        return eleveService.updateEleve(id, eleve);
    }

    @DeleteMapping("/eleve/{id}")
    public void deleteEleve(@PathVariable Long id){
        eleveService.deleteEleve(id);
    }
}
