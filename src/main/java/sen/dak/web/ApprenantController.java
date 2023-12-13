package sen.dak.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sen.dak.entities.Apprenant;
import sen.dak.service.ApprenantService;

import java.util.Collection;
import java.util.List;

@CrossOrigin(origins= "*")
@RestController
public class ApprenantController {
    @Autowired
    ApprenantService apprenantService;

    @GetMapping("/apprenant")
    public Collection<Apprenant> getAllApprenant(){
        return apprenantService.getAllApprenant();
    }

    @GetMapping("/apprenant/{id}")
    public Apprenant getApprenant(@PathVariable Long id) {return apprenantService.getApprenant(id); }

    @PostMapping("/apprenant")
    public Apprenant addApprenant(@RequestBody Apprenant apprenant){
        return apprenantService.addApprenant(apprenant);
    }

    @PutMapping("/apprenant/{id}")
    public Apprenant updateApprenant(@RequestBody  Apprenant apprenant, @PathVariable Long id )
    {
        return apprenantService.updateApprenant(id, apprenant);
    }

    @PatchMapping("/apprenant")
    public void deleteAllApprenant(@RequestBody List<Apprenant> list){
        apprenantService.deleteSelectedApprenant(list);
    }

    @DeleteMapping("/apprenant/{id}")
    public void deleteApprenant(@PathVariable Long id){
        apprenantService.deleteApprenant(id);
    }
}
