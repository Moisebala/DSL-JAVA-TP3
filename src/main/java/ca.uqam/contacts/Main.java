package ca.uqam.contacts;


//import ca.uqam.contacts.CSV_Contact;

/**
 * Created by Moiseballa on 2016-12-17.
 */
public class Main {
        public static void main(String[] args){
            //Utilisation de lambda expression par Java 8
            Contact contact = new Contact(c -> {
                c.nom("Moussa");
                c.prenom("Balla");
                c.telephone("1", "4384033676","Domicile");
                c.telephone("1", "4384033676", "Travaille");
                c.email("moisebala@gmail.com");
                c.adresse("325", "joliette", "J4H-2L4", "Montréal");
                c.entreprise("UQAM");
                c.groupe("Famille");
                c.anniversaire("03-06-1988");
                c.sociaux("Moise bala", "Facebook");
            });

            System.out.println(contact.toString());
            CSV_Contact.sauvegarder(contact);
        }
    }
