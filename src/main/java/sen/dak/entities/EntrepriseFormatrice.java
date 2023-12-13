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
@Table(name = "entrepriseFormatrice")
public class EntrepriseFormatrice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "libelle", nullable = false, unique = true)
    private String libelle;

    @Column(name = "adresse", nullable = true)
    private String adresse;

    @JsonIgnoreProperties("entrepriseFormatrice")
    @OneToMany(mappedBy = "entrepriseFormatrice")
    private Collection<Apprenant> apprenant = new ArrayList<>();
}
