package sen.dak.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Classe {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nom;
    int effectif;
    @JsonIgnoreProperties("classe")
    @OneToMany(mappedBy = "classe")
   //@JsonManagedReference
    Collection<Eleve> eleves;

}
