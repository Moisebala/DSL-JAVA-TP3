package ca.uqam.contacts;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Moiseballa on 2016-12-17.
 */
public class Contact {
    private String nom;
    private String prenom;
    private List<Telephone> telephones = new ArrayList<Telephone>();
    private String email;
    private List<Adresse> adresses = new ArrayList<Adresse>();
    private String societe;
    private String groupe;
    private String fete;
    private List<Sociaux> sociaux = new ArrayList<Sociaux>();

    Contact (CreateurContact createur){createur.cree(this);}

    public void nom(String nom) {
        this.nom = nom;
    }

    public void prenom(String prenom) {
        this.prenom = prenom;
    }

    public void telephone(String indicatif, String numero, String type) {
        this.telephones.add(new Telephone(indicatif, numero, type)) ;
    }
    public void email (String email){
        this.email = email;
    }

    public void adresse(String numero, String rue, String codepostal, String ville) {
        this.adresses.add(new Adresse(numero, rue, codepostal, ville));}


    public void entreprise(String societe) {
        this.societe = societe;
    }

    public void groupe(String groupe) {this.groupe = groupe;}

    public void anniversaire(String fete) {
        this.fete = fete;
    }

    public void sociaux(String identifiant,String genre) {
        this.sociaux.add(new Sociaux(identifiant,genre)) ;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public List<Telephone> getTelephones() {
        return telephones;
    }

    public String getEmail() {
        return email;
    }

    public List<Adresse> getAdresses() {
        return adresses;
    }

    public String getSociete() {
        return societe;
    }

    public String getGroupe() {
        return groupe;
    }

    public String getFete() {
        return fete;
    }

    public List<Sociaux> getSociaux() {
        return sociaux;
    }

    public String telephonesDescription(){
        String telephonesDescription = "";
        for (Telephone tel : this.telephones)
            telephonesDescription += tel.toString() + " - ";
        return telephonesDescription;
    }
    public String adressesDescription(){
        String adressesDescription = "";
        for(Adresse adr : this.adresses)
            adressesDescription += adr.toString() + "\n";
        return adressesDescription;
    }
    public String sociauxDescription(){
        String sociauxDescription = "";
        for(Sociaux sc : this.sociaux)
            sociauxDescription += sc.toString() + "\n";
        return sociauxDescription;
    }

    @Override
    public String toString() {
        String description = String.format
                ("%s %s %n Téléphones : %s %n Email : %s %n Adresses : %s " +
                                "Societe : %s %n Groupe : %s %n Fete : %s  %n Sociaux: %s",
                        nom, prenom, telephonesDescription(), email, adressesDescription(),societe, groupe,fete ,sociauxDescription());
        return description;
    }


}
