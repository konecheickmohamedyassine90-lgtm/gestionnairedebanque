package bankmanager;

/*
 * Classe représentant
 * un compte courant.
 */

public class CompteCourant
        extends CompteBancaire {

    /*
     * Limite du compte.
     */

    private double limite;

    /*
     * Constructeur.
     */

    public CompteCourant(
            String compte,
            double solde,
            double limite
    ) {

        super(compte, solde);

        this.limite = limite;
    }


    public void afficherCompteCourant() {

        afficherInformations();

        System.out.println(
                "Limite : " + limite
        );
    }
}