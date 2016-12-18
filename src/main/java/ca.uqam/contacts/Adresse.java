package ca.uqam.contacts;

/**
 * Created by Moiseballa on 2016-12-17.
 */
public class Adresse {
    private String numero;
    private String rue;
    private String codepostal;
    private String ville;

    public Adresse(String numero, String rue, String codepostal, String ville) {
        this.numero = numero;
        this.rue = rue;
        this.codepostal = codepostal;
        this.ville = ville;
    }

    @Override
    public String toString() {
        return String.format("%s, %s (%s) - %s", numero, rue, codepostal, ville);
    }
}
