package sen.dak.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sen.dak.entities.Observation;
import sen.dak.persistence.ObservationRepository;
import java.util.Collection;
import java.util.List;

@Service
public class ObservationService {
    @Autowired
    ObservationRepository observationRepository;
    public Collection<Observation> getAllObservation(){
        return observationRepository.findAll();
    }

    public Observation getObservation(Long id){
        return observationRepository.findById(id).get();
    }

    public Observation addObservation(Observation observation){
        return observationRepository.save(observation);
    }

    public Observation updateObservation(Long id, Observation observation){
        return observationRepository.save(observation);
    }

    public void deleteObservation(Long id){
        observationRepository.deleteById(id);
    }

    public void deleteSelectedObservation(List<Observation> list){
        observationRepository.deleteAll(list);
    }
}
