package sen.dak.entities;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "formation")
public class Formation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String libelle;
    @Column(nullable = false)
    private int duree;
    @Column(nullable = false)
    private Date dateDebut;
    @Column(nullable = true)
    private Date dateFinPrevue;

    @JsonIgnoreProperties("formation")
    @ManyToOne
    @JoinColumn
    private ResponsableFormation responsableFormation;

    @JsonIgnoreProperties("formation")
    @OneToMany(mappedBy = "formation")
    private Collection<Apprenant> apprenant = new ArrayList<>();
}
