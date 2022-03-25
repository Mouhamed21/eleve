package sen.dak.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sen.dak.entities.Classe;
import sen.dak.service.ClasseService;

import java.util.Collection;
import java.util.Optional;

@RestController
public class ClasseController {
     @Autowired
    ClasseService classeService;
     @GetMapping("/classe")
     public Collection<Classe> getAllClasse(){
         return classeService.getAllClasse();
     }

     @GetMapping("/classe/{id}")
     public Optional<Classe> getClasse(@PathVariable Long id){
         return classeService.getClasse(id);
     }

     @PostMapping("/classe")
    public Classe addClasse(@RequestBody Classe classe){
         return classeService.addClasse(classe);
     }

     @PutMapping("/classe")
    public Classe updateClasse(@RequestBody Classe classe){
         return classeService.updateClasse(classe);
     }

     @DeleteMapping("/classe/{id}")
    public void deleteClasse(@PathVariable Long id){
         classeService.deleteClasse(id);
     }
}
