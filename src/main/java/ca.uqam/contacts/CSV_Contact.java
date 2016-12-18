package ca.uqam.contacts;


import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Moiseballa on 2016-12-17.
 */
public class CSV_Contact {
    private static final String  Delimeteur = " | ";
    private static final String Retour_Ligne = "\n\n";

    public static void sauvegarder(Contact contact){
        FileWriter fileWriter = null;
        try{
            String nomfichier = contact.getNom() + " - Contact";
            fileWriter = new FileWriter(nomfichier);

            fileWriter.append(contact.getNom());
            fileWriter.append(Delimeteur);
            fileWriter.append(contact.getPrenom());
            fileWriter.append(Delimeteur);
            fileWriter.append(contact.telephonesDescription());
            fileWriter.append(Delimeteur);
            fileWriter.append(contact.getEmail());
            fileWriter.append(Delimeteur);
            fileWriter.append(contact.adressesDescription());
            fileWriter.append(Delimeteur);
            fileWriter.append(contact.getSociete());
            fileWriter.append(Delimeteur);
            fileWriter.append(contact.getGroupe());
            fileWriter.append(Delimeteur);
            fileWriter.append(contact.getFete());
            fileWriter.append(Delimeteur);
            fileWriter.append(contact.sociauxDescription());
            fileWriter.append(Retour_Ligne);

            System.out.println("Fichier Contact créé avec succès.");

        }
        catch(Exception e){
            System.out.println("Erreur à CSV_Contact !!!");
            e.printStackTrace();
        }
        finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Erreur lors de l'opération de flushing/closing.");
                e.printStackTrace();
            }

        }
    }

}
