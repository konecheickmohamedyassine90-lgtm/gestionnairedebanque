package bankmanager;

public class Main {

    public static void main(String[] args) {



        CompteCourant compteCourant =
                new CompteCourant(
                        "CC001",
                        500000,
                        100000
                );

        CompteEpargne compteEpargne =
                new CompteEpargne(
                        "CE001",
                        250000
                );

        CertificatDepot certificatDepot =
                new CertificatDepot(
                        "CD001",
                        1000000
                );


        System.out.println(
                "COMPTE COURANT "
        );

        compteCourant.afficherCompteCourant();

        System.out.println();

        System.out.println(
                " COMPTE EPARGNE "
        );

        compteEpargne.afficherInformations();

        System.out.println();

        System.out.println(
                " CERTIFICAT DE DEPOT "
        );

        certificatDepot.afficherInformations();
    }
}