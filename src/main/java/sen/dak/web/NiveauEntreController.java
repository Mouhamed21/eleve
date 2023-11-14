package sen.dak.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sen.dak.entities.Niveau_Entre;
import sen.dak.service.Niveau_EntreService;

import java.util.Collection;
import java.util.List;

@CrossOrigin(origins= "*")
@RestController
public class NiveauEntreController {
    @Autowired
    Niveau_EntreService niveau_entreService;

    @GetMapping("/niveauEntre")
    public Collection<Niveau_Entre> getAllNiveauEntre(){
        return niveau_entreService.getAllNiveauEntre();
    }

    @GetMapping("/niveauEntre/{id}")
    public Niveau_Entre getNiveauEntre(@PathVariable Long id) {return niveau_entreService.getNiveauEntre(id); }

    @PostMapping("/niveauEntre")
    public Niveau_Entre addNiveauEntre(@RequestBody Niveau_Entre niveauEntre){
        return niveau_entreService.addNiveauEntre(niveauEntre);
    }

    @PutMapping("/niveauEntre/{id}")
    public Niveau_Entre updateNiveauEntre(@RequestBody  Niveau_Entre niveau_entre, @PathVariable Long id )
    {
        return niveau_entreService.updateNiveauEntre(id, niveau_entre);
    }

    @PatchMapping("/niveauEntre")
    public void deleteAllNiveauEntre(@RequestBody List<Niveau_Entre> list){
        niveau_entreService.deleteSelectedNiveauEntre(list);
    }

    @DeleteMapping("/niveauEntre/{id}")
    public void deleteEleve(@PathVariable Long id){
        niveau_entreService.deleteNiveauEntre(id);
    }
}
