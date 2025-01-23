import java.util.Scanner;

/*
* @Author Tony Khabbaz
* @since 2024/09/23
*/

public class TP1 {

    public static final String REINITIALISER = "\u001B[0m"; // Methode réinitialiser couleur
    public static final String BOLD = "\u001B[1m"; // Methode caractère BOLD
    public static final String BLEU = "\u001B[34m"; // Methode Couleur Bleu
    public static final String CYAN = "\u001B[36m"; // Methode Couleur Cyan
    public static final String VERT = "\u001B[32m"; // Methode Couleur Vert
    public static final String ROUGE = "\u001B[31m"; // Methode Couleur Rouge

    // La méthode stripAnsiCodes supprime les codes d'échappement ANSI d'une chaîne pour renvoyer du texte brut sans artefacts de formatage.
    public static String stripAnsiCodes(String text) {
        return text.replaceAll("\u001B\\[[;\\d]*m", "");
    }

    // La méthode formatLine crée une ligne formatée avec une étiquette et un contenu, en ajoutant des espaces pour atteindre une largeur totale spécifiée tout en supprimant les codes ANSI.
    public static String formatLine(String label, String content, int totalWidth) {
        String text = label + content;
        int longueurVisible = stripAnsiCodes(text).length();
        int rembourrageNecessaire = totalWidth - longueurVisible;
        return CYAN + "║" + REINITIALISER + text + " ".repeat(Math.max(0, rembourrageNecessaire)) + CYAN + "║" + REINITIALISER;
    }
    public static void main(String[] args) {
        final int largeurTotale = 40; // largeur de chaque ligne dans chaque System.out.println

        boolean debut = true; // Debut de première boucle (boucle principale pour quitter tout le programme, lorsque debut = false, le loop finira et le code s'arrête)22

        while (debut) { // Debut du loop
            boolean loop1 = true; // Boolean pour la boucle de choix de billets
            boolean loop2 = true; // Boolean pour la boucle de sélection de la catégorie
            boolean loop3 = true; // Boolean pour la boucle de sélection de la réduction
            boolean loopSoiree = true; // Boolean pour la boucle de Soirée

            String clavier1; // Variable pour le premier choix
            String clavier2; // Variable pour le choix du nombre de passages
            String clavier3; // Variable pour le choix de la réduction
            String clavier4; // Variable pour catégorie d'abonnement

            int quantite; // Quantité de passage voulu (Option Navette)

            String choixQ1; // Variable pour la confirmation de quitter
            String choixQ2; // Variable pour la confirmation de quitter
            String choixQ3; // Variable pour la confirmation de quitter
            String choixQ4; // Variable pour la confirmation de quitter
            String choixQ5; // Variable pour la confirmation de quitter
            String choixQ6; // Variable pour la confirmation de quitter

            double tps= 0.05; // Taux de TPS
            double tvq = 0.0975; // Taux de TVQ

            // Menu Principale
            System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
            System.out.println(formatLine(BLEU + BOLD, "           BIENVENUE À LA STM", largeurTotale) + REINITIALISER);
            System.out.println(formatLine(BLEU, " Catégorie des Titres de Transport", largeurTotale) + REINITIALISER);
            System.out.println(formatLine(BLEU, " Choisissez une catégorie de titre :", largeurTotale) + REINITIALISER);
            System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");

            System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
            System.out.println(formatLine(VERT + " P - " + REINITIALISER, "Passages", largeurTotale) + REINITIALISER);
            System.out.println(formatLine(VERT + " S - " + REINITIALISER, "Soirées", largeurTotale) + REINITIALISER);
            System.out.println(formatLine(VERT + " N - " + REINITIALISER, "Navette Aéroport", largeurTotale) + REINITIALISER);
            System.out.println(formatLine(VERT + " Q - " + REINITIALISER, "Quitter", largeurTotale) + REINITIALISER);
            System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");

            System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
            System.out.println(formatLine(BLEU, " Choisissez une catégorie d'abonnement", largeurTotale) + REINITIALISER);
            System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");

            Scanner clavier = new Scanner(System.in);

            clavier1 = clavier.nextLine(); // Lecture du premier choix de l'utilisateur

            while (loop2) { // Boucle pour le choix de la catégorie
                switch (clavier1) {
                    case "P":
                    case "p":
                        System.out.println(BLEU + "        Vous avez choisi " + BOLD + "Passage" + REINITIALISER);
                        System.out.println();
                        System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                        System.out.println(formatLine(BLEU + "        " + BOLD, "BIENVENUE À LA STM", largeurTotale));
                        System.out.println(formatLine(BLEU, " Passage", largeurTotale));
                        System.out.println(formatLine(BLEU, " Choisissez le nombre de passages :", largeurTotale));
                        System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");

                        System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                        System.out.println(formatLine(VERT + " 1 - " + REINITIALISER, "1 passage -  3.50$", largeurTotale));
                        System.out.println(formatLine(VERT + " 2 - " + REINITIALISER, "2 passages -  6.50$", largeurTotale));
                        System.out.println(formatLine(VERT + " 3 - " + REINITIALISER, "10 passages -  30.00$", largeurTotale));
                        System.out.println(formatLine(VERT + " Q - " + REINITIALISER, "Quitter", largeurTotale));
                        System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");

                        System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                        System.out.println(formatLine(BLEU, " Choisissez une catégorie d'abonnement :", largeurTotale));
                        System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");

                        clavier2 = clavier.nextLine(); // Lecture du choix de la catégorie d'abonnement

                        while (loop1) { // Boucle pour le choix de la catégorie d'abonnement
                            switch (clavier2) {
                                case "Q":
                                case "q":    // Option pour quitter
                                    System.out.println();
                                    System.out.println( BLEU + "Vous avez choisi Quitter");
                                    System.out.println( BLEU + "Êtes-vous sûr ? "+ ROUGE +"(Oui/Non)");

                                    choixQ1 = clavier.nextLine(); // Lecture de la confirmation de quitter

                                    while (!(choixQ1.equalsIgnoreCase("Oui")  || choixQ1.equalsIgnoreCase("Non"))) {
                                        System.out.println(BLEU + "Entrez une valeur reconnue " + ROUGE +"(Oui/Non):");
                                        choixQ1 = clavier.nextLine();
                                    }
                                    if (choixQ1.equalsIgnoreCase("Oui")) { // Si l'utilisateur confirme
                                        System.out.println(ROUGE + "Vous avez quitté.");
                                        loop1 = false; // Fin de la boucle de choix de billets
                                        debut = false; // Fin de la boucle
                                    } else if (choixQ1.equalsIgnoreCase("Non")) { // Si l'utilisateur ne confirme pas
                                        System.out.println("\nRetour au menu principal....\n");
                                        loop1 = false; // Fin de la boucle de choix de billets
                                    }
                                    break;

                                case "1": // Choix pour 1 passage
                                    // Menu Reduction
                                    System.out.println();
                                    System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                    System.out.println(formatLine(BLEU + "           " + BOLD, "BIENVENUE À LA STM", largeurTotale));
                                    System.out.println(formatLine(BLEU, " Choisissez votre réduction :", largeurTotale));
                                    System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");

                                    System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                    System.out.println(formatLine(VERT + " 1 - " + REINITIALISER, "Enfant", largeurTotale));
                                    System.out.println(formatLine(VERT + " 2 - " + REINITIALISER, "Étudiant", largeurTotale));
                                    System.out.println(formatLine(VERT + " 3 - " + REINITIALISER, "+65 ans", largeurTotale));
                                    System.out.println(formatLine(VERT + " A - " + REINITIALISER, "Aucune réduction", largeurTotale));
                                    System.out.println(formatLine(VERT + " Q - " + REINITIALISER, "Quitter", largeurTotale));
                                    System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");

                                    System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                    System.out.println(formatLine(BLEU, " Choisissez le type de réduction :", largeurTotale));
                                    System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");

                                    clavier3 = clavier.nextLine(); // Lecture du choix de réduction

                                    float prixA1 = 3.5f; // prix avant rabais
                                    double prix1 = 0.0; // prix à définir dans le switch

                                    while (loop3) { // Boucle pour le choix de réduction
                                        switch (clavier3) {
                                            case "Q":
                                            case "q": // Option pour quitter
                                                System.out.println();
                                                System.out.println( BLEU + "Vous avez choisi Quitter");
                                                System.out.println( BLEU + "Êtes-vous sûr ? "+ ROUGE +"(Oui/Non)");

                                                choixQ2 = clavier.nextLine();

                                                while (!(choixQ2.equalsIgnoreCase("Oui")  || choixQ2.equalsIgnoreCase("Non"))) {
                                                    System.out.println(BLEU + "Entrez une valeur reconnue "+ ROUGE+"(Oui/Non):");
                                                    choixQ2 = clavier.nextLine();
                                                }

                                                if (choixQ2.equalsIgnoreCase("Oui")) { // Si l'utilisateur confirme
                                                    System.out.println("Vous avez quitté.");
                                                    loop3 = false; // Fin de la boucle de sélection de la réduction
                                                    debut = false;
                                                } else if (choixQ2.equalsIgnoreCase("Non")) { // Si l'utilisateur ne confirme pas
                                                    System.out.println("\nRetour au menu principal...\n");
                                                    loop3 = false; // Fin de la boucle de sélection de la réduction
                                                }
                                                break;
                                            case "1", "2": // Prix pour Enfants et Étudiant
                                                prix1 = 2.50;
                                                break;
                                            case "3": // Prix pour les 65+
                                                prix1 = 1;
                                                break;
                                            case "A": // Aucune reduction
                                                prix1 = prixA1;
                                                break;

                                            default: // Si l'utilisateur utilise une option non-reconnu
                                                System.out.print(BLEU +"Enter une options reconnue:");
                                                clavier3 = clavier.nextLine();

                                        }
                                        if(loop3) {
                                            //RÉCAPITULATIF DE VOTRE ACHAT
                                            System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                            System.out.println(formatLine(BLEU + "     " + BOLD, "RÉCAPITULATIF DE VOTRE ACHAT", largeurTotale));
                                            System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");

                                            System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                            System.out.println(formatLine(VERT, "Type de billet : " + REINITIALISER + "Passage", largeurTotale));
                                            System.out.println(formatLine(VERT, "Réduction : " + REINITIALISER + "Enfant", largeurTotale));
                                            System.out.println(formatLine(VERT, "Prix avant rabais: " + REINITIALISER + prixA1 +"$", largeurTotale));
                                            System.out.println(formatLine(VERT, "Prix après rabais : " + REINITIALISER + prix1 + " $", largeurTotale));
                                            System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");
                                            //Tax
                                            System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                            System.out.println(formatLine(VERT, "TPS (5%) : " + REINITIALISER + String.format("%.2f", prix1 * tps) + "$", largeurTotale));
                                            System.out.println(formatLine(VERT, "TVQ (9.975%) : " + REINITIALISER + String.format("%.2f", prix1 * tvq) + "$", largeurTotale));
                                            System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");
                                            // Prix Final
                                            System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                            System.out.println(formatLine(ROUGE + BOLD, "PRIX FINAL : " + REINITIALISER + String.format("%.2f", (prix1 + (prix1 * tps) + (prix1 * tvq))) + "$", largeurTotale));
                                            System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");
                                            // Menu Payement
                                            System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                            System.out.println(formatLine(BLEU + "               " + BOLD, "PAYEMENT", largeurTotale));
                                            System.out.println(formatLine(BLEU + BOLD, "           Entrer Le montant", largeurTotale));
                                            System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");

                                            double montant1 = (prix1 + (prix1 * tps) + (prix1 * tvq)); //Montant a payer
                                            double montantPayer1 = clavier.nextDouble(); // Montant Payée
                                            double epsilon = 0.01; // Définir une petite tolérance

                                            if (Math.abs(montantPayer1 - montant1) < epsilon) { // Si l'utilisateur paie exactement +- 0.01
                                                System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                                System.out.println(formatLine(BLEU + "     " + BOLD, "Merci d'avoir utilisée la STM", largeurTotale));
                                                System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");
                                            } else if (montantPayer1 > montant1) { // Si l'utilisateur paie de plus
                                                System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                                System.out.println(formatLine(VERT + BOLD, "Voici Votre Monnaie : " + REINITIALISER + String.format("%.2f", (montantPayer1 - montant1)) + "$", largeurTotale));
                                                System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");
                                                System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                                System.out.println(formatLine(BLEU + "     " + BOLD, "Merci d'avoir utilisée la STM", largeurTotale));
                                                System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");
                                            } else {
                                                while (montantPayer1 < montant1) { // boucle si l'utilisateur paie de moin
                                                    System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                                    System.out.println(formatLine(ROUGE + BOLD, " Veuillez payer le montant total", largeurTotale));
                                                    System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");
                                                    montantPayer1 = clavier.nextDouble();
                                                }
                                                // Message Merci
                                                System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                                System.out.println(formatLine(BLEU + "     " + BOLD, "Merci d'avoir utilisée la STM", largeurTotale));
                                                System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");
                                            }
                                            loop3 = false; // Fin de la boucle de sélection de la réduction
                                            debut = false;
                                        }
                                    }
                                    loop1 = false; // Fin de la boucle de choix de billets
                                    break;

                                case "2": // Choix pour 2 passages
                                    // Menu Reduction
                                    System.out.println();
                                    System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                    System.out.println(formatLine(BLEU + "        " + BOLD, "BIENVENUE À LA STM", largeurTotale));
                                    System.out.println(formatLine(BLEU, " Choisissez votre réduction :", largeurTotale));
                                    System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");

                                    System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                    System.out.println(formatLine(VERT + " 1 - " + REINITIALISER, "Enfant", largeurTotale));
                                    System.out.println(formatLine(VERT + " 2 - " + REINITIALISER, "Étudiant", largeurTotale));
                                    System.out.println(formatLine(VERT + " 3 - " + REINITIALISER, "+65 ans", largeurTotale));
                                    System.out.println(formatLine(VERT + " A - " + REINITIALISER, "Aucune réduction", largeurTotale));
                                    System.out.println(formatLine(VERT + " Q - " + REINITIALISER, "Quitter", largeurTotale));
                                    System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");

                                    System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                    System.out.println(formatLine(BLEU, " Choisissez le type de réduction :", largeurTotale));
                                    System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");

                                    clavier3 = clavier.nextLine();

                                    float prixA2 = 6.50f; // prix avant rabais
                                    double prix2 = 0.0; // prix à définir dans le switch

                                    while (loop3) { // Boucle pour le choix de reduction
                                        switch (clavier3) {
                                            case "Q":
                                            case "q": // Option pour Quitter
                                                System.out.println();
                                                System.out.println( BLEU + "Vous avez choisi Quitter");
                                                System.out.println( BLEU + "Êtes-vous sûr ? "+ ROUGE +"(Oui/Non)");

                                                choixQ3 = clavier.nextLine();

                                                while (!(choixQ3.equalsIgnoreCase("Oui")  || choixQ3.equalsIgnoreCase("Non"))) {
                                                    System.out.println(BLEU + "Entrez une valeur reconnue "+ ROUGE+"(Oui/Non):");
                                                    choixQ3 = clavier.nextLine(); // Si l'utilisateur entre une valeur non-reconnu
                                                }

                                                if (choixQ3.equalsIgnoreCase("Oui")) { // Si l'utilisateur confirme
                                                    System.out.println("Vous avez quitté.");
                                                    loop3 = false; // Fin de la boucle de sélection de la réduction
                                                    debut = false;
                                                } else if (choixQ3.equalsIgnoreCase("Non")) { // Si l'utilisateur ne confirme pas
                                                    System.out.println("\nRetour au menu principal...\n");
                                                    loop3 = false; // Fin de la boucle de sélection de la réduction
                                                }
                                                break;
                                            case "1", "2": // Prix pour Enfant et Étudiant
                                                prix2 = 4.25;
                                                break;
                                            case "3": // Prix pour les 65+
                                                prix2 = 2;
                                                break;
                                            case "A": // Pas de reduction
                                                prix2 = prixA2;
                                                break;

                                            default: // Si l'utilisateur utilise une valeur non-reconnu
                                                System.out.print(BLEU + "Enter une options reconnue:");
                                                clavier3 = clavier.nextLine();
                                        }
                                        if(loop3) {
                                            // RÉCAPITULATIF DE VOTRE ACHAT
                                            System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                            System.out.println(formatLine(BLEU + "     " + BOLD, "RÉCAPITULATIF DE VOTRE ACHAT", largeurTotale));
                                            System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");

                                            System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                            System.out.println(formatLine(VERT, "Type de billet : " + REINITIALISER + "Passage", largeurTotale));
                                            System.out.println(formatLine(VERT, "Réduction : " + REINITIALISER + "Étudiant", largeurTotale));
                                            System.out.println(formatLine(VERT, "Prix avant rabais: " + REINITIALISER + prixA2 +"$", largeurTotale));
                                            System.out.println(formatLine(VERT, "Prix après rabais : " + REINITIALISER + prix2 + " $", largeurTotale));
                                            System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");
                                            // Tax
                                            System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                            System.out.println(formatLine(VERT, "TPS (5%) : " + REINITIALISER + String.format("%.2f", prix2 * tps) + "$", largeurTotale));
                                            System.out.println(formatLine(VERT, "TVQ (9.975%) : " + REINITIALISER + String.format("%.2f", prix2 * tvq) + "$", largeurTotale));
                                            System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");
                                            // Prix Final
                                            System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                            System.out.println(formatLine(ROUGE + BOLD, "PRIX FINAL : " + REINITIALISER + String.format("%.2f", (prix2 + (prix2 * tps) + (prix2 * tvq))) + "$", largeurTotale));
                                            System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");
                                            // Menu Payement
                                            System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                            System.out.println(formatLine(BLEU + "               " + BOLD, "PAYEMENT", largeurTotale));
                                            System.out.println(formatLine(BLEU + BOLD, "           Entrer Le montant", largeurTotale));
                                            System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");

                                            double montant2 = (prix2 + (prix2 * tps) + (prix2 * tvq)); // montant a payer
                                            double montantPayer2 = clavier.nextDouble(); // montant payee
                                            double epsilon = 0.01; // Définir une petite tolérance

                                            if (Math.abs(montantPayer2 - montant2) < epsilon) { // si l'utilisateur paie le montant exact +- 0.01.
                                                System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                                System.out.println(formatLine(BLEU + "     " + BOLD, "Merci d'avoir utilisée la STM", largeurTotale));
                                                System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");
                                            } else if (montantPayer2 > montant2) { // Si l'utilisateur paie plus que le montant
                                                System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                                System.out.println(formatLine(VERT + BOLD, "Voici Votre Monnaie : " + REINITIALISER + String.format("%.2f", (montantPayer2 - montant2)) + "$", largeurTotale));
                                                System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");
                                                System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                                System.out.println(formatLine(BLEU + "     " + BOLD, "Merci d'avoir utilisée la STM", largeurTotale));
                                                System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");
                                            } else {
                                                while (montantPayer2 < montant2) { // Boucle pour que si l'utilisateur paie moins que le montant
                                                    System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                                    System.out.println(formatLine(ROUGE + BOLD, " Veuillez payer le montant total", largeurTotale));
                                                    System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");
                                                    montantPayer2 = clavier.nextDouble();
                                                }
                                                // Message Merci
                                                System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                                System.out.println(formatLine(BLEU + "     " + BOLD, "Merci d'avoir utilisée la STM", largeurTotale));
                                                System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");
                                            }
                                            loop3 = false; // Fin de la boucle de sélection de la réduction
                                            debut = false;
                                        }
                                    }
                                    loop1 = false; // Fin de la boucle de choix de billets
                                    break;

                                case "3": // choix pour 10 passages
                                    //menu reduction
                                    System.out.println();
                                    System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                    System.out.println(formatLine(BLEU + "        " + BOLD, "BIENVENUE À LA STM", largeurTotale));
                                    System.out.println(formatLine(BLEU, " Choisissez votre réduction :", largeurTotale));
                                    System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");

                                    System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                    System.out.println(formatLine(VERT + " 1 - " + REINITIALISER, "Enfant", largeurTotale));
                                    System.out.println(formatLine(VERT + " 2 - " + REINITIALISER, "Étudiant", largeurTotale));
                                    System.out.println(formatLine(VERT + " 3 - " + REINITIALISER, "+65 ans", largeurTotale));
                                    System.out.println(formatLine(VERT + " A - " + REINITIALISER, "Aucune réduction", largeurTotale));
                                    System.out.println(formatLine(VERT + " Q - " + REINITIALISER, "Quitter", largeurTotale));
                                    System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");

                                    System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                    System.out.println(formatLine(BLEU, " Choisissez le type de réduction :", largeurTotale));
                                    System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");

                                    clavier3 = clavier.nextLine();

                                    float prixA3 = 30f; // prix avant rabais
                                    double prix3 = 0.0; // prix à définir dans le switch

                                    while (loop3) { // Boucle pour le choix de reduction
                                        switch (clavier3) {
                                            case "Q":
                                            case "q": // Option pour quitter
                                                System.out.println();
                                                System.out.println( BLEU + "Vous avez choisi "+BOLD+"Quitter");
                                                System.out.println( BLEU + "Êtes-vous sûr ? "+ ROUGE +"(Oui/Non)");

                                                choixQ4 = clavier.nextLine(); // confirmation pour quitter

                                                // Si l'utilisateur entre une valeur non-reconnu
                                                while (!(choixQ4.equalsIgnoreCase("Oui")  || choixQ4.equalsIgnoreCase("Non"))) {
                                                    System.out.println("Entrez une valeur reconnue (Oui/Non):");
                                                    choixQ4 = clavier.nextLine();
                                                }

                                                if (choixQ4.equalsIgnoreCase("Oui")) { // Si l'utilisateur confirme
                                                    System.out.println("Vous avez quitté.");
                                                    loop3 = false; // Fin de la boucle de sélection de la réduction
                                                    debut = false;
                                                } else if (choixQ4.equalsIgnoreCase("Non")) { // Si l'utilisateur ne confirme pas
                                                    System.out.println("\nRetour au menu principal\n");
                                                    loop3 = false; // Fin de la boucle de sélection de la réduction
                                                }
                                                break;
                                            case "1", "2": // Prix pour Enfants et Étudiants
                                                prix3 = 19.00;
                                                break;

                                            case "3": // Prix pour les 65+
                                                prix3 = 9.00;
                                                break;

                                            case "A": // Aucune reduction
                                                prix3 = prixA3;
                                                break;

                                            default: // S l'utilisateur entre une valeur non-reconnu
                                                System.out.print(BLEU +"Enter une options reconnue:");
                                                clavier3 = clavier.nextLine();
                                        }
                                        if(loop3) {
                                            // RÉCAPITULATIF DE VOTRE ACHAT
                                            System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                            System.out.println(formatLine(BLEU + "     " + BOLD, "RÉCAPITULATIF DE VOTRE ACHAT", largeurTotale));
                                            System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");

                                            System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                            System.out.println(formatLine(VERT, "Type de billet : " + REINITIALISER + "Passage", largeurTotale));
                                            System.out.println(formatLine(VERT, "Réduction : " + REINITIALISER + "Étudiant", largeurTotale));
                                            System.out.println(formatLine(VERT, "Prix avant rabais: " + REINITIALISER + prixA3 +"$", largeurTotale));
                                            System.out.println(formatLine(VERT, "Prix après rabais : " + REINITIALISER + prix3 + " $", largeurTotale));
                                            System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");
                                            // tax
                                            System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                            System.out.println(formatLine(VERT, "TPS (5%) : " + REINITIALISER + String.format("%.2f", prix3 * tps) + "$", largeurTotale));
                                            System.out.println(formatLine(VERT, "TVQ (9.975%) : " + REINITIALISER + String.format("%.2f", prix3 * tvq) + "$", largeurTotale));
                                            System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");
                                            // prix final
                                            System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                            System.out.println(formatLine(ROUGE + BOLD, "PRIX FINAL : " + REINITIALISER + String.format("%.2f", (prix3 + (prix3 * tps) + (prix3 * tvq))) + "$", largeurTotale));
                                            System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");
                                            //Menu payement
                                            System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                            System.out.println(formatLine(BLEU + "               " + BOLD, "PAYEMENT", largeurTotale));
                                            System.out.println(formatLine(BLEU + BOLD, "           Entrer Le montant", largeurTotale));
                                            System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");

                                            double montant3 = (prix3 + (prix3 * tps) + (prix3 * tvq)); // montant a payer
                                            double montantPayer3 = clavier.nextDouble(); // montant payee
                                            double epsilon = 0.01; // Définir une petite tolérance

                                            if (Math.abs(montantPayer3 - montant3) < epsilon) { // Si l'utilisateur paie le montant exact +- 0.01.
                                                System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                                System.out.println(formatLine(BLEU + "     " + BOLD, "Merci d'avoir utilisée la STM", largeurTotale));
                                                System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");
                                            } else if (montantPayer3 > montant3) { // Si l'utilisateur paie plus que le montant
                                                System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                                System.out.println(formatLine(VERT + BOLD, "Voici Votre Monnaie : " + REINITIALISER + String.format("%.2f", (montantPayer3 - montant3)) + "$", largeurTotale));
                                                System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");
                                                System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                                System.out.println(formatLine(BLEU + "     " + BOLD, "Merci d'avoir utilisée la STM", largeurTotale));
                                                System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");
                                            } else {
                                                while (montantPayer3 < montant3) { // Boucle si l'utilisateur paie moins que le montant
                                                    System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                                    System.out.println(formatLine(ROUGE + BOLD, " Veuillez payer le montant total", largeurTotale));
                                                    System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");
                                                    montantPayer3 = clavier.nextDouble();
                                                }
                                                // Message merci
                                                System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                                System.out.println(formatLine(BLEU + "     " + BOLD, "Merci d'avoir utilisée la STM", largeurTotale));
                                                System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");
                                            }
                                            loop3 = false; // Fin de la boucle de sélection de la réduction
                                            debut = false;
                                        }
                                    }
                                    loop1 = false; // fin de la boucle de choix de billets
                                    break;

                                default: // Si l'utilisateur utilise une valeur non-reconnu
                                    System.out.println("Enter une option reconnu: ");
                                    clavier2 = clavier.nextLine();
                                    break;
                            }
                        }
                        loop2 = false; // Fin de la boucle de sélection de la catégorie
                        break;
                    // Choix Soiree
                    case "S":
                    case "s":
                        // Menu Soiree
                        System.out.println(BLEU + "        Vous avez choisi " + BOLD + "Soiree" + REINITIALISER);
                        System.out.println();
                        System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                        System.out.println(formatLine(BLEU + "        " + BOLD, "BIENVENUE À LA STM", largeurTotale));
                        System.out.println(formatLine(BLEU, " Soiree", largeurTotale));
                        System.out.println(formatLine(BLEU, " Journée ou Weekend", largeurTotale));
                        System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");

                        System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                        System.out.println(formatLine(VERT + " 1 - " + REINITIALISER, " Soiree illimitées -  5.00$", largeurTotale));
                        System.out.println(formatLine(VERT + " 2 - " + REINITIALISER, " 1 jour -  6.50$", largeurTotale));
                        System.out.println(formatLine(VERT + " 3 - " + REINITIALISER, " Weekend illimitées -  14.00$", largeurTotale));
                        System.out.println(formatLine(VERT + " 4 - " + REINITIALISER, " 3 jours -  20.00$", largeurTotale));
                        System.out.println(formatLine(VERT + " Q - " + REINITIALISER, " Quitter", largeurTotale));
                        System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");

                        System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                        System.out.println(formatLine(BLEU, " Choisissez une catégorie d'abonnement :", largeurTotale));
                        System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");

                        clavier4 = clavier.nextLine(); // lecture du choix de la catégorie d'abonnement

                        String typeSoiree = "";
                        double prixAPayer = 0.0;

                        while (loopSoiree) { // Debut de la boucle pour le choix de la catégorie d'abonnement
                            switch (clavier4) {
                                case "Q":
                                case "q": // Choix pour quitter
                                    System.out.println();
                                    System.out.println(BLEU + "Vous avez choisi " + BOLD + "Quitter");
                                    System.out.println(BLEU + "Êtes-vous sûr ? " + ROUGE + "(Oui/Non)");

                                    choixQ5 = clavier.nextLine(); // Confirmation pour quitter

                                    while (!(choixQ5.equalsIgnoreCase("Oui") || choixQ5.equalsIgnoreCase("Non"))) { // Si l'utilisateur utilise une option non-reconnu
                                        System.out.println("Entrez une valeur reconnue (Oui/Non):");
                                        choixQ5 = clavier.nextLine();
                                    }
                                    if (choixQ5.equalsIgnoreCase("Oui")) { // si l'utilisateur confirme
                                        System.out.println("Vous avez quitté.");
                                        loopSoiree = false;
                                        debut = false;
                                    } else if (choixQ5.equalsIgnoreCase("Non")) { // Si l'utilisateur ne confirme pas
                                        System.out.println("\nRetour au menu principal\n");
                                        loopSoiree = false;
                                    }
                                    break;
                                case "1": // Soiree illimitée
                                    typeSoiree = "Soirée illimitées";
                                    prixAPayer = 5.00;
                                    break;
                                case "2": // 1 jour
                                    typeSoiree = "1 jour";
                                    prixAPayer = 6.50;
                                    break;
                                case "3": // Weekend illimitée
                                    typeSoiree = "Fin de semaine illimité";
                                    prixAPayer = 14.00;
                                    break;
                                case "4": // 3 jours
                                    typeSoiree = "3 jours";
                                    prixAPayer = 20.00;
                                    break;

                                default: // Si l'utilisateur utilise une valeur non-reconnue
                                    System.out.print(BLEU + "Enter une options reconnue:");
                                    clavier1 = clavier.nextLine();
                                    break;
                            }
                            if(loopSoiree) {
                                System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                System.out.println(formatLine(BLEU, "Choisissez le nombre de titres :", largeurTotale));
                                System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");

                                int titre = clavier.nextInt(); // Le nombre de titres
                                // RÉCAPITULATIF DE VOTRE ACHAT
                                System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                System.out.println(formatLine(BLEU + "     " + BOLD, "RÉCAPITULATIF DE VOTRE ACHAT", largeurTotale));
                                System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");

                                System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                System.out.println(formatLine(VERT, "Type de billet : " + REINITIALISER + "Soirée", largeurTotale));
                                System.out.println(formatLine(VERT, "Type de titre: " + REINITIALISER + typeSoiree, largeurTotale));
                                System.out.println(formatLine(VERT, "Prix du titre : " + REINITIALISER + prixAPayer +"$", largeurTotale));
                                System.out.println(formatLine(VERT, "Quantité : " + REINITIALISER + titre, largeurTotale));
                                System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");
                                // tax
                                System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                System.out.println(formatLine(VERT, "TPS (5%) : " + REINITIALISER + String.format("%.2f", (titre * prixAPayer) * tps) + "$", largeurTotale));
                                System.out.println(formatLine(VERT, "TVQ (9.975%) : " + REINITIALISER + String.format("%.2f", (titre * prixAPayer) * tvq) + "$", largeurTotale));
                                System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");
                                // Prix final
                                System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                System.out.println(formatLine(ROUGE + BOLD, "PRIX FINAL : " + REINITIALISER + String.format("%.2f", (titre * prixAPayer + (titre * prixAPayer * tps) + (titre * prixAPayer * tvq))) + "$", largeurTotale));
                                System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");
                                // Menu Payement
                                System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                System.out.println(formatLine(BLEU + "               " + BOLD, "PAYEMENT", largeurTotale));
                                System.out.println(formatLine(BLEU + BOLD, "           Entrer Le montant", largeurTotale));
                                System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");

                                double montant4 = (titre * prixAPayer + (titre * prixAPayer * tps) + (titre * prixAPayer * tvq)); // montant a payer
                                double montantPayer4 = clavier.nextDouble(); // montant payee
                                double epsilon = 0.01; // Définir une petite tolérance

                                if (Math.abs(montantPayer4 - montant4) < epsilon) { // si l'utilisateur paie le montant exact +- 0.01.
                                    System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                    System.out.println(formatLine(BLEU + "     " + BOLD, "Merci d'avoir utilisée la STM", largeurTotale)); // Message Merci
                                    System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");
                                } else if (montantPayer4 > montant4) { // Si l'utilisateur paie plus que le montant
                                    System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                    System.out.println(formatLine(VERT + BOLD, "Voici Votre Monnaie : " + REINITIALISER + String.format("%.2f", (montantPayer4 - montant4)) + "$", largeurTotale));
                                    System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");
                                    System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                    System.out.println(formatLine(BLEU + "     " + BOLD, "Merci d'avoir utilisée la STM", largeurTotale));
                                    System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");
                                } else { // si l'utilisateur paie moins que le montant
                                    while (montantPayer4 < montant4) {
                                        System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                        System.out.println(formatLine(ROUGE + BOLD, " Veuillez payer le montant total", largeurTotale));
                                        System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");
                                        montantPayer4 = clavier.nextDouble();
                                    }
                                    // Message Merci
                                    System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                    System.out.println(formatLine(BLEU + "     " + BOLD, "Merci d'avoir utilisée la STM", largeurTotale));
                                    System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");
                                }
                                debut = false; // Fin de la boucle
                                loopSoiree = false;// Fin de la boucle
                            }
                        }
                        loop2 = false; // Fin de la boucle de sélection de la catégorie
                        break;
                    // Choix Navette
                    case "N":
                    case "n":
                        double prixUnitaire = 10.00; // Prix unitaire

                        System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                        System.out.println(formatLine(BLEU, " Entrer le nombre de passage voulu", largeurTotale));
                        System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");

                        quantite = clavier.nextInt(); // Quantité de passage voulu

                        System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                        System.out.println(formatLine(BLEU + "     " + BOLD, "RÉCAPITULATIF DE VOTRE ACHAT", largeurTotale));
                        System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");

                        System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                        System.out.println(formatLine(VERT, "Type de billet : " + REINITIALISER + "Navette", largeurTotale));
                        System.out.println(formatLine(VERT, "Prix du titre : " + REINITIALISER + prixUnitaire +"$", largeurTotale));
                        System.out.println(formatLine(VERT, "Quantité : " + REINITIALISER + quantite, largeurTotale));
                        System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");
                        // tax
                        System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                        System.out.println(formatLine(VERT, "TPS (5%) : " + REINITIALISER + String.format("%.2f", (quantite * prixUnitaire) * tps) + "$", largeurTotale));
                        System.out.println(formatLine(VERT, "TVQ (9.975%) : " + REINITIALISER + String.format("%.2f", (prixUnitaire * quantite) * tvq) + "$", largeurTotale));
                        System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");
                        // Prix Final
                        System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                        System.out.println(formatLine(ROUGE + BOLD, "PRIX FINAL : " + REINITIALISER + String.format("%.2f", (quantite * prixUnitaire + (quantite * prixUnitaire * tps) + (quantite * prixUnitaire * tvq))) + "$", largeurTotale));
                        System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");
                        // Menu Payement
                        System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                        System.out.println(formatLine(BLEU + "               " + BOLD, "PAYEMENT", largeurTotale));
                        System.out.println(formatLine(BLEU + BOLD, "           Entrer Le montant", largeurTotale));
                        System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");

                        double montant5 = (quantite * prixUnitaire + (quantite * prixUnitaire * tps) + (quantite * prixUnitaire * tvq)); // montant a payer
                        double montantPayer5 = clavier.nextDouble(); // montant payee
                        double epsilon = 0.01; // Définir une petite tolérance

                        if (Math.abs(montantPayer5 - montant5) < epsilon) { // Si l'utilisateur paie le montant exact +- 0.01.
                            System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                            System.out.println(formatLine(BLEU + "     " + BOLD, "Merci d'avoir utilisée la STM", largeurTotale)); // Message merci
                            System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");
                        } else if (montantPayer5 > montant5) { // Si l'utilisateur paie plus que le montant
                            System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                            System.out.println(formatLine(VERT + BOLD, "Voici Votre Monnaie : " + REINITIALISER + String.format("%.2f", (montantPayer5 - montant5)) + "$", largeurTotale));
                            System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");
                            System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                            System.out.println(formatLine(BLEU + "     " + BOLD, "Merci d'avoir utilisée la STM", largeurTotale));
                            System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");
                        } else {
                            while (montantPayer5 < montant5) { // Boucle si l'utilisateur paie moins que le montant
                                System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                                System.out.println(formatLine(ROUGE + BOLD, " Veuillez payer le montant total", largeurTotale));
                                System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");
                                montantPayer5 = clavier.nextDouble();
                            }
                            // message merci
                            System.out.println(CYAN + "╔" + "═".repeat(largeurTotale) + "╗");
                            System.out.println(formatLine(BLEU + "     " + BOLD, "Merci d'avoir utilisée la STM", largeurTotale));
                            System.out.println(CYAN + "╚" + "═".repeat(largeurTotale) + "╝");
                        }

                        loop2 = false; // Fin de la boucle de sélection de la catégorie
                        debut = false; // Fin du loop
                        break;

                    case "Q":
                    case "q": // Option pour quitter
                        System.out.println();
                        System.out.println( BLEU + "Vous avez choisi "+BOLD+"Quitter");
                        System.out.println( BLEU + "Êtes-vous sûr ? "+ ROUGE +"(Oui/Non)");

                        choixQ6 = clavier.nextLine(); // Confirmation de quitter

                        while (!(choixQ6.equalsIgnoreCase("Oui")  || choixQ6.equalsIgnoreCase("Non"))) { // Si l'utilisateur utilise une valeur non-reconnu
                            System.out.println("Entrez une valeur reconnue (Oui/Non):");
                            choixQ6 = clavier.nextLine();
                        }
                        if (choixQ6.equalsIgnoreCase("Oui")) { // Si l'utilisateur confirme
                            System.out.println("Vous avez quitté.");
                            loop2 = false; // Fin de la boucle de sélection de la catégorie
                            debut = false;
                        } else if (choixQ6.equalsIgnoreCase("Non")) { // Si l'utilisateur ne confirme pas
                            System.out.println("\nRetour au menu principal\n");
                            loop2 = false; // fin de la boucle de sélection de la catégorie
                        }
                        break;

                    default: // Si l'utilisateur utilise une valeur non-reconnu
                        System.out.print(BLEU +"Enter une options reconnue:");
                        clavier1 = clavier.nextLine();
                }
            }
        }
    }
}
