import java.util.ArrayList;
import java.util.Optional;

/*
3.1.2
Décrivez et expliquez le fonctionnement de ces classes. Comment pourraient-elles être utilisées ?
Reponse : voir les exercices suivant
 */

/**
 * Cette classe contient la méthode principale (point d'entrée du programme) et des méthodes génériques pour démontrer
 * l'utilisation des classes PeutEtre, QQChose, Rien, et d'une méthode pour générer des valeurs intermédiaires.
 */
public class Principal {

    /**
     * La méthode principale du programme qui démontre l'utilisation des classes PeutEtre, QQChose, Rien, et de la méthode
     * pour générer des valeurs intermédiaires.
     *
     * @param args Les arguments de ligne de commande (non utilisés dans cet exemple).
     */
    public static void main(String[] args) {
        Integer[] tableau = new Integer[]{1,2,3,4,5,6};
        PeutEtre<Integer> peutEtre = trouverElement(tableau, 3);
        if(peutEtre.estQQChose()) {
            QQChose<Integer> qqc = (QQChose<Integer>) peutEtre;
            System.out.println(qqc.valeur);
        }


        Optional<Integer> opt = trouverElementAvecOptional(tableau, 3);
        if(opt.isPresent()) {
            System.out.println(opt.get());
        }

        ArrayList<Double> resultat = tweens(10, 38, 100);
        for (int i=0; i<resultat.size();i++){
            System.out.printf(resultat.get(i) + ", ");
        }
        System.out.println();
    }

    /**
     * Recherche un élément de type T dans un tableau générique et renvoie un PeutEtre contenant l'index de l'élément trouvé ou Rien s'il n'est pas trouvé.
     *
     * @param <T>       Le type d'élément à rechercher.
     * @param a_tableau Le tableau générique dans lequel effectuer la recherche.
     * @param a_element L'élément à rechercher dans le tableau.
     * @return Un PeutEtre contenant l'index de l'élément ou Rien s'il n'est pas trouvé.
     */
    public static <T> PeutEtre<Integer> trouverElement( T[] a_tableau, T a_element ){
        int index = 0;
        T element;
        PeutEtre<Integer> resultat;
        while ( index < a_tableau.length && (element = a_tableau[index]) != a_element ){
            index++;
        }
        if(index < a_tableau.length){
            resultat = new QQChose<>(index);
        }else{
            resultat = new Rien<>();
        }
        return resultat;
    }

    /*
    //### Peut-etre plus simple à lire pour des débutants, mais trop de logique pour rien ###
    public static <T> PeutEtre<Integer> trouverElement( T[] a_tableau, T a_element ) {
        PeutEtre<Integer> resultat;
        int index = 0;
        T element;
        if(a_tableau.length > 0) {
            element = a_tableau[index];
            while( index + 1 < a_tableau.length && element != a_element ){
                index = index + 1; // ou index++, ou ++index, ou index += 1;
                element = a_tableau[index];
            }
            if(index + 1 < a_tableau.length){
                resultat = new QQChose<>(index);
            }else{
                resultat = new Rien<>();
            }
        }else{
            resultat = new Rien<>();
        }
        return resultat;
    }
    */

    /**
     * Recherche un élément de type T dans un tableau générique et renvoie un Optional contenant l'index de l'élément trouvé ou empty() s'il n'est pas trouvé.
     *
     * @param <T>       Le type d'élément à rechercher.
     * @param a_tableau Le tableau générique dans lequel effectuer la recherche.
     * @param a_element L'élément à rechercher dans le tableau.
     * @return Un Optional contenant l'index de l'élément ou empty() s'il n'est pas trouvé.
     */
    public static <T> Optional<Integer> trouverElementAvecOptional(T[] a_tableau, T a_element ){
        int index = 0;
        T element;
        Optional<Integer> resultat;
        while ( index < a_tableau.length && (element = a_tableau[index]) != a_element ){
            index++;
        }
        if(index < a_tableau.length){
            resultat = Optional.of(index);
        }else{
            resultat = Optional.empty();
        }
        return resultat;
    }

    /**
     * Génère une liste d'intervalles de valeurs entre deux nombres (départ et fin) en fonction du nombre d'intervalles spécifié.
     *
     * @param depart      La valeur de départ de l'interval.
     * @param fin         La valeur de fin de l'interval.
     * @param nbrInterval Le nombre d'intervalles à générer.
     * @return Une ArrayList contenant les valeurs intermédiaires générées.
     */
    public static ArrayList<Double> tweens( double depart, double fin, int nbrInterval ){
        ArrayList<Double> resultat = new ArrayList<>();
        double diff = (fin - depart) / nbrInterval;
        for (int i = 0; i<nbrInterval+1;i++){
            resultat.add(depart + diff * i);
        }
        return resultat;
    }
}