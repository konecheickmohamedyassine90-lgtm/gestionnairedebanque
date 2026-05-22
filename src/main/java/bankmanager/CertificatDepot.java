package bankmanager;

/*
 * Classe représentant
 * un certificat de dépôt.
 */

public class CertificatDepot
        extends CompteBancaire {

    public CertificatDepot(
            String compte,
            double solde
    ) {

        super(compte, solde);
    }
}