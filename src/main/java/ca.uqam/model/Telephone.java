package ca.uqam.model;

/**
 * Created by Moiseballa on 2016-12-17.
 */
public class Telephone {
    private String indicatif;
    private String numero;
    private String type;

    public Telephone(String indicatif, String numero, String type) {
        this.indicatif = indicatif;
        this.numero = numero;
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("+%s %s-%s-%s (%s)",
                indicatif, numero.substring(0,3), numero.substring(3,6), numero.substring(6), type);
    }
}
