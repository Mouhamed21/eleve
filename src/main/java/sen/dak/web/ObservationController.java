package sen.dak.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sen.dak.entities.Observation;
import sen.dak.service.ObservationService;
import java.util.Collection;
import java.util.List;

@CrossOrigin(origins= "*")
@RestController
public class ObservationController {
    @Autowired
    ObservationService observationService;

    @GetMapping("/observation")
    public Collection<Observation> getAllObservation(){
        return observationService.getAllObservation();
    }

    @GetMapping("/observation/{id}")
    public Observation getObservation(@PathVariable Long id) {return observationService.getObservation(id); }

    @PostMapping("/observation")
    public Observation addObservation(@RequestBody Observation observation){
        return observationService.addObservation(observation);
    }

    @PutMapping("/observation/{id}")
    public Observation updateObservation(@RequestBody  Observation observation, @PathVariable Long id )
    {
        return observationService.updateObservation(id, observation);
    }

    @PatchMapping("/observation")
    public void deleteAllObservation(@RequestBody List<Observation> list){
        observationService.deleteSelectedObservation(list);
    }

    @DeleteMapping("/observation/{id}")
    public void deleteObservation(@PathVariable Long id){
        observationService.deleteObservation(id);
    }
}
