package sen.dak.entities;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.Date;
//import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Eleve {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     @Column(nullable = false)
     private String nom;
     @Column(nullable = false)
     private String prenom;
     @Column(nullable = false)
     private Date dateNaissance;
     @Column(nullable = false)
     private String LieuNaissance;
    @Column(unique = true)
     private String email;
     @Column(nullable = false)
     private String adresse;
    @Column(unique = true)
    private String Telephone;
    @Column(unique = true)
    private String NumeroContact;

    @JsonIgnoreProperties("eleves")
    @ManyToOne
    //@JsonBackReference

    @JoinColumn(nullable = false)
   private Classe classe;

}
