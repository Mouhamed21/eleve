package sen.dak.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sen.dak.entities.CentreReference;
import sen.dak.service.CentreReferenceService;

import java.util.Collection;
import java.util.List;

@CrossOrigin(origins= "*")
@RestController
public class CentreReferenceController {
    @Autowired
    CentreReferenceService centreReferenceService;

    @GetMapping("/centreReference")
    public Collection<CentreReference> getAllCentreReferenc(){
        return centreReferenceService.getAllCentreReference();
    }

    @GetMapping("/centreReference/{id}")
    public CentreReference getCentreReference(@PathVariable Long id) {return centreReferenceService.getCentreReference(id); }

    @PostMapping("/centreReference")
    public CentreReference addCentreReference(@RequestBody CentreReference centreReference){
        return centreReferenceService.addCentreReference(centreReference);
    }

    @PutMapping("/centreReference/{id}")
    public CentreReference updateCentreReference(@RequestBody  CentreReference centreReference, @PathVariable Long id )
    {
        return centreReferenceService.updateCentreReference(id, centreReference);
    }

    @PatchMapping("/centreReference")
    public void deleteAllCentreReference(@RequestBody List<CentreReference> list){
        centreReferenceService.deleteSelectedCentreReference(list);
    }

    @DeleteMapping("/centreReference/{id}")
    public void deleteCentreReference(@PathVariable Long id){
        centreReferenceService.deleteCentreReference(id);
    }

}
