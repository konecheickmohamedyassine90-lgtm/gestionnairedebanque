package bankmanager;

/*
 * Classe parent représentant
 * un compte bancaire.
 */

public class CompteBancaire {


    protected String compte;



    protected double solde;



    public CompteBancaire(
            String compte,
            double solde
    ) {

        this.compte = compte;
        this.solde = solde;
    }

    public void afficherInformations() {

        System.out.println(
                "Compte : " + compte
        );

        System.out.println(
                "Solde : " + solde
        );
    }
}