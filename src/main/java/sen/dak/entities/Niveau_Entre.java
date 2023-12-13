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
@Table(name = "niveauEntre")
public class Niveau_Entre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "libelle", nullable = false, unique = true)
    private String libelle;

    @JsonIgnoreProperties("niveauEntre")
    @OneToMany(mappedBy = "niveauEntre")
    private Collection<Apprenant> apprenant = new ArrayList<>();
}
