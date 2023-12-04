package sen.dak.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "libelle", nullable = false, unique = true)
    private String libelle;

    @JsonIgnoreProperties("region")
    @OneToMany(mappedBy = "region")
    private Collection<Departement> departement = new ArrayList<>();

    @JsonIgnoreProperties({"region"})
    @OneToMany(mappedBy = "region")
    private Collection<InspectionAcademie> inspectionAcademie = new ArrayList<>();
}
