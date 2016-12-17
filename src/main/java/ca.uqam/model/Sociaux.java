package ca.uqam.model;

/**
 * Created by Moiseballa on 2016-12-17.
 */
public class Sociaux {
    private String identifiant;
    private String genre;

    public Sociaux(String identifiant, String genre) {
        this.identifiant = identifiant;
        this.genre = genre;
    }

    @Override
    public String toString() {  return String.format(" %s :%s", identifiant,genre); }
}
