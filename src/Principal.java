import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

/*
3.1.2
Décrivez et expliquez le fonctionnement de ces classes. Comment pourraient-elles être utilisées ?
Reponse : voir les exercices suivant
 */
public class Principal {
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

    public static ArrayList<Double> tweens( double depart, double fin, int nbrInterval ){
        ArrayList<Double> resultat = new ArrayList<>();
        double diff = (fin - depart) / nbrInterval;
        for (int i = 0; i<nbrInterval+1;i++){
            resultat.add(depart + diff * i);
        }
        return resultat;
    }
}