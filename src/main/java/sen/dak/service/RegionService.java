package sen.dak.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sen.dak.entities.Region;
import sen.dak.persistence.RegionRepository;

import java.util.Collection;
import java.util.List;

@Service
public class RegionService {
    @Autowired
    RegionRepository regionRepository;

    public Collection<Region> getAllRegion(){
        return regionRepository.findAll();
    }

    public Region getRegion(Long id){
        return regionRepository.findById(id).get();
    }

    public Region addRegion(Region filiere){
        return regionRepository.save(filiere);
    }

    public Region updateRegion(Long id, Region filiere){
        return regionRepository.save(filiere);
    }

    public void deleteRegion(Long id){
        regionRepository.deleteById(id);
    }

    public void deleteSelectedRegion(List<Region> list){
        regionRepository.deleteAll(list);
    }
}
