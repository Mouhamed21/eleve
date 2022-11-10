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
@Table(name = "niveau")
public class Niveau {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nom", nullable = false, unique = true)
    private String nom;

    @Column()
    String annee;

    @JsonIgnoreProperties("niveau")
    @OneToMany(mappedBy = "niveau")
    private Collection<Classe> classe = new ArrayList<>();

    public Collection<Classe> getClasse() {
        return classe;
    }

/*    public void setClasse(Collection<Classe> classe) {
        this.classe = classe;
    }

    public String getNom() {
        return nom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }*/

}