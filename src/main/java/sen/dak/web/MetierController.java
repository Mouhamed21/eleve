package sen.dak.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sen.dak.entities.Metier;
import sen.dak.service.MetierService;
import java.util.Collection;
import java.util.List;

@CrossOrigin(origins= "*")
@RestController
public class MetierController {
    @Autowired
    MetierService metierService;

    @GetMapping("/metier")
    public Collection<Metier> getAllMetier(){
        return metierService.getAllMetier();
    }

    @GetMapping("/metier/{id}")
    public Metier getMetier(@PathVariable Long id) {return metierService.getMetier(id); }

    @PostMapping("/metier")
    public Metier addMetier(@RequestBody Metier metier){
        return metierService.addMetier(metier);
    }

    @PutMapping("/metier/{id}")
    public Metier updateMetier(@RequestBody  Metier metier, @PathVariable Long id )
    {
        return metierService.updateMetier(id, metier);
    }

    @PatchMapping("/metier")
    public void deleteAllMetier(@RequestBody List<Metier> list){
        metierService.deleteSelectedMetier(list);
    }

    @DeleteMapping("/metier/{id}")
    public void deleteMetier(@PathVariable Long id){
        metierService.deleteMetier(id);
    }
}
