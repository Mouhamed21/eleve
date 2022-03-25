package sen.dak.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sen.dak.entities.Classe;
import sen.dak.service.ClasseService;

import java.util.Collection;

@RestController
public class ClasseController {
     @Autowired
    ClasseService classeService;
     @GetMapping("/classe")
     public Collection<Classe> getAllClasse(){
         return classeService.getAllClasse();
     }

     @PostMapping("/classe")
    public Classe addClasse(@RequestBody Classe classe){
         return classeService.addClasse(classe);
     }

     @PutMapping("/classe")
    public Classe updateClasse(@RequestBody Classe classe){
         return classeService.updateClasse(classe);
     }

}
