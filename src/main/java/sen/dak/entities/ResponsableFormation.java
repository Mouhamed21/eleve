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
@Table(name = "responsableFormation")
public class ResponsableFormation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nom;
    @Column(nullable = false)
    private String prenom;
    @Column(unique = true)
    private String Telephone;

    @JsonIgnoreProperties("responsableFormation")
    @OneToMany(mappedBy = "responsableFormation")
    private Collection<Formation> formation = new ArrayList<>();
}
