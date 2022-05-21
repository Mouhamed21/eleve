package sen.dak.entities;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
//import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Eleve {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;
     String nom;
     String prenom;
     int age;

    @JsonIgnoreProperties("eleves")
    @ManyToOne
    //@JsonBackReference

    @JoinColumn

   private Classe classe;

}
