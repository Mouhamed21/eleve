package sen.dak.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import sen.dak.entities.Eleve;
import sen.dak.service.EleveService;

import java.util.Collection;

@RestController
public class EleveController {
    @Autowired
    EleveService eleveService;
    @GetMapping("/eleve")
    public Collection<Eleve> getAllEleve(){
        return eleveService.getAllEleve();
    }

    @PostMapping("/eleve")
    public Eleve addEleve(@RequestBody Eleve eleve){
        return eleveService.addEleve(eleve);
    }
}
