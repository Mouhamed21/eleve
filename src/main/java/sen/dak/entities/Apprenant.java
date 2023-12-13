package sen.dak.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "apprenant")
public class Apprenant {
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
    private String Telephone;
    @Column(nullable = false)
    private String genre;
    @JsonIgnoreProperties("apprenant")
    @ManyToOne
    @JoinColumn
    private EntrepriseFormatrice entrepriseFormatrice;

    @JsonIgnoreProperties("apprenant")
    @ManyToOne
    @JoinColumn
    private NiveauQualificationCible niveauQualificationCible;

    @JsonIgnoreProperties("apprenant")
    @ManyToOne
    @JoinColumn
    private Niveau_Entre niveauEntre;

    @JsonIgnoreProperties("apprenant")
    @ManyToOne
    @JoinColumn
    private CentreReference centreReference;

    @JsonIgnoreProperties("apprenant")
    @ManyToOne
    @JoinColumn
    private Metier metier;

    @JsonIgnoreProperties("apprenant")
    @ManyToOne
    @JoinColumn
    private Region region;

    @JsonIgnoreProperties("apprenant")
    @ManyToOne
    @JoinColumn
    private Formation formation;
}

