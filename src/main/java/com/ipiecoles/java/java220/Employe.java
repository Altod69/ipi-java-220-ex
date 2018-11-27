package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;
import java.util.Objects;


/**
 * Created by pjvilloud on 21/09/17.
 */
public class Employe {

    private String nom;
    private String prenom;
    private String matricule;
    private LocalDate dateEmbauche;
    private Double salaire;


    public Employe(){

    }

    public Employe(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire) throws Exception{
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.dateEmbauche = dateEmbauche;
        this.setDateEmbauche(dateEmbauche);
        this.salaire = salaire;
    }

    public String getNom(){
        return this.nom;
    }

    public void setNom(String value){
        this.nom = value;
    }

    public String getPrenom(){
        return this.prenom;
    }

    public void setPrenom(String value){
        this.prenom = value;
    }

    public String getMatricule(){
        return this.matricule;
    }

    public void setMatricule(String value){
        this.matricule = value;
    }

    public LocalDate getDateEmbauche(){
        return this.dateEmbauche;
    }

    public void setDateEmbauche(LocalDate value) throws Exception{
        if(value.isAfter(LocalDate.now())){
            throw new Exception("La date d'embauche ne peut être postérieure à la date courante");
        }

        this.dateEmbauche = value;
    }

    public Double getSalaire(){

        return this.salaire;
    }

    public void setSalaire(Double value){

        this.salaire = value;
    }

    public final Integer getNombreAnneeAnciennete(){
        return LocalDate.now().getYear() - dateEmbauche.getYear();
    }

    //Développer une méthode getNbConges retournant la constante de classe NB_CONGES_BASE de la classe Entreprise

    public Integer getNbConges(){
        return Entreprise.NB_CONGES_BASE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Employe employe = (Employe) o;

        return nom.equals(employe.nom) &&
                prenom.equals(employe.prenom) &&
                matricule.equals(employe.matricule) &&
                dateEmbauche.equals(employe.dateEmbauche) &&
                salaire.equals(employe.salaire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom, matricule, dateEmbauche, salaire);
    }

    public String toString(){
        public String toString() {
            final StringBuilder sb = new StringBuilder("Employe{");
            sb.append("nom='").append(nom).append('\'');
            sb.append(", prenom='").append(prenom).append('\'');
            sb.append(", matricule='").append(matricule).append('\'');
            sb.append(", dateEmbauche=").append(dateEmbauche);
            sb.append(", salaire=").append(salaire);
            sb.append('}');

            return sb.toString();
        }
    }

}
