package sen.dak.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sen.dak.entities.Branche;
import sen.dak.service.BrancheService;
import java.util.Collection;
import java.util.List;

@CrossOrigin(origins= "*")
@RestController
public class BrancheController {

    @Autowired
    BrancheService brancheService;

    @GetMapping("/branche")
    public Collection<Branche> getAllBranche(){
        return brancheService.getAllBranche();
    }

    @GetMapping("/branche/{id}")
    public Branche getBranche(@PathVariable Long id) {return brancheService.getBranche(id); }

    @PostMapping("/branche")
    public Branche addBranche(@RequestBody Branche branche){
        return brancheService.addBranche(branche);
    }

    @PutMapping("/branche/{id}")
    public Branche updateBranche(@RequestBody  Branche branche, @PathVariable Long id )
    {
        return brancheService.updateBranche(id, branche);
    }

    @PatchMapping("/branche")
    public void deleteAllBranche(@RequestBody List<Branche> list){
        brancheService.deleteSelectedBranche(list);
    }

    @DeleteMapping("/branche/{id}")
    public void deleteBranche(@PathVariable Long id){
        brancheService.deleteBranche(id);
    }
}
