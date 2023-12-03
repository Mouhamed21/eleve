package sen.dak.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sen.dak.entities.Region;
import sen.dak.service.RegionService;

import java.util.Collection;
import java.util.List;

@CrossOrigin(origins= "*")
@RestController
public class RegionController {
    @Autowired
    RegionService regionService;

    @GetMapping("/region")
    public Collection<Region> getAllRegion(){
        return regionService.getAllRegion();
    }

    @GetMapping("/region/{id}")
    public Region getRegion(@PathVariable Long id) {return regionService.getRegion(id); }

    @PostMapping("/region")
    public Region addRegion(@RequestBody Region region){
        return regionService.addRegion(region);
    }

    @PutMapping("/region/{id}")
    public Region updateRegion(@RequestBody  Region region, @PathVariable Long id )
    {
        return regionService.updateRegion(id, region);
    }

    @PatchMapping("/region")
    public void deleteAllRegion(@RequestBody List<Region> list){
        regionService.deleteSelectedRegion(list);
    }

    @DeleteMapping("/region/{id}")
    public void deleteRegion(@PathVariable Long id){
        regionService.deleteRegion(id);
    }
}
