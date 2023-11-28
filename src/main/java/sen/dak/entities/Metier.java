package sen.dak.entities;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "metier")
public class Metier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "libelle", nullable = false, unique = true)
    private String libelle;

    @JsonIgnoreProperties("metier")
    @ManyToOne
    @JoinColumn
    private Filiere filiere;

    @JsonIgnoreProperties("metier")
    @ManyToOne
    @JoinColumn
    private Secteur secteur;
}
