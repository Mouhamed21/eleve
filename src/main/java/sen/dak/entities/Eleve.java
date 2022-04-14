package sen.dak.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
//import java.util.Collection;

@Entity
public class Eleve {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;
    @Column
     String nom;
    @Column
    String prenom;
    @Column
     int age;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    Classe classe;
    public Eleve() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
