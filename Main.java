import java.io.*;
import java.util.*;

public class TP2 {
    // Variable globale pour contrôler le menu principal
    public static int menuPrincipal = 0 ;

    // Codes ANSI pour la mise en forme de texte (couleurs, gras)
    public static final String REINITIALISER = "\u001B[0m"; // Methode réinitialiser couleur
    public static final String BOLD = "\u001B[1m"; // Methode caractère BOLD
    public static final String VERT = "\u001B[32m"; // Methode Couleur Vert
    public static final String ROUGE = "\u001B[31m"; // Methode Couleur Rouge

    public static int choixMenu;

    // La méthode stripAnsiCodes supprime les codes d'échappement ANSI d'une chaîne pour renvoyer du texte brut sans artefacts de formatage
    public static String stripAnsiCodes(String text) {
        return text.replaceAll("\u001B\\[[;\\d]*m", "");
    }
    // La méthode formatLine crée une ligne formatée avec une étiquette et un contenu, en ajoutant des espaces pour atteindre une largeur totale spécifiée tout en supprimant les codes ANSII
    public static String formatLine(String label, String content, int totalWidth) {
        String text = label + content;
        int longueurVisible = stripAnsiCodes(text).length();
        int rembourrageNecessaire = totalWidth - longueurVisible;
        return ROUGE + "║" + REINITIALISER + text + " ".repeat(Math.max(0, rembourrageNecessaire)) + ROUGE + "║" + REINITIALISER;
    }
    public static void main(String[] args) {
        // Scanner pour lire les entrées de l'utilisateur
        Scanner scanner = new Scanner(System.in);
        // Tableau de données initiales
        String[] tabDonnees = {
                "780;8", "625;6", "450;3", "557;4", "671;7", "457;3", "456;3", "480;4", "685;6"
        };
        double[][] data = null; // Tableau pour stocker les données formatées

        // Boucle principale pour le menu
        while (menuPrincipal != 3) {
            afficherMenuPrincipal();  // Affiche les options du menu principal
            menuPrincipal = scanner.nextInt(); // Lit le choix de l'utilisateur

            // Gère le choix de l'utilisateur dans le menu principal (switch)
            switch(menuPrincipal) {
                case 1:
                    // Lecture des données depuis le tableau
                data = parseData(tabDonnees);
                executerMenuSecondaire(scanner, data);
                break;
                case 2:
                    // Lecture des données depuis un fichier
                data = getDonnees("donnees.csv");
                executerMenuSecondaire(scanner, data);
                break;
                case 3:
                    // Quitter le programme
                    System.out.println(ROUGE + "╔" + "═".repeat(40) + "╗");
                    System.out.println(formatLine(VERT + BOLD, "  Merci d'avoir utilisée le programme", 40));
                    System.out.println(ROUGE + "╚" + "═".repeat(40) + "╝" + REINITIALISER);
                break;
                default:
                    // Gestion d'une entrée invalide
                System.out.println(ROUGE + "╔" + "═".repeat(40) + "╗");
                System.out.println(formatLine(ROUGE + BOLD, "  Choix invalide. Veuillez réessayer", 40));
                System.out.println(ROUGE + "╚" + "═".repeat(40) + "╝" + REINITIALISER);
                break;
            }
        }
        if (menuPrincipal == 3 && choixMenu == 6) {
        } else {
            resultasFichier(data);
        }
    }
    // Affiche les options du menu principal
    public static void afficherMenuPrincipal() {
        System.out.println(ROUGE + "╔" + "═".repeat(75) + "╗");
        System.out.println(formatLine(VERT + BOLD, "  Menu Principale", 75));
        System.out.println(ROUGE + "╠" + "═".repeat(75) + "╣");
        System.out.println(formatLine("", "  1- Lire les données à partir du tableau", 75));
        System.out.println(formatLine("", "  2- Lire les données à partir du fichier donnees.csv", 75));
        System.out.println(formatLine("", "  3- Quitter", 75));
        System.out.println(ROUGE + "╚" + "═".repeat(75) + "╝");
        System.out.println(ROUGE + "╔" + "═".repeat(75) + "╗");
        System.out.println(formatLine("", "  Veuillez entrer votre choix :", 75));
        System.out.println(ROUGE + "╚" + "═".repeat(75) + "╝");
    }
    // Exécute les fonctionnalités du menu secondaire
    public static void executerMenuSecondaire(Scanner scanner, double[][] data) {
        choixMenu = 0; // Variable pour stocker le choix de l'utilisateur
        boolean fin = false; // Contrôle la fin du menu secondaire
        while (choixMenu != 6 && !fin) {
            afficherMenuSecondaire(); // Affiche les options du menu secondaire
            choixMenu = scanner.nextInt(); // Lit le choix de l'utilisateur

            // Gère les choix du menu secondaire
            switch (choixMenu) {
                case 1:
                    // Calcul des statistiques pour x
                    printStats(data[0], "x");
                    fin = true;
                    break;
                case 2:
                    // Calcul des statistiques pour y
                    printStats(data[1], "y");
                    fin = true;
                    break;
                case 3:
                    // Calcul de la régression linéaire
                    double[] params = regressionLineaire(data[0], data[1]);
                    System.out.println(ROUGE + "╔" + "═".repeat(75) + "╗");
                    System.out.println(formatLine("", String.format("  L’équation de la droite de régression : y = %.4f + %.4f x", params[0], params[1]), 75));
                    System.out.println(ROUGE + "╚" + "═".repeat(75) + "╝");
                    fin = true;
                    break;
                case 4:
                    // Prédiction de y pour une valeur donnée de x
                    System.out.println(ROUGE + "╔" + "═".repeat(75) + "╗");
                    System.out.println(formatLine("", "  Veuillez entrer une valeur pour x (> 0) :", 75));
                    System.out.println(ROUGE + "╚" + "═".repeat(75) + "╝");
                    double x = scanner.nextDouble();
                    while (x <= 0) {
                        // Validation de l'entrée pour x
                        System.out.println(ROUGE + "╔" + "═".repeat(75) + "╗");
                        System.out.println(formatLine("", "  x doit être supérieur à 0. Réessayez :", 75));
                        System.out.println(ROUGE + "╚" + "═".repeat(75) + "╝");
                        x = scanner.nextDouble();
                    }
                    double[] parameters = regressionLineaire(data[0], data[1]);
                    double y = parameters[0] + parameters[1] * x;
                    if (y < 0) { // Assure que y est au moins égal à 0
                        y = 0;
                    }
                    System.out.println(ROUGE + "╔" + "═".repeat(75) + "╗");
                    System.out.println(formatLine("", String.format("  Pour x = %.2f, y est estimé à %.4f", x, y), 75));
                    System.out.println(ROUGE + "╚" + "═".repeat(75) + "╝");
                    fin = true;
                    break;
                case 5:
                    // Calcul du coefficient de corrélation
                    double r = calculerCoeffCorrelation(data[0], data[1]);
                    System.out.println(ROUGE + "╔" + "═".repeat(75) + "╗");
                    System.out.println(formatLine("", String.format("  Le coefficient de corrélation est : %.4f", r), 75));
                    System.out.println(ROUGE + "╚" + "═".repeat(75) + "╝" + REINITIALISER);
                    fin = true;
                    break;
                case 6:
                    // Quitter le programme
                    menuPrincipal = 3;
                    System.out.println(ROUGE + "╔" + "═".repeat(40) + "╗");
                    System.out.println(formatLine(VERT + BOLD, "  Merci d'avoir utilisée le programme", 40));
                    System.out.println(ROUGE + "╚" + "═".repeat(40) + "╝" + REINITIALISER);
                    break;
                default:
                    // Gestion d'une entrée invalide
                    System.out.println(ROUGE + "╔" + "═".repeat(40) + "╗");
                    System.out.println(formatLine(ROUGE + BOLD, "  Choix invalide. Veuillez réessayer", 40));
                    System.out.println(ROUGE + "╚" + "═".repeat(40) + "╝" + REINITIALISER);
                    break;
            }
        }
        menuPrincipal = 3; // Réinitialise le menu principal après le menu secondaire
    }
    public static void afficherMenuSecondaire() {
        System.out.println(ROUGE + "╔" + "═".repeat(75) + "╗");
        System.out.println(formatLine(VERT + BOLD, "  Menu Secondaire", 75));
        System.out.println(ROUGE + "╠" + "═".repeat(75) + "╣");
        System.out.println(formatLine("", "  1- Calculer la moyenne (x), la médiane(m) et l’écart type(s) de x", 75));
        System.out.println(formatLine("", "  2- Calculer la moyenne, la médiane, le mode et l’écart type de y", 75));
        System.out.println(formatLine("", "  3- Déterminer les paramètres de la droite de régression linéaire y = f(x)", 75));
        System.out.println(formatLine("", "  4- Prédire le taux d’abandon (y) selon le nombre d’inscriptions x", 75));
        System.out.println(formatLine("", "  5- Calculer le coefficient de corrélation entre x et y", 75));
        System.out.println(formatLine("", "  6- Quitter", 75));
        System.out.println(ROUGE + "╚" + "═".repeat(75) + "╝");
        System.out.println(ROUGE + "╔" + "═".repeat(75) + "╗");
        System.out.println(formatLine("", "  Veuillez choisir l’une des options :", 75));
        System.out.println(ROUGE + "╚" + "═".repeat(75) + "╝");

    }
    // Parse les données initiales sous forme de tableau de chaînes en un tableau de doubles
    public static double[][] parseData(String[] tabDonnees) {
        double[][] data = new double[2][tabDonnees.length]; // Tableau pour stocker x et y
        for (int i = 0; i < tabDonnees.length; i++) {
            String[] parts = tabDonnees[i].split(";"); // Sépare les données par le point-virgule (;)
            data[0][i] = Double.parseDouble(parts[0]); // Ajoute la valeur x
            data[1][i] = Double.parseDouble(parts[1]); // Ajoute la valeur y
        }
        return data; // Retourne les données parsées
    }
    // Lit les données depuis un fichier CSV et les retourne sous forme d'un tableau de doubles
    public static double[][] getDonnees(String fileName) {
        String line; // Variable pour stocker chaque ligne lue du fichier.
        int length = 0; // Compteur pour déterminer le nombre de lignes dans le fichier.
        double[] xList = null; // Tableau pour stocker les valeurs x
        double[] yList = null; // Tableau pour stocker les valeurs y

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            // Première lecture pour compter le nombre de lignes dans le fichier.
            while ((line = br.readLine()) != null) {
                length++; // Incrémente le compteur pour chaque ligne.
            }
            br.close(); // Ferme le fichier après avoir compté les lignes
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
            // Message d'erreur si un problème survient pendant la lecture.
        }
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            // Deuxième lecture pour extraire les valeurs des lignes.
            xList = new double[length]; // Initialise le tableau pour les x avec la taille du fichier.
            yList = new double[length]; // Initialise le tableau pour les y avec la taille du fichier.

            for (int i = 0; i < length; i++) {
                // Parcourt chaque ligne pour récupérer les données.
                line = br.readLine(); // Lit la ligne suivante.
                String[] parts = line.split(";"); // Sépare les données en deux parties (x et y).
                xList[i] = (Double.parseDouble(parts[0])); // Convertit la première partie en double pour x
                yList[i] = (Double.parseDouble(parts[1])); // Convertit la première partie en double pour y
            }
            br.close(); // Ferme le fichier après la lecture des données.
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
            // Message d'erreur si un problème survient pendant la lecture.
        }

        double[][] data = new double[2][xList.length];
        // Crée un tableau 2D pour stocker les données x et y.

        for (int i = 0; i < xList.length; i++) {
            data[0][i] = xList[i]; // Remplit la première ligne avec les x
            data[1][i] = yList[i]; // Remplit la première ligne avec les y
        }
        return data; // Retourne le tableau 2D contenant les données x et y
    }
    public static void printStats(double[] data, String varName) {
        System.out.println(ROUGE + "╔" + "═".repeat(75) + "╗");
        System.out.println(formatLine(VERT + BOLD, String.format(" Statistiques sur %s", varName), 75));
        System.out.println(ROUGE + "╠" + "═".repeat(75) + "╣");
        System.out.println(formatLine("", String.format(" La moyenne = %.4f", getMoyenne(data)), 75)); // Affiche la moyenne des données.
        System.out.println(formatLine("", String.format(" La médiane = %.4f", getMediane(data)), 75)); // Affiche la médiane des données.
        System.out.println(formatLine("", String.format(" L'écart type = %.4f", getEcartType(data)), 75)); // Affiche l'écart type des données.
        System.out.println(ROUGE + "╚" + "═".repeat(75) + "╝");

        if (varName.equals("y")) {
            System.out.println(ROUGE + "╠" + "═".repeat(75) + "╣");
            System.out.println(formatLine("", String.format( "Le mode = %.4f", getMode(data)), 75)); // Affiche le mode uniquement pour la variable y.
            System.out.println(ROUGE + "╚" + "═".repeat(75) + "╝" + REINITIALISER);
        }
    }
    public static double getMoyenne(double[] data) {
        double sum = 0; // Initialise la somme des valeurs
        for (double val : data) {
            sum += val; // Additionne chaque valeur du tableau
        }
        return sum / data.length; // Retourne la moyenne (somme divisée par le nombre d'éléments)
    }
    public static double getMediane(double[] data) {
        double[] sorted = data.clone(); // Crée une copie du tableau pour le trier
        bubbleSort(sorted); // Trie les données avec un algorithme de tri à bulles
        if (sorted.length % 2 == 0) {
            // Si le nombre d'éléments est pair, retourne la moyenne des deux valeurs centrales
            return (sorted[sorted.length / 2 - 1] + sorted[sorted.length / 2]) / 2.0;
        } else {
            // Si le nombre d'éléments est impair, retourne l'élément central
            return sorted[sorted.length / 2];
        }
    }
    public static void bubbleSort(double[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            // Parcourt les éléments non triés
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Échange les éléments si nécessaire
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    public static double getEcartType(double[] data) {
        double mean = getMoyenne(data); // Calcule la moyenne des données
        double sum = 0; // Initialise la somme des écarts au carré
        for (int i = 0; i < data.length; i++) {
            double val = data[i];  // Accède à l'élément du tableau avec l'indice i
            sum += Math.pow(val - mean, 2);  // Ajoute le carré de l'écart à la somme
        }
        return Math.sqrt(sum / (data.length - 1)); // Retourne l'écart type en prenant la racine carrée de la variance
    }
    public static double getMode(double[] valeurs) {
        double mode = valeurs[0]; // Initialise le mode à la première valeur
        int maxFrequence = 0; // Initialise la fréquence maximale

        for (int i = 0; i < valeurs.length; i++) {
            double valeurCourante = valeurs[i];
            int frequence = 0;

            // Compter la fréquence de `valeurCourante`
            for (int j = 0; j < valeurs.length; j++) {
                if (valeurs[j] == valeurCourante) {
                    frequence++; // Compte les occurrences de la valeur actuelle
                }
            }

            // Mettre à jour le mode si une fréquence plus élevée est trouvée
            if (frequence > maxFrequence) {
                maxFrequence = frequence;
                mode = valeurCourante;
            }
        }
        return mode; // Retourne la valeur la plus fréquente.
    }
    public static double[] regressionLineaire(double[] x, double[] y) {
        double meanX = getMoyenne(x); // Moyenne des x
        double meanY = getMoyenne(y); // Moyenne des y
        double sxx = 0, sxy = 0; // Variables pour calculer les sommes nécessaires

        for (int i = 0; i < x.length; i++) {
            sxx += Math.pow(x[i] - meanX, 2); // Calcul de Sxx
            sxy += (x[i] - meanX) * (y[i] - meanY); // Calcul de Sxy
        }
        double b1 = sxy / sxx; // Pente de la droite de régression
        double b0 = meanY - b1 * meanX; // Ordonnée à l'origine
        return new double[]{b0, b1}; // Retourne les coefficients de la droite
    }
    public static double calculerCoeffCorrelation(double[] x, double[] y) {
        double meanX = getMoyenne(x); // Moyenne des x
        double meanY = getMoyenne(y); // Moyenne des y
        double sxx = 0, syy = 0, sxy = 0; // Variables pour les calculs

        for (int i = 0; i < x.length; i++) {
            sxx += Math.pow(x[i] - meanX, 2); // Sxx
            syy += Math.pow(y[i] - meanY, 2); // Syy
            sxy += (x[i] - meanX) * (y[i] - meanY); // Sxy
        }
        return sxy / Math.sqrt(sxx * syy);
        // Retourne le coefficient de corrélation entre x et y
    }
    public static void resultasFichier(double[][] data) {
        // Utilisation de PrintWriter pour écrire dans un fichier "resultas.txt"
        try (PrintWriter ecrire = new PrintWriter(new FileOutputStream("resultas.txt", false))) {
            switch (choixMenu) {
                case 1:
                    // Calcul et écriture des statistiques pour x
                    ecrire.println("Statistiques pour x:");
                    ecrire.println("Moyenne = " + getMoyenne(data[0]));
                    ecrire.println("Médiane = " + getMediane(data[0]));
                    ecrire.println("Écart-type = " + getEcartType(data[0]));
                    break;
                case 2:
                    // Calcul et écriture des statistiques pour y
                    ecrire.println("Statistiques pour y:");
                    ecrire.println("Moyenne = " + getMoyenne(data[1]));
                    ecrire.println("Médiane = " + getMediane(data[1]));
                    ecrire.println("Écart-type = " + getEcartType(data[1]));
                    ecrire.println("Mode = " + getMode(data[1]));
                    break;
                case 3:
                    // Calcul de la régression linéaire et écriture dans le fichier
                    double[] params = regressionLineaire(data[0], data[1]);
                    ecrire.println(String.format("L’équation de la droite de régression : y = %.4f + %.4f x", params[0], params[1]));
                    break;
                case 4:
                    // Prédiction de y pour une valeur donnée de x et écriture dans le fichier
                    ecrire.println("Prédiction de y:");
                    double[] paramsPrediction = regressionLineaire(data[0], data[1]);
                    double preditY = paramsPrediction[0] + paramsPrediction[1] * 10;  // Exemple pour x = 10
                    if (preditY < 0) preditY = 0;
                    ecrire.println(String.format("Pour x = 10, y prédit = %.4f", preditY));
                    break;
                case 5:
                    // Calcul du coefficient de corrélation et écriture dans le fichier
                    double coeffCorrelation = calculerCoeffCorrelation(data[0], data[1]);
                    ecrire.println("Coefficient de corrélation :");
                    ecrire.println(String.format("Coefficiant de Correlation = %.4f", coeffCorrelation));
                    break;
            }
            // Si tout s'est bien passé
            System.out.println("Les résultats ont été écrits dans le fichier resultas.txt");
        } catch (IOException e) {
            // Si une exception survient lors de l'écriture
            System.err.println("Erreur lors de l'écriture dans le fichier: " + e.getMessage());
        }
    }
}
